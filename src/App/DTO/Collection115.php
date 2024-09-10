<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\OfferContentDTO::class})
 * @DTA\Validator(name="Count", options={"min":1,"max":100}, blocker=true)
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\OfferContentDTO::class}}
 * }})
 */
class Collection115 extends \ArrayObject
{
}
