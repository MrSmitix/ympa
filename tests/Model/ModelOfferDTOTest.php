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
use OpenAPIServer\Model\ModelOfferDTO;

/**
 * ModelOfferDTOTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\ModelOfferDTO
 */
class ModelOfferDTOTest extends TestCase
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
     * Test "ModelOfferDTO"
     */
    public function testModelOfferDTO()
    {
        $testModelOfferDTO = new ModelOfferDTO();
        $namespacedClassname = ModelOfferDTO::getModelsNamespace() . '\\ModelOfferDTO';
        $this->assertSame('\\' . ModelOfferDTO::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "ModelOfferDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "discount"
     */
    public function testPropertyDiscount()
    {
        self::markTestIncomplete(
            'Test of "discount" property in "ModelOfferDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "name"
     */
    public function testPropertyName()
    {
        self::markTestIncomplete(
            'Test of "name" property in "ModelOfferDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "pos"
     */
    public function testPropertyPos()
    {
        self::markTestIncomplete(
            'Test of "pos" property in "ModelOfferDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "preDiscountPrice"
     */
    public function testPropertyPreDiscountPrice()
    {
        self::markTestIncomplete(
            'Test of "preDiscountPrice" property in "ModelOfferDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "price"
     */
    public function testPropertyPrice()
    {
        self::markTestIncomplete(
            'Test of "price" property in "ModelOfferDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "regionId"
     */
    public function testPropertyRegionId()
    {
        self::markTestIncomplete(
            'Test of "regionId" property in "ModelOfferDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "shippingCost"
     */
    public function testPropertyShippingCost()
    {
        self::markTestIncomplete(
            'Test of "shippingCost" property in "ModelOfferDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "shopName"
     */
    public function testPropertyShopName()
    {
        self::markTestIncomplete(
            'Test of "shopName" property in "ModelOfferDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "shopRating"
     */
    public function testPropertyShopRating()
    {
        self::markTestIncomplete(
            'Test of "shopRating" property in "ModelOfferDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "inStock"
     */
    public function testPropertyInStock()
    {
        self::markTestIncomplete(
            'Test of "inStock" property in "ModelOfferDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = ModelOfferDTO::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

