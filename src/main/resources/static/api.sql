-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           8.0.21 - MySQL Community Server - GPL
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Copiando estrutura para tabela api.tipo_gara
CREATE TABLE IF NOT EXISTS `tipo_gara` (
  `dat_rfrc_vers` date NOT NULL,
  `num_vers_prdo_rfrc` decimal(3,0) NOT NULL,
  `cod_tipo_gara` char(2) NOT NULL,
  `nom_tipo_gara` char(50) DEFAULT NULL,
  PRIMARY KEY (`dat_rfrc_vers`,`num_vers_prdo_rfrc`,`cod_tipo_gara`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando estrutura para tabela api.vers_info_mens
CREATE TABLE IF NOT EXISTS `vers_info_mens` (
  `dat_rfrc_vers` date NOT NULL,
  `num_vers_prdo_rfrc` decimal(3,0) NOT NULL,
  `dat_hor_carg_vers` datetime NOT NULL,
  `ind_vers_ativ` char(1) NOT NULL,
  PRIMARY KEY (`dat_rfrc_vers`,`num_vers_prdo_rfrc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
