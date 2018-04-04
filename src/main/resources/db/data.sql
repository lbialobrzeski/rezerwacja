--samochody
INSERT INTO samochod VALUES (1, 'Audi', 'A1', 1);
INSERT INTO samochod VALUES (2, 'Audi', 'A2', 2);
INSERT INTO samochod VALUES (3, 'Audi', 'A3', 5);
INSERT INTO samochod VALUES (4, 'Audi', 'A4', 6);
INSERT INTO samochod VALUES (5, 'Audi', 'A5', 4);
INSERT INTO samochod VALUES (6, 'Audi', 'A6', 5);

--pracownik
INSERT INTO pracownik VALUES (1, 'Jan', 'Kowalski', 'jan.kowalski@gmail.com');
INSERT INTO pracownik VALUES (2, 'Grażyna', 'Kowalska', 'grazyna.kowalska@gmail.com');
INSERT INTO pracownik VALUES (3, 'Sylwester', 'Nowak', 'nowak.sylwek@mail.com');
INSERT INTO pracownik VALUES (4, 'Remigiusz', 'Nowak', 'nowak.remek@gmail.com');
INSERT INTO pracownik VALUES (5, 'Wojciech', 'Kowalski', 'kowalski.wojciech@gmail.com');
INSERT INTO pracownik VALUES (6, 'Karolina', 'Kowalska', 'kowalska.karolina@gmail.com');

INSERT INTO rezerwacja VALUES (1, '2018-01-03', '2018-01-05', 1, 'kowalska.karolina@gmail.com');
INSERT INTO rezerwacja VALUES (2, '2018-01-07', '2018-01-10', 5, 'kowalski.wojciech@gmail.com' );
INSERT INTO rezerwacja VALUES (3, '2018-02-03', '2018-02-07', 3, 'nowak.remek@gmail.com' );