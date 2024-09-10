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
use OpenAPIServer\Model\OrdersStatsOrderDTO;

/**
 * OrdersStatsOrderDTOTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\OrdersStatsOrderDTO
 */
class OrdersStatsOrderDTOTest extends TestCase
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
     * Test "OrdersStatsOrderDTO"
     */
    public function testOrdersStatsOrderDTO()
    {
        $testOrdersStatsOrderDTO = new OrdersStatsOrderDTO();
        $namespacedClassname = OrdersStatsOrderDTO::getModelsNamespace() . '\\OrdersStatsOrderDTO';
        $this->assertSame('\\' . OrdersStatsOrderDTO::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "OrdersStatsOrderDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "id"
     */
    public function testPropertyId()
    {
        self::markTestIncomplete(
            'Test of "id" property in "OrdersStatsOrderDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "creationDate"
     */
    public function testPropertyCreationDate()
    {
        self::markTestIncomplete(
            'Test of "creationDate" property in "OrdersStatsOrderDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "statusUpdateDate"
     */
    public function testPropertyStatusUpdateDate()
    {
        self::markTestIncomplete(
            'Test of "statusUpdateDate" property in "OrdersStatsOrderDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "status"
     */
    public function testPropertyStatus()
    {
        self::markTestIncomplete(
            'Test of "status" property in "OrdersStatsOrderDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "partnerOrderId"
     */
    public function testPropertyPartnerOrderId()
    {
        self::markTestIncomplete(
            'Test of "partnerOrderId" property in "OrdersStatsOrderDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "paymentType"
     */
    public function testPropertyPaymentType()
    {
        self::markTestIncomplete(
            'Test of "paymentType" property in "OrdersStatsOrderDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "fake"
     */
    public function testPropertyFake()
    {
        self::markTestIncomplete(
            'Test of "fake" property in "OrdersStatsOrderDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "deliveryRegion"
     */
    public function testPropertyDeliveryRegion()
    {
        self::markTestIncomplete(
            'Test of "deliveryRegion" property in "OrdersStatsOrderDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "items"
     */
    public function testPropertyItems()
    {
        self::markTestIncomplete(
            'Test of "items" property in "OrdersStatsOrderDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "initialItems"
     */
    public function testPropertyInitialItems()
    {
        self::markTestIncomplete(
            'Test of "initialItems" property in "OrdersStatsOrderDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "payments"
     */
    public function testPropertyPayments()
    {
        self::markTestIncomplete(
            'Test of "payments" property in "OrdersStatsOrderDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "commissions"
     */
    public function testPropertyCommissions()
    {
        self::markTestIncomplete(
            'Test of "commissions" property in "OrdersStatsOrderDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = OrdersStatsOrderDTO::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

