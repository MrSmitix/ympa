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
use OpenAPIServer\Model\SearchModelsResponse;

/**
 * SearchModelsResponseTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\SearchModelsResponse
 */
class SearchModelsResponseTest extends TestCase
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
     * Test "SearchModelsResponse"
     */
    public function testSearchModelsResponse()
    {
        $testSearchModelsResponse = new SearchModelsResponse();
        $namespacedClassname = SearchModelsResponse::getModelsNamespace() . '\\SearchModelsResponse';
        $this->assertSame('\\' . SearchModelsResponse::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "SearchModelsResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "models"
     */
    public function testPropertyModels()
    {
        self::markTestIncomplete(
            'Test of "models" property in "SearchModelsResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "currency"
     */
    public function testPropertyCurrency()
    {
        self::markTestIncomplete(
            'Test of "currency" property in "SearchModelsResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "regionId"
     */
    public function testPropertyRegionId()
    {
        self::markTestIncomplete(
            'Test of "regionId" property in "SearchModelsResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "pager"
     */
    public function testPropertyPager()
    {
        self::markTestIncomplete(
            'Test of "pager" property in "SearchModelsResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = SearchModelsResponse::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

