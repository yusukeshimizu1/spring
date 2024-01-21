## Preparation
事前にMySQL(Ver.8.0.34)とJava17をインストールする

MySQL上にdiaryスキーマを作成し、diaryスキーマ内にdiaryテーブルを作成する（テーブル作成時に以下のDDLを実行する）

CREATE TABLE `diary` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `create_datetime` datetime(6) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `update_date_time` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

## Overview
当プロジェクトを「Spring Boot App」で起動後、Reactプロジェクトを起動する

React上でデータ改廃を行うと、当プロジェクトが呼び出される
