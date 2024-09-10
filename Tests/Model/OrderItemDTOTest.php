<?php
/**
 * OrderItemDTOTest
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

use OpenAPI\Server\Model\OrderItemDTO;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * OrderItemDTOTest Class Doc Comment
 *
 * @category    Class
 * @description Список товаров в заказе.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\OrderItemDTO
 */
class OrderItemDTOTest extends TestCase
{
    protected OrderItemDTO|MockObject $object;

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
        $this->object = $this->getMockBuilder(OrderItemDTO::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(OrderItemDTO::class));
        $this->assertInstanceOf(OrderItemDTO::class, $this->object);
    }

    /**
     * Test attribute "id"
     *
     * @group unit
     * @small
     */
    public function testPropertyId(): void
    {
        $this->markTestSkipped('Test for property id not implemented');
    }

    /**
     * Test attribute "offerId"
     *
     * @group unit
     * @small
     */
    public function testPropertyOfferId(): void
    {
        $this->markTestSkipped('Test for property offerId not implemented');
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
     * Test attribute "buyerPrice"
     *
     * @group unit
     * @small
     */
    public function testPropertyBuyerPrice(): void
    {
        $this->markTestSkipped('Test for property buyerPrice not implemented');
    }

    /**
     * Test attribute "buyerPriceBeforeDiscount"
     *
     * @group unit
     * @small
     */
    public function testPropertyBuyerPriceBeforeDiscount(): void
    {
        $this->markTestSkipped('Test for property buyerPriceBeforeDiscount not implemented');
    }

    /**
     * Test attribute "priceBeforeDiscount"
     *
     * @group unit
     * @small
     */
    public function testPropertyPriceBeforeDiscount(): void
    {
        $this->markTestSkipped('Test for property priceBeforeDiscount not implemented');
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
     * Test attribute "vat"
     *
     * @group unit
     * @small
     */
    public function testPropertyVat(): void
    {
        $this->markTestSkipped('Test for property vat not implemented');
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
     * Test attribute "subsidy"
     *
     * @group unit
     * @small
     */
    public function testPropertySubsidy(): void
    {
        $this->markTestSkipped('Test for property subsidy not implemented');
    }

    /**
     * Test attribute "partnerWarehouseId"
     *
     * @group unit
     * @small
     */
    public function testPropertyPartnerWarehouseId(): void
    {
        $this->markTestSkipped('Test for property partnerWarehouseId not implemented');
    }

    /**
     * Test attribute "promos"
     *
     * @group unit
     * @small
     */
    public function testPropertyPromos(): void
    {
        $this->markTestSkipped('Test for property promos not implemented');
    }

    /**
     * Test attribute "instances"
     *
     * @group unit
     * @small
     */
    public function testPropertyInstances(): void
    {
        $this->markTestSkipped('Test for property instances not implemented');
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
     * Test attribute "subsidies"
     *
     * @group unit
     * @small
     */
    public function testPropertySubsidies(): void
    {
        $this->markTestSkipped('Test for property subsidies not implemented');
    }

    /**
     * Test attribute "requiredInstanceTypes"
     *
     * @group unit
     * @small
     */
    public function testPropertyRequiredInstanceTypes(): void
    {
        $this->markTestSkipped('Test for property requiredInstanceTypes not implemented');
    }
}
