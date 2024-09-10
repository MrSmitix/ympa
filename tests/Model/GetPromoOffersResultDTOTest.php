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
use OpenAPIServer\Model\GetPromoOffersResultDTO;

/**
 * GetPromoOffersResultDTOTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\GetPromoOffersResultDTO
 */
class GetPromoOffersResultDTOTest extends TestCase
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
     * Test "GetPromoOffersResultDTO"
     */
    public function testGetPromoOffersResultDTO()
    {
        $testGetPromoOffersResultDTO = new GetPromoOffersResultDTO();
        $namespacedClassname = GetPromoOffersResultDTO::getModelsNamespace() . '\\GetPromoOffersResultDTO';
        $this->assertSame('\\' . GetPromoOffersResultDTO::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "GetPromoOffersResultDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "offers"
     */
    public function testPropertyOffers()
    {
        self::markTestIncomplete(
            'Test of "offers" property in "GetPromoOffersResultDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "paging"
     */
    public function testPropertyPaging()
    {
        self::markTestIncomplete(
            'Test of "paging" property in "GetPromoOffersResultDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = GetPromoOffersResultDTO::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

