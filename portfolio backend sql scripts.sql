-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema portfolio_lh
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema portfolio_lh
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `portfolio_lh` DEFAULT CHARACTER SET utf8 ;
USE `portfolio_lh` ;

-- -----------------------------------------------------
-- Table `portfolio_lh`.`datos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio_lh`.`datos` (
  `id` INT NOT NULL,
  `titleName` VARCHAR(60) NULL,
  `name` VARCHAR(45) NULL,
  `ubicacion` VARCHAR(100) NULL,
  `school` VARCHAR(100) NULL,
  `perfil` VARCHAR(120) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio_lh`.`academica`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio_lh`.`academica` (
  `id` INT NOT NULL,
  `tituloTag` VARCHAR(45) NULL,
  `instituto` VARCHAR(100) NULL,
  `logo` VARCHAR(150) NULL,
  `carrera` VARCHAR(150) NULL,
  `estado` VARCHAR(45) NULL,
  `estadoAnexo` VARCHAR(45) NULL,
  `ingreso` VARCHAR(100) NULL,
  `datos_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_academica_datos1_idx` (`datos_id` ASC),
  CONSTRAINT `fk_academica_datos1`
    FOREIGN KEY (`datos_id`)
    REFERENCES `portfolio_lh`.`datos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio_lh`.`extraCurricular`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio_lh`.`extraCurricular` (
  `id` INT NOT NULL,
  `tipo` VARCHAR(45) NULL,
  `actividad` VARCHAR(120) NULL,
  `academica_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_extraCurricular_academica1_idx` (`academica_id` ASC),
  CONSTRAINT `fk_extraCurricular_academica1`
    FOREIGN KEY (`academica_id`)
    REFERENCES `portfolio_lh`.`academica` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio_lh`.`btnRS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio_lh`.`btnRS` (
  `id` INT NOT NULL,
  `redSocial` VARCHAR(45) NULL,
  `btn` VARCHAR(80) NULL,
  `url` VARCHAR(120) NULL,
  `color` VARCHAR(45) NULL,
  `datos_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_btnRS_datos1_idx` (`datos_id` ASC),
  CONSTRAINT `fk_btnRS_datos1`
    FOREIGN KEY (`datos_id`)
    REFERENCES `portfolio_lh`.`datos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio_lh`.`jobs`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio_lh`.`jobs` (
  `id` INT NOT NULL,
  `job` VARCHAR(90) NULL,
  `cargo` VARCHAR(90) NULL,
  `funciones` VARCHAR(300) NULL,
  `ingresoSalida` VARCHAR(45) NULL,
  `contacto` VARCHAR(100) NULL,
  `datos_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_jobs_datos_idx` (`datos_id` ASC),
  CONSTRAINT `fk_jobs_datos`
    FOREIGN KEY (`datos_id`)
    REFERENCES `portfolio_lh`.`datos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio_lh`.`skillPrograming`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio_lh`.`skillPrograming` (
  `id` INT NOT NULL,
  `tag` VARCHAR(45) NULL,
  `porcentaje` INT NULL,
  `color` VARCHAR(45) NULL,
  `datos_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_skillPrograming_datos1_idx` (`datos_id` ASC),
  CONSTRAINT `fk_skillPrograming_datos1`
    FOREIGN KEY (`datos_id`)
    REFERENCES `portfolio_lh`.`datos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio_lh`.`skillLenguage`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio_lh`.`skillLenguage` (
  `id` INT NOT NULL,
  `tag` VARCHAR(45) NULL,
  `porcentaje` INT NULL,
  `color` VARCHAR(45) NULL,
  `datos_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_skillLenguage_datos1_idx` (`datos_id` ASC),
  CONSTRAINT `fk_skillLenguage_datos1`
    FOREIGN KEY (`datos_id`)
    REFERENCES `portfolio_lh`.`datos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio_lh`.`skillPrograms`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio_lh`.`skillPrograms` (
  `id` INT NOT NULL,
  `tag` VARCHAR(45) NULL,
  `porcentaje` INT NULL,
  `color` VARCHAR(45) NULL,
  `datos_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_skillPrograms_datos1_idx` (`datos_id` ASC),
  CONSTRAINT `fk_skillPrograms_datos1`
    FOREIGN KEY (`datos_id`)
    REFERENCES `portfolio_lh`.`datos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio_lh`.`skillSoft`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio_lh`.`skillSoft` (
  `id` INT NOT NULL,
  `tag` VARCHAR(45) NULL,
  `modal` VARCHAR(200) NULL,
  `beneficio` VARCHAR(200) NULL,
  `porcentaje` INT NULL,
  `datos_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_skillSoft_datos1_idx` (`datos_id` ASC),
  CONSTRAINT `fk_skillSoft_datos1`
    FOREIGN KEY (`datos_id`)
    REFERENCES `portfolio_lh`.`datos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
