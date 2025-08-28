CREATE DATABASE testing;
use testing;

CREATE Table dummy(
    id int ,
    name VARCHAR(10),
    create_at DATETIME,
    is_active ENUM("yes" , "no")
);

INSERT INTO dummy VALUES
    (1, 'Kinich', '2025-08-28 10:00:00', 'yes'),
    (2, 'mualani', '2025-08-28 11:00:00', 'yes'),
    (3, 'hu tao', '2025-08-28 12:00:00', 'no');

SELECT * FROM dummy
