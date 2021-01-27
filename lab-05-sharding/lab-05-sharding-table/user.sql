CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `user_name` varchar(32) NOT NULL,
  `password` varchar(50) NOT NULL,
  `real_name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;