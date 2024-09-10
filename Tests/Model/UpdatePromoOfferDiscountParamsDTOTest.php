<?php
/**
 * UpdatePromoOfferDiscountParamsDTOTest
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

use OpenAPI\Server\Model\UpdatePromoOfferDiscountParamsDTO;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * UpdatePromoOfferDiscountParamsDTOTest Class Doc Comment
 *
 * @category    Class
 * @description Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.  Обязательный параметр для акций с этими типами.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\UpdatePromoOfferDiscountParamsDTO
 */
class UpdatePromoOfferDiscountParamsDTOTest extends TestCase
{
    protected UpdatePromoOfferDiscountParamsDTO|MockObject $object;

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
        $this->object = $this->getMockBuilder(UpdatePromoOfferDiscountParamsDTO::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(UpdatePromoOfferDiscountParamsDTO::class));
        $this->assertInstanceOf(UpdatePromoOfferDiscountParamsDTO::class, $this->object);
    }

    /**
     * Test attribute "price"
     *
     * @group unit
     * @small
     */
    public function testPropertyPrice(): void
    {
        $this->markTestSkipped('Test for property price not implemented');
    }

    /**
     * Test attribute "promoPrice"
     *
     * @group unit
     * @small
     */
    public function testPropertyPromoPrice(): void
    {
        $this->markTestSkipped('Test for property promoPrice not implemented');
    }
}
