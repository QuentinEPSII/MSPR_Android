<?php

declare(strict_types=1);

namespace DoctrineMigrations;

use Doctrine\DBAL\Schema\Schema;
use Doctrine\Migrations\AbstractMigration;

/**
 * Auto-generated Migration: Please modify to your needs!
 */
final class Version20210303081312 extends AbstractMigration
{
    public function getDescription() : string
    {
        return '';
    }

    public function up(Schema $schema) : void
    {
        // this up() migration is auto-generated, please modify it to your needs
        $this->addSql("INSERT INTO Promo(name, text_prom, reduction, date_deb, date_fin) VALUES ('Chaussette Gauche', 'Pour avoir des reductions sur les chaussettes gauches uniquement',0.5,'2021-07-15','2021-08-15');	");
        $this->addSql("INSERT INTO Promo(name, text_prom, reduction, date_deb, date_fin) VALUES ('Chaussette Droite', 'Pour avoir des reductions sur les chaussettes droites uniquement',0.45,'2021-02-15','2021-10-11');");
	    $this->addSql("INSERT INTO Promo(name, text_prom, reduction, date_deb, date_fin) VALUES ('Fait froid', 'Pour avoir des reductions sur les pulls',0.8,'2021-02-20','2021-03-01');");
	    $this->addSql("INSERT INTO Promo(name, text_prom, reduction, date_deb, date_fin) VALUES ('Chaussez vous bien', 'Pour avoir des reductions sur les TN uniquement',0.1,'2021-06-09','2021-08-15');");
	    $this->addSql("INSERT INTO Promo(name, text_prom, reduction, date_deb, date_fin) VALUES ('La promo du radin', 'Pour avoir des reductions sur tout mais a 1%',0.01,'2021-07-15','2021-08-15');");


    }

    public function down(Schema $schema) : void
    {
        // this down() migration is auto-generated, please modify it to your needs

    }
}
