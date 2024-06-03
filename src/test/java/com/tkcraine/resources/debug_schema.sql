CREATE SCHEMA IF NOT EXISTS chatapp;

DROP TABLE IF EXISTS chatapp.account;

CREATE TABLE IF NOT EXISTS chatapp.account
(
    id bigserial NOT NULL,
    name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    email character varying(255) COLLATE pg_catalog."default" UNIQUE NOT NULL,
    CONSTRAINT account_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS chatapp.account
    OWNER to debug;
	
DROP TABLE IF EXISTS chatapp.room;

CREATE TABLE IF NOT EXISTS chatapp.room
(
    id bigserial NOT NULL,
    name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT room_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS chatapp.room
    OWNER to debug;
	
DROP TABLE IF EXISTS chatapp.room_participant;

CREATE TABLE IF NOT EXISTS chatapp.room_participant
(
    id bigserial NOT NULL,
    account_id bigint,
    room_id bigint NOT NULL,
    CONSTRAINT room_participant_pkey PRIMARY KEY (id),
    CONSTRAINT account_ref FOREIGN KEY (account_id)
        REFERENCES chatapp.account (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE SET NULL,
    CONSTRAINT room_id FOREIGN KEY (room_id)
        REFERENCES chatapp.room (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINt room_combo_unique UNIQUE(account_id, room_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS chatapp.room_participant
    OWNER to debug;
	
DROP TABLE IF EXISTS chatapp.message;

CREATE TABLE IF NOT EXISTS chatapp.message
(
    id bigserial NOT NULL,
    content character varying(4096) COLLATE pg_catalog."default" NOT NULL,
    part_id bigint NOT NULL,
    CONSTRAINT message_pkey PRIMARY KEY (id),
    CONSTRAINT part_ref FOREIGN KEY (part_id)
        REFERENCES chatapp.room_participant (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS chatapp.message
    OWNER to debug;
