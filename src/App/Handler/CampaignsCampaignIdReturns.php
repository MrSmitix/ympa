<?php
declare(strict_types=1);

namespace App\Handler;

use Articus\PathHandler\Annotation as PHA;
use Articus\PathHandler\Consumer as PHConsumer;
use Articus\PathHandler\Producer as PHProducer;
use Articus\PathHandler\Attribute as PHAttribute;
use Articus\PathHandler\Exception as PHException;
use Psr\Http\Message\ServerRequestInterface;

/**
 * @PHA\Route(pattern="/campaigns/{campaignId}/returns")
 */
class CampaignsCampaignIdReturns
{
    /**
     * Список невыкупов и возвратов
     * @PHA\Get()
     * @PHA\Attribute(name=PHAttribute\Transfer::class, options={
     *     "type":\App\DTO\GetReturnsQueryData::class,
     *     "objectAttr":"queryData",
     *     "source": PHAttribute\Transfer::SOURCE_GET
     * })
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\GetReturnsResponse
     */
    public function getReturns(ServerRequestInterface $request): \App\DTO\GetReturnsResponse
    {
        //TODO implement method
        /** @var \App\DTO\GetReturnsQueryData $queryData */
        $queryData = $request->getAttribute("queryData");
        throw new PHException\HttpCode(501, "Not implemented");
    }
}