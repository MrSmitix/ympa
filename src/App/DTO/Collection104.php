<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\FeedDTO::class})
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\FeedDTO::class}}
 * }})
 */
class Collection104 extends \ArrayObject
{
}