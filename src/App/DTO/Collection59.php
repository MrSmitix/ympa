<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\SuggestOfferPriceDTO::class})
 * @DTA\Validator(name="Count", options={"max":1000}, blocker=true)
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\SuggestOfferPriceDTO::class}}
 * }})
 */
class Collection59 extends \ArrayObject
{
}
