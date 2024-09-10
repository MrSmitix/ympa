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
use OpenAPIServer\Model\GenerateUnitedMarketplaceServicesReportRequest;

/**
 * GenerateUnitedMarketplaceServicesReportRequestTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\GenerateUnitedMarketplaceServicesReportRequest
 */
class GenerateUnitedMarketplaceServicesReportRequestTest extends TestCase
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
     * Test "GenerateUnitedMarketplaceServicesReportRequest"
     */
    public function testGenerateUnitedMarketplaceServicesReportRequest()
    {
        $testGenerateUnitedMarketplaceServicesReportRequest = new GenerateUnitedMarketplaceServicesReportRequest();
        $namespacedClassname = GenerateUnitedMarketplaceServicesReportRequest::getModelsNamespace() . '\\GenerateUnitedMarketplaceServicesReportRequest';
        $this->assertSame('\\' . GenerateUnitedMarketplaceServicesReportRequest::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "GenerateUnitedMarketplaceServicesReportRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "businessId"
     */
    public function testPropertyBusinessId()
    {
        self::markTestIncomplete(
            'Test of "businessId" property in "GenerateUnitedMarketplaceServicesReportRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "dateTimeFrom"
     */
    public function testPropertyDateTimeFrom()
    {
        self::markTestIncomplete(
            'Test of "dateTimeFrom" property in "GenerateUnitedMarketplaceServicesReportRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "dateTimeTo"
     */
    public function testPropertyDateTimeTo()
    {
        self::markTestIncomplete(
            'Test of "dateTimeTo" property in "GenerateUnitedMarketplaceServicesReportRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "dateFrom"
     */
    public function testPropertyDateFrom()
    {
        self::markTestIncomplete(
            'Test of "dateFrom" property in "GenerateUnitedMarketplaceServicesReportRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "dateTo"
     */
    public function testPropertyDateTo()
    {
        self::markTestIncomplete(
            'Test of "dateTo" property in "GenerateUnitedMarketplaceServicesReportRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "yearFrom"
     */
    public function testPropertyYearFrom()
    {
        self::markTestIncomplete(
            'Test of "yearFrom" property in "GenerateUnitedMarketplaceServicesReportRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "monthFrom"
     */
    public function testPropertyMonthFrom()
    {
        self::markTestIncomplete(
            'Test of "monthFrom" property in "GenerateUnitedMarketplaceServicesReportRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "yearTo"
     */
    public function testPropertyYearTo()
    {
        self::markTestIncomplete(
            'Test of "yearTo" property in "GenerateUnitedMarketplaceServicesReportRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "monthTo"
     */
    public function testPropertyMonthTo()
    {
        self::markTestIncomplete(
            'Test of "monthTo" property in "GenerateUnitedMarketplaceServicesReportRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "placementPrograms"
     */
    public function testPropertyPlacementPrograms()
    {
        self::markTestIncomplete(
            'Test of "placementPrograms" property in "GenerateUnitedMarketplaceServicesReportRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "inns"
     */
    public function testPropertyInns()
    {
        self::markTestIncomplete(
            'Test of "inns" property in "GenerateUnitedMarketplaceServicesReportRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "campaignIds"
     */
    public function testPropertyCampaignIds()
    {
        self::markTestIncomplete(
            'Test of "campaignIds" property in "GenerateUnitedMarketplaceServicesReportRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = GenerateUnitedMarketplaceServicesReportRequest::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

