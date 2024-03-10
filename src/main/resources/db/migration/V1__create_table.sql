CREATE TABLE users (
    user_id INT PRIMARY KEY IDENTITY,
    username NVARCHAR(255) NOT NULL,
    password NVARCHAR(255) NOT NULL,
    email NVARCHAR(255) NOT NULL,
    firstname NVARCHAR(255) NOT NULL,
    lastname NVARCHAR(255) NOT NULL,
);