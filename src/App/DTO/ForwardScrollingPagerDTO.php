<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ссылка на следующую страницу.
 */
class ForwardScrollingPagerDTO
{
    /**
     * Идентификатор следующей страницы результатов.
     * @DTA\Data(field="nextPageToken", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $next_page_token;

}
