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
     */
    public ?string $next_page_token = null;

    /**
     * Идентификатор предыдущей страницы результатов.
     * @DTA\Data(field="prevPageToken", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $prev_page_token = null;

}
