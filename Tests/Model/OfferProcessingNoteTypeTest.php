<?php
/**
 * OfferProcessingNoteTypeTest
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Model
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */

namespace OpenAPI\Server\Tests\Model;

use OpenAPI\Server\Model\OfferProcessingNoteType;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * OfferProcessingNoteTypeTest Class Doc Comment
 *
 * @category    Class
 * @description Тип причины, по которой товар не прошел модерацию:  * &#x60;ASSORTMENT&#x60; — товар производится в разных вариантах. Каждый из них нужно описать как отдельный товар (входной параметр &#x60;offer-mapping-entry&#x60; запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md) или строка в каталоге, если вы загружаете товары через кабинет продавца на Маркете). * &#x60;CANCELLED&#x60; — товар отозван с модерации по вашей инициативе. * &#x60;CONFLICTING_INFORMATION&#x60; _(ранее ошибочно &#x60;CONFLICTING&#x60;)_ — вы предоставили противоречивую информацию о товаре. Параметры, которые нужно исправить, указаны в параметре &#x60;payload&#x60;. * &#x60;DEPARTMENT_FROZEN&#x60; — правила размещения товаров в данной категории перерабатываются, поэтому товар пока не может пройти модерацию. * &#x60;INCORRECT_INFORMATION&#x60; — информация о товаре, которую вы предоставили, противоречит описанию от производителя. Параметры, которые нужно исправить, указаны в параметре &#x60;payload&#x60;. * &#x60;LEGAL_CONFLICT&#x60; — товар не прошел модерацию по юридическим причинам. Например, он официально не продается в России или у вас нет разрешения на его продажу. * &#x60;NEED_CLASSIFICATION_INFORMATION&#x60; — информации о товаре, которую вы предоставили, не хватает, чтобы отнести его к категории. Проверьте, что правильно указали название, категорию, производителя и страны производства товара, а также URL изображений или страниц с описанием, по которым можно идентифицировать товар. * &#x60;NEED_INFORMATION&#x60; — товар раньше не продавался в России и пока не размещается на Маркете. Для него можно создать карточку. Подробнее см. в разделе [Работа с карточкой товара](https://yandex.ru/support/marketplace/assortment/content/index.html) Справки Маркета для продавцов. * &#x60;NEED_PICTURES&#x60; — для идентификации товара нужны его изображения. Отправьте URL изображений товара в запросе [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md) или загрузите обновленный каталог через кабинет продавца на Маркете. * &#x60;NEED_VENDOR&#x60; — неверно указан производитель товара. * &#x60;NO_CATEGORY&#x60;, &#x60;NO_KNOWLEDGE&#x60; — товары из указанной категории пока не размещаются на Маркете. Если категория появится, товар будет снова отправлен на модерацию. * &#x60;NO_PARAMETERS_IN_SHOP_TITLE&#x60; — товар производится в разных вариантах, и из указанного названия непонятно, о каком идет речь. Параметры, которые нужно добавить в название товара, указаны в параметре &#x60;payload&#x60;. * &#x60;NO_SIZE_MEASURE&#x60; — для этого товара нужна размерная сетка. Отправьте ее в службу поддержки или вашему менеджеру. Требования к размерной сетке указаны в параметре &#x60;payload&#x60;. * &#x60;UNKNOWN&#x60; — товар не прошел модерацию по другой причине. Обратитесь в службу поддержки или к вашему менеджеру.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\OfferProcessingNoteType
 */
class OfferProcessingNoteTypeTest extends TestCase
{
    protected OfferProcessingNoteType|MockObject $object;

    /**
     * Setup before running any test case
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass(): void
    {
    }

    /**
     * @group integration
     * @small
     */
    public function testTestClassExists(): void
    {
        $this->assertTrue(enum_exists(OfferProcessingNoteType::class));
    }
}
