<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о страницах результатов.
 */
class ScrollingPagerDTO
{
    /**
     * Идентификатор следующей страницы результатов.
     * @DTA\Data(field="nextPageToken", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $next_page_token;

    /**
     * Идентификатор предыдущей страницы результатов.
     * @DTA\Data(field="prevPageToken", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $prev_page_token;

}
