<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ScalarList", options={"type":"int"})
 * @DTA\Validator(name="Count", options={"min":1,"max":500}, blocker=true)
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"Scalar", "options":{"type":"int"}}
 * }})
 */
class Collection36 extends \ArrayObject
{
}
