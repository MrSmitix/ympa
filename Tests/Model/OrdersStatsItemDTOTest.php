<?php
/**
 * OrdersStatsItemDTOTest
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

use OpenAPI\Server\Model\OrdersStatsItemDTO;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * OrdersStatsItemDTOTest Class Doc Comment
 *
 * @category    Class
 * @description Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке &#x60;items&#x60; — только в списке &#x60;initialItems&#x60;.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке &#x60;items&#x60; (с уменьшенным количеством единиц &#x60;count&#x60;), и в списке &#x60;initialItems&#x60; (с первоначальным количеством единиц &#x60;initialCount&#x60;).
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\OrdersStatsItemDTO
 */
class OrdersStatsItemDTOTest extends TestCase
{
    protected OrdersStatsItemDTO|MockObject $object;

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
        $this->object = $this->getMockBuilder(OrdersStatsItemDTO::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(OrdersStatsItemDTO::class));
        $this->assertInstanceOf(OrdersStatsItemDTO::class, $this->object);
    }

    /**
     * Test attribute "offerName"
     *
     * @group unit
     * @small
     */
    public function testPropertyOfferName(): void
    {
        $this->markTestSkipped('Test for property offerName not implemented');
    }

    /**
     * Test attribute "marketSku"
     *
     * @group unit
     * @small
     */
    public function testPropertyMarketSku(): void
    {
        $this->markTestSkipped('Test for property marketSku not implemented');
    }

    /**
     * Test attribute "shopSku"
     *
     * @group unit
     * @small
     */
    public function testPropertyShopSku(): void
    {
        $this->markTestSkipped('Test for property shopSku not implemented');
    }

    /**
     * Test attribute "count"
     *
     * @group unit
     * @small
     */
    public function testPropertyCount(): void
    {
        $this->markTestSkipped('Test for property count not implemented');
    }

    /**
     * Test attribute "prices"
     *
     * @group unit
     * @small
     */
    public function testPropertyPrices(): void
    {
        $this->markTestSkipped('Test for property prices not implemented');
    }

    /**
     * Test attribute "warehouse"
     *
     * @group unit
     * @small
     */
    public function testPropertyWarehouse(): void
    {
        $this->markTestSkipped('Test for property warehouse not implemented');
    }

    /**
     * Test attribute "details"
     *
     * @group unit
     * @small
     */
    public function testPropertyDetails(): void
    {
        $this->markTestSkipped('Test for property details not implemented');
    }

    /**
     * Test attribute "cisList"
     *
     * @group unit
     * @small
     */
    public function testPropertyCisList(): void
    {
        $this->markTestSkipped('Test for property cisList not implemented');
    }

    /**
     * Test attribute "initialCount"
     *
     * @group unit
     * @small
     */
    public function testPropertyInitialCount(): void
    {
        $this->markTestSkipped('Test for property initialCount not implemented');
    }

    /**
     * Test attribute "bidFee"
     *
     * @group unit
     * @small
     */
    public function testPropertyBidFee(): void
    {
        $this->markTestSkipped('Test for property bidFee not implemented');
    }

    /**
     * Test attribute "cofinanceThreshold"
     *
     * @group unit
     * @small
     */
    public function testPropertyCofinanceThreshold(): void
    {
        $this->markTestSkipped('Test for property cofinanceThreshold not implemented');
    }

    /**
     * Test attribute "cofinanceValue"
     *
     * @group unit
     * @small
     */
    public function testPropertyCofinanceValue(): void
    {
        $this->markTestSkipped('Test for property cofinanceValue not implemented');
    }
}
