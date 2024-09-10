/*
Партнерский API Маркета

Testing OutletLicensesAPIService

*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech);

package ympa_go_client

import (
	"context"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
	"testing"
	openapiclient "github.com/yandex-market/yandex-market-partner-api"
)

func Test_ympa_go_client_OutletLicensesAPIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test OutletLicensesAPIService DeleteOutletLicenses", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var campaignId int64

		resp, httpRes, err := apiClient.OutletLicensesAPI.DeleteOutletLicenses(context.Background(), campaignId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OutletLicensesAPIService GetOutletLicenses", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var campaignId int64

		resp, httpRes, err := apiClient.OutletLicensesAPI.GetOutletLicenses(context.Background(), campaignId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OutletLicensesAPIService UpdateOutletLicenses", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var campaignId int64

		resp, httpRes, err := apiClient.OutletLicensesAPI.UpdateOutletLicenses(context.Background(), campaignId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
