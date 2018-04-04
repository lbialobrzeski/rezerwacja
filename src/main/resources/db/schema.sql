DROP TABLE samochod IF EXISTS;
DROP TABLE pracownik IF EXISTS;
DROP TABLE rezerwacja IF EXISTS;

CREATE TABLE samochod (
  id INTEGER IDENTITY PRIMARY KEY,
  marka VARCHAR(30),
  model VARCHAR(30),
  liczba_miejsc INTEGER
);

CREATE TABLE pracownik (
  id INTEGER IDENTITY PRIMARY KEY,
  imie VARCHAR(30),
  nazwisko VARCHAR(30),
  mail VARCHAR(30)
);

CREATE TABLE rezerwacja (
  id INTEGER IDENTITY PRIMARY KEY,
  data_od DATE,
  data_do DATE,
  samochod_id INTEGER,
  mail VARCHAR(30)
);

ALTER TABLE rezerwacja ADD CONSTRAINT fk_rezerwacja FOREIGN KEY (samochod_id) REFERENCES samochod (id);