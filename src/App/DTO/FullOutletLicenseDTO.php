<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о лицензии.
 */
class FullOutletLicenseDTO
{
    /**
     * Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре &#x60;number&#x60;.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * Идентификатор точки продаж, для которой действительна лицензия.
     * @DTA\Data(field="outletId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $outlet_id = null;

    /**
     * @DTA\Data(field="licenseType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LicenseType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LicenseType::class})
     */
    public ?\App\DTO\LicenseType $license_type = null;

    /**
     * Номер лицензии.
     * @DTA\Data(field="number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $number = null;

    /**
     * Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение &#x60;2017-11-13T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре &#x60;dateOfExpiry&#x60;.
     * @DTA\Data(field="dateOfIssue", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $date_of_issue = null;

    /**
     * Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение &#x60;2022-11-20T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре &#x60;dateOfIssue&#x60;.
     * @DTA\Data(field="dateOfExpiry", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $date_of_expiry = null;

    /**
     * @DTA\Data(field="checkStatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LicenseCheckStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LicenseCheckStatusType::class})
     */
    public ?\App\DTO\LicenseCheckStatusType $check_status = null;

    /**
     * Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр &#x60;checkStatus&#x60; имеет значение &#x60;FAIL&#x60;.
     * @DTA\Data(field="checkComment", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $check_comment = null;

}
