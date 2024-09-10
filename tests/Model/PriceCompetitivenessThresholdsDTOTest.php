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
use OpenAPIServer\Model\PriceCompetitivenessThresholdsDTO;

/**
 * PriceCompetitivenessThresholdsDTOTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\PriceCompetitivenessThresholdsDTO
 */
class PriceCompetitivenessThresholdsDTOTest extends TestCase
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
     * Test "PriceCompetitivenessThresholdsDTO"
     */
    public function testPriceCompetitivenessThresholdsDTO()
    {
        $testPriceCompetitivenessThresholdsDTO = new PriceCompetitivenessThresholdsDTO();
        $namespacedClassname = PriceCompetitivenessThresholdsDTO::getModelsNamespace() . '\\PriceCompetitivenessThresholdsDTO';
        $this->assertSame('\\' . PriceCompetitivenessThresholdsDTO::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "PriceCompetitivenessThresholdsDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "optimalPrice"
     */
    public function testPropertyOptimalPrice()
    {
        self::markTestIncomplete(
            'Test of "optimalPrice" property in "PriceCompetitivenessThresholdsDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "averagePrice"
     */
    public function testPropertyAveragePrice()
    {
        self::markTestIncomplete(
            'Test of "averagePrice" property in "PriceCompetitivenessThresholdsDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = PriceCompetitivenessThresholdsDTO::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

