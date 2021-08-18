	DROP TABLE IF EXISTS Promo;

	CREATE TABLE IF NOT EXISTS Promo(
		id INT NOT NULL AUTO_INCREMENT,
		name varchar(255) NOT NULL,
		reduction float NOT NULL,
		textProm text NOT NULL,
		dateDeb DateTime NOT NULL,
		dateFin DateTime NOT NULL,
		PRIMARY KEY (id)	
	);
	
	INSERT INTO Promo(name, textProm, dateDeb, dateFin) VALUES ('Chaussette Gauche', 'Pour avoir des reductions sur les chaussettes gauches uniquement',0.5,'2021-07-15','2021-08-15');	
	INSERT INTO Promo(name, textProm, dateDeb, dateFin) VALUES ('Chaussette Droite', 'Pour avoir des reductions sur les chaussettes droites uniquement',0.45,'2021-02-15','2021-10-11');	
	INSERT INTO Promo(name, textProm, dateDeb, dateFin) VALUES ('Fait froid', 'Pour avoir des reductions sur les pulls',0.8,'2021-02-20','2021-03-01');	
	INSERT INTO Promo(name, textProm, dateDeb, dateFin) VALUES ('Chaussez vous bien', 'Pour avoir des reductions sur les TN uniquement',0.1,'2021-06-09','2021-08-15');	
	INSERT INTO Promo(name, textProm, dateDeb, dateFin) VALUES ('La promo du radin', 'Pour avoir des reductions sur tout mais a 1%',0.01,'2021-07-15','2021-08-15');	
	
	