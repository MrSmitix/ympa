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
use OpenAPIServer\Model\FeedbackOrderDTO;

/**
 * FeedbackOrderDTOTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\FeedbackOrderDTO
 */
class FeedbackOrderDTOTest extends TestCase
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
     * Test "FeedbackOrderDTO"
     */
    public function testFeedbackOrderDTO()
    {
        $testFeedbackOrderDTO = new FeedbackOrderDTO();
        $namespacedClassname = FeedbackOrderDTO::getModelsNamespace() . '\\FeedbackOrderDTO';
        $this->assertSame('\\' . FeedbackOrderDTO::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "FeedbackOrderDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "shopOrderId"
     */
    public function testPropertyShopOrderId()
    {
        self::markTestIncomplete(
            'Test of "shopOrderId" property in "FeedbackOrderDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "delivery"
     */
    public function testPropertyDelivery()
    {
        self::markTestIncomplete(
            'Test of "delivery" property in "FeedbackOrderDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = FeedbackOrderDTO::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

