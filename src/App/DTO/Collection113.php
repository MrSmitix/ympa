<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ScalarList", options={"type":"int"})
 * @DTA\Validator(name="Count", options={"max":200}, blocker=true)
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"Scalar", "options":{"type":"int"}}
 * }})
 */
class Collection113 extends \ArrayObject
{
}
