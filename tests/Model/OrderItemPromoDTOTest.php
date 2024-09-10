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
use OpenAPIServer\Model\OrderItemPromoDTO;

/**
 * OrderItemPromoDTOTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\OrderItemPromoDTO
 */
class OrderItemPromoDTOTest extends TestCase
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
     * Test "OrderItemPromoDTO"
     */
    public function testOrderItemPromoDTO()
    {
        $testOrderItemPromoDTO = new OrderItemPromoDTO();
        $namespacedClassname = OrderItemPromoDTO::getModelsNamespace() . '\\OrderItemPromoDTO';
        $this->assertSame('\\' . OrderItemPromoDTO::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "OrderItemPromoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "type"
     */
    public function testPropertyType()
    {
        self::markTestIncomplete(
            'Test of "type" property in "OrderItemPromoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "discount"
     */
    public function testPropertyDiscount()
    {
        self::markTestIncomplete(
            'Test of "discount" property in "OrderItemPromoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "subsidy"
     */
    public function testPropertySubsidy()
    {
        self::markTestIncomplete(
            'Test of "subsidy" property in "OrderItemPromoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "shopPromoId"
     */
    public function testPropertyShopPromoId()
    {
        self::markTestIncomplete(
            'Test of "shopPromoId" property in "OrderItemPromoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "marketPromoId"
     */
    public function testPropertyMarketPromoId()
    {
        self::markTestIncomplete(
            'Test of "marketPromoId" property in "OrderItemPromoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = OrderItemPromoDTO::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

