-- Database: calegdb

-- DROP DATABASE IF EXISTS calegdb;

CREATE DATABASE calegdb
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_United States.1252'
    LC_CTYPE = 'English_United States.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

CREATE TABLE partai (
  id UUID PRIMARY KEY,
  nama_partai VARCHAR(100),
  nomor_urut INTEGER
);
commit;

CREATE TABLE dapil (
  id UUID PRIMARY KEY,
  nama_dapil VARCHAR(100),
  provinsi VARCHAR(100),
  wilayah_dapil_list TEXT[], -- Array of wilayah
  jumlah_kursi INTEGER
);
commit;

CREATE TABLE caleg (
  id UUID PRIMARY KEY,
  nama VARCHAR(100),
  nomor_urut INTEGER,
  jenis_kelamin VARCHAR(20),
  partai_id UUID REFERENCES partai(id),
  dapil_id UUID REFERENCES dapil(id)
);
commit;

-- Insert Partai
INSERT INTO partai (id, nama_partai, nomor_urut) VALUES
  ('00000000-0000-0000-0000-00000000001', 'Partai Optimis', 1),
  ('00000000-0000-0000-0000-000000000002', 'Partai Progresif', 2);
commit;

-- Insert Dapil
INSERT INTO dapil (id, nama_dapil, provinsi, wilayah_dapil_list, jumlah_kursi) VALUES
  ('00000000-0000-0000-0000-000000000011', 'Dapil Tangerang Raya', 'Banten', ARRAY['Tangerang', 'Tigaraksa', 'Cikupa'], 6),
  ('00000000-0000-0000-0000-000000000012', 'Dapil Jakarta Barat', 'DKI Jakarta', ARRAY['Grogol', 'Kebon Jeruk'], 4);
commit;
-- Insert Caleg
INSERT INTO caleg (id, nama, nomor_urut, jenis_kelamin, partai_id, dapil_id) VALUES
  ('00000000-0000-0000-0000-000000000101', 'Joko Harapan', 1, 'LAKILAKI', '00000000-0000-0000-0000-000000000001', '00000000-0000-0000-0000-000000000011'),
  ('00000000-0000-0000-0000-000000000102', 'Siti Merdeka', 2, 'PEREMPUAN', '00000000-0000-0000-0000-000000000002', '00000000-0000-0000-0000-000000000012');
commit;