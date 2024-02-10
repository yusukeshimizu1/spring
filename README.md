## Preparation
事前にMySQL(Ver.8.0.34)とJava17をインストールする

MySQL上にdiaryスキーマを作成し、diaryスキーマ内にdiaryテーブルを作成する（テーブル作成時に以下のDDLを実行する）

CREATE TABLE `diary` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `condition_type` int DEFAULT NULL,
  `create_datetime` datetime(6) DEFAULT NULL,
  `update_datetime` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=72 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

## How to Start
当プロジェクトを「Spring Boot App」で起動後、Reactプロジェクトを起動する

React上でデータ改廃を行うと、当プロジェクトが呼び出される
