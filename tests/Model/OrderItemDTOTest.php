<?php

/**
 * Партнерский API Маркета
 * PHP version 7.4
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 * The version of the OpenAPI document: LATEST
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */
namespace OpenAPIServer\Model;

use PHPUnit\Framework\TestCase;
use OpenAPIServer\Model\OrderItemDTO;

/**
 * OrderItemDTOTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\OrderItemDTO
 */
class OrderItemDTOTest extends TestCase
{

    /**
     * Setup before running any test cases
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
     * Test "OrderItemDTO"
     */
    public function testOrderItemDTO()
    {
        $testOrderItemDTO = new OrderItemDTO();
        $namespacedClassname = OrderItemDTO::getModelsNamespace() . '\\OrderItemDTO';
        $this->assertSame('\\' . OrderItemDTO::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "id"
     */
    public function testPropertyId()
    {
        self::markTestIncomplete(
            'Test of "id" property in "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "offerId"
     */
    public function testPropertyOfferId()
    {
        self::markTestIncomplete(
            'Test of "offerId" property in "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "offerName"
     */
    public function testPropertyOfferName()
    {
        self::markTestIncomplete(
            'Test of "offerName" property in "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "price"
     */
    public function testPropertyPrice()
    {
        self::markTestIncomplete(
            'Test of "price" property in "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "buyerPrice"
     */
    public function testPropertyBuyerPrice()
    {
        self::markTestIncomplete(
            'Test of "buyerPrice" property in "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "buyerPriceBeforeDiscount"
     */
    public function testPropertyBuyerPriceBeforeDiscount()
    {
        self::markTestIncomplete(
            'Test of "buyerPriceBeforeDiscount" property in "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "priceBeforeDiscount"
     */
    public function testPropertyPriceBeforeDiscount()
    {
        self::markTestIncomplete(
            'Test of "priceBeforeDiscount" property in "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "count"
     */
    public function testPropertyCount()
    {
        self::markTestIncomplete(
            'Test of "count" property in "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "vat"
     */
    public function testPropertyVat()
    {
        self::markTestIncomplete(
            'Test of "vat" property in "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "shopSku"
     */
    public function testPropertyShopSku()
    {
        self::markTestIncomplete(
            'Test of "shopSku" property in "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "subsidy"
     */
    public function testPropertySubsidy()
    {
        self::markTestIncomplete(
            'Test of "subsidy" property in "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "partnerWarehouseId"
     */
    public function testPropertyPartnerWarehouseId()
    {
        self::markTestIncomplete(
            'Test of "partnerWarehouseId" property in "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "promos"
     */
    public function testPropertyPromos()
    {
        self::markTestIncomplete(
            'Test of "promos" property in "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "instances"
     */
    public function testPropertyInstances()
    {
        self::markTestIncomplete(
            'Test of "instances" property in "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "details"
     */
    public function testPropertyDetails()
    {
        self::markTestIncomplete(
            'Test of "details" property in "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "subsidies"
     */
    public function testPropertySubsidies()
    {
        self::markTestIncomplete(
            'Test of "subsidies" property in "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "requiredInstanceTypes"
     */
    public function testPropertyRequiredInstanceTypes()
    {
        self::markTestIncomplete(
            'Test of "requiredInstanceTypes" property in "OrderItemDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = OrderItemDTO::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

