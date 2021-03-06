--
--
--TEAM 2 :
--
--CIAMPA, Gian Gabriele
--GHODBANE, Mohammed El Amine
--TARHOUNI, Mohamed Amine
--TOULIATOS, Alexander
--
--


-- INSERTION CATEGORIES
INSERT INTO CATEGORIES
VALUES (1,'UROLOGIE','MÉDICAMENTS S''APPLICANT AUX REINS, VOIE URINAIRE, SYSTÈME REPRODUCTEUR OU GLANDES SURRÉNALES');
INSERT INTO CATEGORIES
VALUES (2,'PSYCHIATRIE','MÉDICAMENTS S''APPLICANT AUX MALADIES ET PROBLÈMES MENTAUX OU RELIÉS AU CERVEAU');
INSERT INTO CATEGORIES
VALUES (3,'ANALGESIQUES ET ANTI-INFLAMMATOIRES','MÉDICAMENTS UTILISÉS DANS LE TRAITEMENT DE LA DOULEUR OU COMBATTRE UNE INFLAMMATION');
INSERT INTO CATEGORIES
VALUES (4,'DIETETIQUE ET NUTRITION','MÉDICAMENTS AIDANT À LA NUTRITION ÉQUILIBRÉE, À LA PERTE OU AU GAIN DE POIDS');

-- INSERTION MEDICAMENT
INSERT INTO MEDICAMENT
VALUES (1,'TROPAS',30.12,1);
INSERT INTO MEDICAMENT
VALUES (2,'CALORIX',35.00,4);
INSERT INTO MEDICAMENT
VALUES (3,'VALORATUM',150.99,2);
INSERT INTO MEDICAMENT
VALUES (4,'INSIGNIVAPORUM',900.95,2);
INSERT INTO MEDICAMENT
VALUES (5,'PLEUROTIX',30.50,3);
INSERT INTO MEDICAMENT
VALUES (6,'TYLENOL',10.60,3);
INSERT INTO MEDICAMENT
VALUES (7,'VALIUM',70.10,2);
INSERT INTO MEDICAMENT
VALUES (8,'VALIUM',70.10,3);

-- INSERTION SPECIALITÉ
INSERT INTO SPECIALITE
VALUES (1,'NEUROLOGUE','DOCTEUR SPÉCIALISTE DANS L''ENSEMBLE DES MALADIES DU SYSTÈME NERVEUX ET EN PARTICULIER DU CERVEAU');
INSERT INTO SPECIALITE
VALUES (2,'UROLOGUE','DOCTEUR SPÉCIALISTE DANS L''ENSEMBLE DES MALADIES RELIÉS AUX REINS, AUX VOIES URINAIRES, AU SYSTÈME REPRODUCTEUR MASCULIN ET AUX GLANDES SURRÉNALES');
INSERT INTO SPECIALITE
VALUES (3,'CHIRURGIEN CARDIAQUE','SPÉCIALISTE CHIRURGICAL TRAITANT DES AFFECTIONS DU COEUR ET DES GROS VAISSEAUX THORACIQUES');
INSERT INTO SPECIALITE
VALUES (4,'CHIRURGIEN PLASTIQUE','SPÉCIALISTE CHIRURGICAL CONCERNANT PRINCIPALEMENT LA PEAU ET LES TISSUS MOUS NON VISCÉRAUX DE L''ORGANISME');
INSERT INTO SPECIALITE
VALUES (5,'OPTOMETRISTE','PROFESSIONNEL DE LA SANTÉ DE L''OEIL ET DU SYTÈME VISUEL QUI ASSURENT UN SERVICE VISUEL COMPLET');
INSERT INTO SPECIALITE
VALUES (6,'PROTHESISTE DENTAIRE','PROFESSIONNEL CHARGÉ D''ÉLABORER UN APPAREILLAGE DESTINÉ À LA RESTAURATION ET AU RÉTABLISSEMENT FONCTIONNEL ET ESTHÉTIQUE DU SYSTÈME DE MANDUCATION');
INSERT INTO SPECIALITE
VALUES (7,'PSYCHOLOGUE','PROFESSIONNEL DE LA PSYCHOLOGIE QUI REGROUPE DE NOMBREUX COURANTS THÉORIQUES ET PRATIQUES AUTOUR DE L''ANALYSE DES FAITS PSYCHIQUES INDIVIDUELS, DE GROUPE ET DE LEUR TRAITEMENT ÉVOLUTIF ET RÉORGANISATEUR PAR DES DÉMARCHES PSYCHOLOGIQUES');

-- INSERTION DOCTEUR
INSERT INTO DOCTEUR
VALUES (1001,'TRANQUILLE','ARTHUR',NULL,'MONTREAL','11, RUE DE LA VIEILLESSE','ETUDIANT',20);
INSERT INTO DOCTEUR
VALUES (1002,'BOTOX','AMELIA',4,'CHIBOUGAMEAU','1222, RUE DES BEAUTÉS','DOCTEUR',10);
INSERT INTO DOCTEUR
VALUES (1003,'MACHETTE','ROGER',3,'QUEBEC','1190, AVENUE DES COEURS MALADES','DOCTEUR',12);
INSERT INTO DOCTEUR
VALUES (1004,'BARNIQUE','CHANTAL',5,'MONTREAL','10190, BOULEVARD DES YEUX CROCHES','INTERNE',5);
INSERT INTO DOCTEUR
VALUES (1005,'NERVEUX','KEVIN',1,'MONTREAL','1, BOULEVARD DES PARKINSONS','DOCTEUR',50);
INSERT INTO DOCTEUR
VALUES (1006,'ECHAPPE','OLIVIER',2,'OTTAWA','25, RUE MOUILLÉE','ETUDIANT',7);
INSERT INTO DOCTEUR
VALUES (1007,'BELLEGUEULE','RITA',6,'MONCTON','25, AVENUE DES MACHOIRES D''ACIER','INTERNE',10);
INSERT INTO DOCTEUR
VALUES (1008,'GENTIL','RAYMOND',NULL,'QUEBEC','10112, RUE GÉNÉRALE','DOCTEUR',90);
INSERT INTO DOCTEUR
VALUES (1009,'LINOTTE','SOFIA-LYNE',7,'MONTREAL','12, 90E AVENUE','DOCTEUR',250);

--INSERTION DOSSIERPATIENT
INSERT INTO DOSSIERPATIENT
VALUES (101,'GARIEPY','MICHEL','M','GARM62012404',TO_DATE('24-01-1962','DD-MM-YYYY'),TO_DATE('27-10-2017','DD-MM-YYYY'),1001);
INSERT INTO DOSSIERPATIENT
VALUES (102,'TREMBLAY','MICHEL','M','TREM66102401',TO_DATE('24-10-1966','DD-MM-YYYY'),TO_DATE('14-03-2018','DD-MM-YYYY'),1001);
INSERT INTO DOSSIERPATIENT
VALUES (103,'SAVARD','JOSEPHINE','F','SAVJ66511205',TO_DATE('12-01-1966','DD-MM-YYYY'),TO_DATE('14-05-1990','DD-MM-YYYY'),1008);
INSERT INTO DOSSIERPATIENT
VALUES (104,'TREMBLAY','MICHELLE','F','TREM99541205',TO_DATE('12-04-1999','DD-MM-YYYY'),TO_DATE('22-11-1999','DD-MM-YYYY'),1008);
INSERT INTO DOSSIERPATIENT
VALUES (105,'COITEUX','LUC','M','COIL77080112',TO_DATE('01-08-1977','DD-MM-YYYY'),TO_DATE('01-11-2002','DD-MM-YYYY'),1009);
INSERT INTO DOSSIERPATIENT
VALUES (106,'DOH','JOHN','M','DOHJ77081312',TO_DATE('13-08-1977','DD-MM-YYYY'),TO_DATE('01-11-1989','DD-MM-YYYY'),1009);
INSERT INTO DOSSIERPATIENT
VALUES (107,'DOH','JANE','F','DOHJ77581312',TO_DATE('13-08-1977','DD-MM-YYYY'),TO_DATE('01-11-1989','DD-MM-YYYY'),1009);
INSERT INTO DOSSIERPATIENT
VALUES (108,'DOH','JACK','M','DOHJ77081313',TO_DATE('13-08-1977','DD-MM-YYYY'),TO_DATE('01-11-1989','DD-MM-YYYY'),1009);
INSERT INTO DOSSIERPATIENT
VALUES (109,'BLACK','JACK','M','BLAJ80010101',TO_DATE('01-01-1980','DD-MM-YYYY'),TO_DATE('17-09-2018','DD-MM-YYYY'),1006);


--INSERTION ORDONNANCE
INSERT INTO ORDONNANCE
VALUES (1,'PRENDRE 2 COMPRIMÉS 4 FOIS PAR JOUR','MEDICAMENTS',TO_DATE('19-09-2018','DD-MM-YYYY'));
INSERT INTO ORDONNANCE
VALUES (2,'PRENDRE DES ANTIDÉPRESSEURS ET DÉMÉNAGER POUR VIVRE CHACUN DE SON CÔTÉ','MEDICAMENTS',TO_DATE('02-09-2000','DD-MM-YYYY'));
INSERT INTO ORDONNANCE
VALUES (3,'DEVOIR POSER UN PLÂTRE','CHIRURGIE',TO_DATE('01-09-2018','DD-MM-YYYY'));
INSERT INTO ORDONNANCE
VALUES (4,'SE FAIRE INSTALLER UNE MÂCHOIRE D''ACIER','CHIRURGIE',TO_DATE('16-09-2018','DD-MM-YYYY'));
INSERT INTO ORDONNANCE
VALUES (5,'SUIVRE UNE DIÈTE NORMALE, FAIRE DE L''EXERCICE ET ARRÊTER DE D''ÊTRE OBSÉDÉ SUR SON POIDS' ,'MEDICAMENTS',TO_DATE('16-07-2018','DD-MM-YYYY'))


--INSERTION CONSULTATION
INSERT INTO CONSULTATION
VALUES (1001,109,TO_DATE('17-09-2018','DD-MM-YYYY'),'PATIENT SOUFFRE DE MIGRAINES',1);
INSERT INTO CONSULTATION
VALUES (1009,106,TO_DATE('01-09-2000','DD-MM-YYYY'),'PATIENT SOUFFRANT DE RIVALITÉS FRATERNELLES',2);
INSERT INTO CONSULTATION
VALUES (1009,107,TO_DATE('01-09-2000','DD-MM-YYYY'),'PATIENTE SOUFFRANT DE RIVALITÉS FRATERNELLES',2);
INSERT INTO CONSULTATION
VALUES (1009,108,TO_DATE('01-09-2000','DD-MM-YYYY'),'PATIENT SOUFFRANT DE RIVALITÉS FRATERNELLES',2);
INSERT INTO CONSULTATION
VALUES (1008,105,TO_DATE('01-09-2018','DD-MM-YYYY'),'PATIENT S''ÉTANT FRACTURÉ LE FÉMUR',3);

INSERT INTO CONSULTATION
VALUES (1007,101,TO_DATE('24-09-2018','DD-MM-YYYY'),'FRACTURE DE LA MACHOIRE',4);
INSERT INTO CONSULTATION
VALUES (1002,103,TO_DATE('24-09-2018','DD-MM-YYYY'),'OBÉSITÉ',5);



--INSERTION ORDONNANCEMEDICAMENTS
INSERT INTO ORDONNANCEMEDICAMENTS
VALUES (1,6,4);
INSERT INTO ORDONNANCEMEDICAMENTS
VALUES (2,7,10);
INSERT INTO ORDONNANCEMEDICAMENTS
VALUES (5,2,1);

--INSERTION ORDONNANCECHIRURGIE
INSERT INTO ORDONNANCECHIRURGIE
VALUES (3,1,'PLÂTRAGE');
INSERT INTO ORDONNANCECHIRURGIE
VALUES (4,2,'ORTHODONTIE');








