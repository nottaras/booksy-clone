CREATE TABLE IF NOT EXISTS addresses
(
    id      BIGSERIAL PRIMARY KEY,
    city    VARCHAR(255),
    country VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS users
(
    id          BIGSERIAL PRIMARY KEY,
    first_name  VARCHAR(255),
    second_name VARCHAR(255),
    age         INTEGER,
    address_id  BIGINT,
    CONSTRAINT fk_address FOREIGN KEY (address_id) REFERENCES addresses(id)
);

INSERT INTO addresses(id, city, country)
VALUES (1, 'Warsaw', 'Poland');

INSERT INTO users(id, first_name, second_name, age, address_id)
VALUES (1, 'Taras', 'Zadziarnouski', 29, 1);