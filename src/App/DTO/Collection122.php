<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\UpdatePromoOfferDTO::class})
 * @DTA\Validator(name="Count", options={"min":1,"max":500}, blocker=true)
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\UpdatePromoOfferDTO::class}}
 * }})
 */
class Collection122 extends \ArrayObject
{
}
