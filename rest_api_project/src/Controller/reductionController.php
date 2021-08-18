<?php


namespace App\Controller;

use App\Entity\Promo;
use Doctrine\ORM\EntityManagerInterface;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;

class reductionController
{
    public function number(): Response
    {
        $number = random_int(0, 100);

        return new Response(
            '<html><body>Lucky number: '.$number.'</body></html>'
        );
    }

    /**
     * @Route("/promo/", name="getProductss")
     * @param EntityManagerInterface $entityManager
     * @return Response
     */
    public function get(EntityManagerInterface $entityManager): Response
    {
        $promo = $entityManager->getRepository(Promo::class)->findAll();

        return$this->handleView($this->view($promo));

    }
    /**
     * @Route("/promo/{id}", name="getProduct")
     */
    public function getById(int $id, EntityManagerInterface $entityManager): Response
    {
        $promo = $entityManager->getRepository(Promo::class)->find($id);
        return new Response(
            '<html><body>promo is : ' . var_dump($promo) . '</body></html>'
        );
    }
    /**
     * @Route("/promo/actual", name="getProduct")
     */
    public function getActual(int $id, EntityManagerInterface $entityManager): Response
    {
        $promo = $entityManager->getRepository(Promo::class)->find($id);
        return new Response(
            '<html><body>promo is : ' . var_dump($promo) . '</body></html>'
        );
    }
}