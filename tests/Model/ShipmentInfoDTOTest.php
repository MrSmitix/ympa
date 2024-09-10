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
use OpenAPIServer\Model\ShipmentInfoDTO;

/**
 * ShipmentInfoDTOTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\ShipmentInfoDTO
 */
class ShipmentInfoDTOTest extends TestCase
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
     * Test "ShipmentInfoDTO"
     */
    public function testShipmentInfoDTO()
    {
        $testShipmentInfoDTO = new ShipmentInfoDTO();
        $namespacedClassname = ShipmentInfoDTO::getModelsNamespace() . '\\ShipmentInfoDTO';
        $this->assertSame('\\' . ShipmentInfoDTO::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "ShipmentInfoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "id"
     */
    public function testPropertyId()
    {
        self::markTestIncomplete(
            'Test of "id" property in "ShipmentInfoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "planIntervalFrom"
     */
    public function testPropertyPlanIntervalFrom()
    {
        self::markTestIncomplete(
            'Test of "planIntervalFrom" property in "ShipmentInfoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "planIntervalTo"
     */
    public function testPropertyPlanIntervalTo()
    {
        self::markTestIncomplete(
            'Test of "planIntervalTo" property in "ShipmentInfoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "shipmentType"
     */
    public function testPropertyShipmentType()
    {
        self::markTestIncomplete(
            'Test of "shipmentType" property in "ShipmentInfoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "warehouse"
     */
    public function testPropertyWarehouse()
    {
        self::markTestIncomplete(
            'Test of "warehouse" property in "ShipmentInfoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "warehouseTo"
     */
    public function testPropertyWarehouseTo()
    {
        self::markTestIncomplete(
            'Test of "warehouseTo" property in "ShipmentInfoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "externalId"
     */
    public function testPropertyExternalId()
    {
        self::markTestIncomplete(
            'Test of "externalId" property in "ShipmentInfoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "deliveryService"
     */
    public function testPropertyDeliveryService()
    {
        self::markTestIncomplete(
            'Test of "deliveryService" property in "ShipmentInfoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "palletsCount"
     */
    public function testPropertyPalletsCount()
    {
        self::markTestIncomplete(
            'Test of "palletsCount" property in "ShipmentInfoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "orderIds"
     */
    public function testPropertyOrderIds()
    {
        self::markTestIncomplete(
            'Test of "orderIds" property in "ShipmentInfoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "draftCount"
     */
    public function testPropertyDraftCount()
    {
        self::markTestIncomplete(
            'Test of "draftCount" property in "ShipmentInfoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "plannedCount"
     */
    public function testPropertyPlannedCount()
    {
        self::markTestIncomplete(
            'Test of "plannedCount" property in "ShipmentInfoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "factCount"
     */
    public function testPropertyFactCount()
    {
        self::markTestIncomplete(
            'Test of "factCount" property in "ShipmentInfoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "status"
     */
    public function testPropertyStatus()
    {
        self::markTestIncomplete(
            'Test of "status" property in "ShipmentInfoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "statusDescription"
     */
    public function testPropertyStatusDescription()
    {
        self::markTestIncomplete(
            'Test of "statusDescription" property in "ShipmentInfoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "statusUpdateTime"
     */
    public function testPropertyStatusUpdateTime()
    {
        self::markTestIncomplete(
            'Test of "statusUpdateTime" property in "ShipmentInfoDTO" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = ShipmentInfoDTO::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

