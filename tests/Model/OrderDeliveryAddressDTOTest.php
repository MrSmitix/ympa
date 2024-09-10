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
use OpenAPIServer\Model\OrderDeliveryAddressDTO;

/**
 * OrderDeliveryAddressDTOTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\OrderDeliveryAddressDTO
 */
class OrderDeliveryAddressDTOTest extends TestCase
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
     * Test "OrderDeliveryAddressDTO"
     */
    public function testOrderDeliveryAddressDTO()
    {
        $testOrderDeliveryAddressDTO = new OrderDeliveryAddressDTO();
        $namespacedClassname = OrderDeliveryAddressDTO::getModelsNamespace() . '\\OrderDeliveryAddressDTO';
        $this->assertSame('\\' . OrderDeliveryAddressDTO::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "OrderDeliveryAddressDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "country"
     */
    public function testPropertyCountry()
    {
        self::markTestIncomplete(
            'Test of "country" property in "OrderDeliveryAddressDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "postcode"
     */
    public function testPropertyPostcode()
    {
        self::markTestIncomplete(
            'Test of "postcode" property in "OrderDeliveryAddressDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "city"
     */
    public function testPropertyCity()
    {
        self::markTestIncomplete(
            'Test of "city" property in "OrderDeliveryAddressDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "district"
     */
    public function testPropertyDistrict()
    {
        self::markTestIncomplete(
            'Test of "district" property in "OrderDeliveryAddressDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "subway"
     */
    public function testPropertySubway()
    {
        self::markTestIncomplete(
            'Test of "subway" property in "OrderDeliveryAddressDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "street"
     */
    public function testPropertyStreet()
    {
        self::markTestIncomplete(
            'Test of "street" property in "OrderDeliveryAddressDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "house"
     */
    public function testPropertyHouse()
    {
        self::markTestIncomplete(
            'Test of "house" property in "OrderDeliveryAddressDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "block"
     */
    public function testPropertyBlock()
    {
        self::markTestIncomplete(
            'Test of "block" property in "OrderDeliveryAddressDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "entrance"
     */
    public function testPropertyEntrance()
    {
        self::markTestIncomplete(
            'Test of "entrance" property in "OrderDeliveryAddressDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "entryphone"
     */
    public function testPropertyEntryphone()
    {
        self::markTestIncomplete(
            'Test of "entryphone" property in "OrderDeliveryAddressDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "floor"
     */
    public function testPropertyFloor()
    {
        self::markTestIncomplete(
            'Test of "floor" property in "OrderDeliveryAddressDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "apartment"
     */
    public function testPropertyApartment()
    {
        self::markTestIncomplete(
            'Test of "apartment" property in "OrderDeliveryAddressDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "phone"
     */
    public function testPropertyPhone()
    {
        self::markTestIncomplete(
            'Test of "phone" property in "OrderDeliveryAddressDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "recipient"
     */
    public function testPropertyRecipient()
    {
        self::markTestIncomplete(
            'Test of "recipient" property in "OrderDeliveryAddressDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "gps"
     */
    public function testPropertyGps()
    {
        self::markTestIncomplete(
            'Test of "gps" property in "OrderDeliveryAddressDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = OrderDeliveryAddressDTO::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

