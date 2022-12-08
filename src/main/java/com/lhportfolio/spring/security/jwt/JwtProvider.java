
package com.lhportfolio.spring.security.jwt;

import com.lhportfolio.spring.security.entity.UsuarioPrincipal;
import io.jsonwebtoken.*;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class JwtProvider {
        private final static Logger logger = LoggerFactory.getLogger(JwtProvider.class);
        
        @Value("${jwt.secret}")
        private String secret;
        @Value("${jwt.expiration}")
        private int expiration;
        
        //Generacion del token, sin implementar
        
        public String generateToken(Authentication authentication){
            UsuarioPrincipal usuarioPrincipal = (UsuarioPrincipal) authentication.getPrincipal();
            return Jwts.builder().setSubject(usuarioPrincipal.getUsername())
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(new Date().getTime() + expiration*1000))
                    .signWith(SignatureAlgorithm.HS512, secret).compact();
        }
        
        public String getNombreUsuarioFromToken(String token){
            return Jwts.parser().setSigningKey(secret).parseClaimsJws(token)
            .getBody().getSubject();
        }
        
        //validacion del token, 
        //errores de expiracion, mal formado, no soportado, fallo en firma y token vacio
        
        public boolean validateToken(String token){
            try{
                Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
                return true;
            }
            catch(MalformedJwtException e){
            logger.error("token mal formado");
            }
            catch(UnsupportedJwtException e){
            logger.error("token no soportado");
            }
            catch(ExpiredJwtException e){
            logger.error("token expirado");
            }
            catch(SignatureException e){
            logger.error("Fallo en la firma");
            }
            catch(IllegalArgumentException e){
            logger.error("token vacio");
            }
            return false;
        }

}
