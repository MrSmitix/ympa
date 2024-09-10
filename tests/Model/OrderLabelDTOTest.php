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
use OpenAPIServer\Model\OrderLabelDTO;

/**
 * OrderLabelDTOTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\OrderLabelDTO
 */
class OrderLabelDTOTest extends TestCase
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
     * Test "OrderLabelDTO"
     */
    public function testOrderLabelDTO()
    {
        $testOrderLabelDTO = new OrderLabelDTO();
        $namespacedClassname = OrderLabelDTO::getModelsNamespace() . '\\OrderLabelDTO';
        $this->assertSame('\\' . OrderLabelDTO::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "OrderLabelDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "orderId"
     */
    public function testPropertyOrderId()
    {
        self::markTestIncomplete(
            'Test of "orderId" property in "OrderLabelDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "placesNumber"
     */
    public function testPropertyPlacesNumber()
    {
        self::markTestIncomplete(
            'Test of "placesNumber" property in "OrderLabelDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "url"
     */
    public function testPropertyUrl()
    {
        self::markTestIncomplete(
            'Test of "url" property in "OrderLabelDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "parcelBoxLabels"
     */
    public function testPropertyParcelBoxLabels()
    {
        self::markTestIncomplete(
            'Test of "parcelBoxLabels" property in "OrderLabelDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = OrderLabelDTO::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

