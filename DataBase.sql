-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema espacoFit
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema espacoFit
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `espacoFit` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `espacoFit` ;

-- -----------------------------------------------------
-- Table `espacoFit`.`Pais`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `espacoFit`.`Pais` (
  `idPais` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idPais`),
  UNIQUE INDEX `descricao_UNIQUE` (`descricao` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `espacoFit`.`Estado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `espacoFit`.`Estado` (
  `idEstado` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NOT NULL,
  `Pais_idPais` INT NOT NULL,
  PRIMARY KEY (`idEstado`),
  UNIQUE INDEX `descricao_UNIQUE` (`descricao` ASC) VISIBLE,
  INDEX `fk_Estado_Pais1_idx` (`Pais_idPais` ASC) VISIBLE,
  CONSTRAINT `fk_Estado_Pais1`
    FOREIGN KEY (`Pais_idPais`)
    REFERENCES `espacoFit`.`Pais` (`idPais`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `espacoFit`.`Cidade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `espacoFit`.`Cidade` (
  `idCidade` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NOT NULL,
  `Estado_idEstado` INT NOT NULL,
  PRIMARY KEY (`idCidade`),
  UNIQUE INDEX `descricao_UNIQUE` (`descricao` ASC) VISIBLE,
  INDEX `fk_Cidade_Estado1_idx` (`Estado_idEstado` ASC) VISIBLE,
  CONSTRAINT `fk_Cidade_Estado1`
    FOREIGN KEY (`Estado_idEstado`)
    REFERENCES `espacoFit`.`Estado` (`idEstado`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `espacoFit`.`Bairro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `espacoFit`.`Bairro` (
  `idBairro` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NOT NULL,
  `Cidade_idCidade` INT NOT NULL,
  PRIMARY KEY (`idBairro`),
  UNIQUE INDEX `descricao_UNIQUE` (`descricao` ASC) VISIBLE,
  INDEX `fk_Bairro_Cidade1_idx` (`Cidade_idCidade` ASC) VISIBLE,
  CONSTRAINT `fk_Bairro_Cidade1`
    FOREIGN KEY (`Cidade_idCidade`)
    REFERENCES `espacoFit`.`Cidade` (`idCidade`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `espacoFit`.`CEP`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `espacoFit`.`CEP` (
  `idCEP` INT NOT NULL AUTO_INCREMENT,
  `numero` VARCHAR(45) NOT NULL,
  `Bairro_idBairro` INT NOT NULL,
  PRIMARY KEY (`idCEP`),
  UNIQUE INDEX `numero_UNIQUE` (`numero` ASC) VISIBLE,
  INDEX `fk_CEP_Bairro1_idx` (`Bairro_idBairro` ASC) VISIBLE,
  CONSTRAINT `fk_CEP_Bairro1`
    FOREIGN KEY (`Bairro_idBairro`)
    REFERENCES `espacoFit`.`Bairro` (`idBairro`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `espacoFit`.`Aluno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `espacoFit`.`Aluno` (
  `idAluno` INT NOT NULL AUTO_INCREMENT,
  `nomeAluno` VARCHAR(100) NOT NULL,
  `rgAluno` VARCHAR(12) NULL DEFAULT NULL,
  `cpfAluno` VARCHAR(12) NOT NULL,
  `dtNasAluno` DATE NULL DEFAULT NULL,
  `compleEnderecoAluno` VARCHAR(100) NULL DEFAULT NULL,
  `fone1Aluno` VARCHAR(12) NULL DEFAULT NULL,
  `fone2Aluno` VARCHAR(12) NULL DEFAULT NULL,
  `emailAluno` VARCHAR(100) NULL DEFAULT NULL,
  `obsAluno` VARCHAR(100) NULL DEFAULT NULL,
  `CEP_idCEP` INT NOT NULL,
  PRIMARY KEY (`idAluno`),
  INDEX `fk_Aluno_CEP1_idx` (`CEP_idCEP` ASC) VISIBLE,
  CONSTRAINT `fk_Aluno_CEP1`
    FOREIGN KEY (`CEP_idCEP`)
    REFERENCES `espacoFit`.`CEP` (`idCEP`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `espacoFit`.`Fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `espacoFit`.`Fornecedor` (
  `idFornecedor` INT NOT NULL AUTO_INCREMENT,
  `nomeFornecedor` VARCHAR(100) NOT NULL,
  `razaoSocialFornecedor` VARCHAR(100) NULL DEFAULT NULL,
  `cnpjFornecedor` VARCHAR(12) NULL DEFAULT NULL,
  `inscEstadualForne` VARCHAR(12) NOT NULL,
  `compleEnderecoFornecedor` VARCHAR(100) NULL DEFAULT NULL,
  `fone1Fornecedor` VARCHAR(12) NULL DEFAULT NULL,
  `fone2Fornecedor` VARCHAR(12) NULL DEFAULT NULL,
  `emailFornecedor` VARCHAR(100) NULL DEFAULT NULL,
  `obsFornecedor` VARCHAR(100) NULL DEFAULT NULL,
  `CEP_idCEP` INT NOT NULL,
  PRIMARY KEY (`idFornecedor`),
  INDEX `fk_Fornecedor_CEP1_idx` (`CEP_idCEP` ASC) VISIBLE,
  CONSTRAINT `fk_Fornecedor_CEP1`
    FOREIGN KEY (`CEP_idCEP`)
    REFERENCES `espacoFit`.`CEP` (`idCEP`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `espacoFit`.`Compras`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `espacoFit`.`Compras` (
  `idCompra` INT NOT NULL,
  `dataCompra` DATE NULL DEFAULT NULL,
  `valorTotalCompra` FLOAT NULL DEFAULT NULL,
  `ValorDescontoCompra` FLOAT NULL DEFAULT NULL,
  `statusCompra` VARCHAR(1) NULL DEFAULT NULL,
  `Fornecedor_idFornecedor` INT NOT NULL,
  PRIMARY KEY (`idCompra`),
  INDEX `fk_Compras_Fornecedor1_idx` (`Fornecedor_idFornecedor` ASC) VISIBLE,
  CONSTRAINT `fk_Compras_Fornecedor1`
    FOREIGN KEY (`Fornecedor_idFornecedor`)
    REFERENCES `espacoFit`.`Fornecedor` (`idFornecedor`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `espacoFit`.`TipoProduto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `espacoFit`.`TipoProduto` (
  `idTipoProduto` INT NOT NULL,
  `descricaoTipo` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`idTipoProduto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `espacoFit`.`Produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `espacoFit`.`Produto` (
  `idProduto` INT NOT NULL AUTO_INCREMENT,
  `descriProduto` VARCHAR(60) NULL DEFAULT NULL,
  `undCompraProduto` VARCHAR(3) NULL DEFAULT NULL,
  `undVendaProduto` VARCHAR(3) NULL DEFAULT NULL,
  `correlacaoUndProduto` INT NULL DEFAULT NULL,
  `valorProduto` FLOAT NULL DEFAULT NULL,
  `qtdEstoqueProduto` INT NULL DEFAULT NULL,
  `barraProduto` VARCHAR(13) NULL DEFAULT NULL,
  `statusProduto` VARCHAR(1) NULL DEFAULT NULL,
  `obs` VARCHAR(100) NULL DEFAULT NULL,
  `Tipo_tipoId` INT NULL DEFAULT NULL,
  PRIMARY KEY (`idProduto`),
  INDEX `fk_Produto_TipoProduto_idx` (`Tipo_tipoId` ASC) VISIBLE,
  CONSTRAINT `fk_Produto_TipoProduto`
    FOREIGN KEY (`Tipo_tipoId`)
    REFERENCES `espacoFit`.`TipoProduto` (`idTipoProduto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `espacoFit`.`ItensCompra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `espacoFit`.`ItensCompra` (
  `IdItensCompracol` INT NOT NULL,
  `Compras_idCompras` INT NOT NULL,
  `Produto_idProduto` INT NOT NULL,
  `qtdProduto` INT NULL DEFAULT NULL,
  `valorUnitProduto` FLOAT NULL DEFAULT NULL,
  `statusItensCompracol` VARCHAR(1) NULL DEFAULT NULL,
  PRIMARY KEY (`IdItensCompracol`),
  INDEX `fk_ItensCompra_Compras_idx` (`Compras_idCompras` ASC) VISIBLE,
  INDEX `fk_ItensCompra_Produto1_idx` (`Produto_idProduto` ASC) VISIBLE,
  CONSTRAINT `fk_ItensCompra_Compras`
    FOREIGN KEY (`Compras_idCompras`)
    REFERENCES `espacoFit`.`Compras` (`idCompra`),
  CONSTRAINT `fk_ItensCompra_Produto1`
    FOREIGN KEY (`Produto_idProduto`)
    REFERENCES `espacoFit`.`Produto` (`idProduto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `espacoFit`.`Vendas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `espacoFit`.`Vendas` (
  `idVenda` INT NOT NULL AUTO_INCREMENT,
  `dataVenda` DATE NULL DEFAULT NULL,
  `horaVenda` TIME NULL DEFAULT NULL,
  `valorTotalVenda` FLOAT NULL DEFAULT NULL,
  `obsVenda` VARCHAR(100) NULL DEFAULT NULL,
  `statusVenda` VARCHAR(1) NULL DEFAULT NULL,
  PRIMARY KEY (`idVenda`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `espacoFit`.`ItensVenda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `espacoFit`.`ItensVenda` (
  `IdItensCompracol` INT NOT NULL,
  `Produto_idProduto` INT NOT NULL,
  `qtdProduto` INT NULL DEFAULT NULL,
  `valorUnitProduto` FLOAT NULL DEFAULT NULL,
  `statusItensCompracol` VARCHAR(1) NULL DEFAULT NULL,
  `VENDA_idVenda` INT NOT NULL,
  PRIMARY KEY (`IdItensCompracol`),
  INDEX `fk_ItensCompra_Produto1_idx` (`Produto_idProduto` ASC) VISIBLE,
  INDEX `fk_ItensVenda_Venda_idx` (`VENDA_idVenda` ASC) VISIBLE,
  CONSTRAINT `fk_ItensVenda_Produto`
    FOREIGN KEY (`Produto_idProduto`)
    REFERENCES `espacoFit`.`Produto` (`idProduto`),
  CONSTRAINT `fk_ItensVenda_Venda`
    FOREIGN KEY (`VENDA_idVenda`)
    REFERENCES `espacoFit`.`Vendas` (`idVenda`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `espacoFit`.`Pagar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `espacoFit`.`Pagar` (
  `idPagar` INT NOT NULL AUTO_INCREMENT,
  `dtEmissaoPagar` DATE NULL DEFAULT NULL,
  `valorEmitidoPagar` FLOAT NULL DEFAULT NULL,
  `dtVencimentoPagar` DATE NULL DEFAULT NULL,
  `dtPgtoPagar` DATE NULL DEFAULT NULL,
  `valDescontoPagar` FLOAT NULL DEFAULT NULL,
  `valAcrescimoPagar` FLOAT NULL DEFAULT NULL,
  `valPagoPagar` FLOAT NULL DEFAULT NULL,
  `obsPagar` VARCHAR(100) NULL DEFAULT NULL,
  `statusPagar` VARCHAR(1) NULL DEFAULT NULL,
  `Compras_idCompras` INT NOT NULL,
  PRIMARY KEY (`idPagar`),
  INDEX `fk_Pagar_Compras1_idx` (`Compras_idCompras` ASC) VISIBLE,
  CONSTRAINT `fk_Pagar_Compras1`
    FOREIGN KEY (`Compras_idCompras`)
    REFERENCES `espacoFit`.`Compras` (`idCompra`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `espacoFit`.`Personal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `espacoFit`.`Personal` (
  `idPersonal` INT NOT NULL AUTO_INCREMENT,
  `nomePersonal` VARCHAR(100) NULL DEFAULT NULL,
  `rgPersona` VARCHAR(11) NULL DEFAULT NULL,
  `cpfPersonal` VARCHAR(11) NULL DEFAULT NULL,
  `dtNasPersonal` DATE NULL DEFAULT NULL,
  `compleEnderecoPersonal` VARCHAR(100) NULL DEFAULT NULL,
  `fone1Personal` VARCHAR(11) NULL DEFAULT NULL,
  `fone2Personal` VARCHAR(11) NULL DEFAULT NULL,
  `emailPersonal` VARCHAR(100) NULL DEFAULT NULL,
  `obsPersonal` VARCHAR(100) NULL DEFAULT NULL,
  `CEP_idCEP` INT NOT NULL,
  PRIMARY KEY (`idPersonal`),
  INDEX `fk_Personal_CEP1_idx` (`CEP_idCEP` ASC) VISIBLE,
  CONSTRAINT `fk_Personal_CEP1`
    FOREIGN KEY (`CEP_idCEP`)
    REFERENCES `espacoFit`.`CEP` (`idCEP`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `espacoFit`.`Receber`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `espacoFit`.`Receber` (
  `idReceber` INT NOT NULL AUTO_INCREMENT,
  `dtEmissao` DATE NULL DEFAULT NULL,
  `valorEmitido` FLOAT NULL DEFAULT NULL,
  `dtVencimento` DATE NULL DEFAULT NULL,
  `dtPgto` DATE NULL DEFAULT NULL,
  `valDesconto` FLOAT NULL DEFAULT NULL,
  `valAcrescimoPagar` FLOAT NULL DEFAULT NULL,
  `valPago` FLOAT NULL DEFAULT NULL,
  `obs` VARCHAR(100) NULL DEFAULT NULL,
  `status` VARCHAR(1) NULL DEFAULT NULL,
  `Venda_idVenda` INT NOT NULL,
  `Aluno_idAluno` INT NULL DEFAULT NULL,
  PRIMARY KEY (`idReceber`),
  INDEX `fk_Receber_Venda_idx` (`Venda_idVenda` ASC) VISIBLE,
  INDEX `fk_Receber_Aluno_idx` (`Aluno_idAluno` ASC) VISIBLE,
  CONSTRAINT `fk_Receber_Aluno`
    FOREIGN KEY (`Aluno_idAluno`)
    REFERENCES `espacoFit`.`Aluno` (`idAluno`),
  CONSTRAINT `fk_Receber_Venda`
    FOREIGN KEY (`Venda_idVenda`)
    REFERENCES `espacoFit`.`Vendas` (`idVenda`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
