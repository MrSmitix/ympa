{-# LANGUAGE CPP #-}
{-# OPTIONS_GHC -fno-warn-unused-imports -fno-warn-unused-matches #-}

module Instances where

import ПартнерскийAPIМаркета.Model
import ПартнерскийAPIМаркета.Core

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.HashMap.Strict as HM
import qualified Data.Set as Set
import qualified Data.Text as T
import qualified Data.Time as TI
import qualified Data.Vector as V
import Data.String (fromString)

import Control.Monad
import Data.Char (isSpace)
import Data.List (sort)
import Test.QuickCheck

import ApproxEq

instance Arbitrary T.Text where
  arbitrary = T.pack <$> arbitrary

instance Arbitrary TI.Day where
  arbitrary = TI.ModifiedJulianDay . (2000 +) <$> arbitrary
  shrink = (TI.ModifiedJulianDay <$>) . shrink . TI.toModifiedJulianDay

instance Arbitrary TI.UTCTime where
  arbitrary =
    TI.UTCTime <$> arbitrary <*> (TI.secondsToDiffTime <$> choose (0, 86401))

instance Arbitrary BL.ByteString where
    arbitrary = BL.pack <$> arbitrary
    shrink xs = BL.pack <$> shrink (BL.unpack xs)

instance Arbitrary ByteArray where
    arbitrary = ByteArray <$> arbitrary
    shrink (ByteArray xs) = ByteArray <$> shrink xs

instance Arbitrary Binary where
    arbitrary = Binary <$> arbitrary
    shrink (Binary xs) = Binary <$> shrink xs

instance Arbitrary DateTime where
    arbitrary = DateTime <$> arbitrary
    shrink (DateTime xs) = DateTime <$> shrink xs

instance Arbitrary Date where
    arbitrary = Date <$> arbitrary
    shrink (Date xs) = Date <$> shrink xs

#if MIN_VERSION_aeson(2,0,0)
#else
-- | A naive Arbitrary instance for A.Value:
instance Arbitrary A.Value where
  arbitrary = arbitraryValue
#endif

arbitraryValue :: Gen A.Value
arbitraryValue =
  frequency [(3, simpleTypes), (1, arrayTypes), (1, objectTypes)]
    where
      simpleTypes :: Gen A.Value
      simpleTypes =
        frequency
          [ (1, return A.Null)
          , (2, liftM A.Bool (arbitrary :: Gen Bool))
          , (2, liftM (A.Number . fromIntegral) (arbitrary :: Gen Int))
          , (2, liftM (A.String . T.pack) (arbitrary :: Gen String))
          ]
      mapF (k, v) = (fromString k, v)
      simpleAndArrays = frequency [(1, sized sizedArray), (4, simpleTypes)]
      arrayTypes = sized sizedArray
      objectTypes = sized sizedObject
      sizedArray n = liftM (A.Array . V.fromList) $ replicateM n simpleTypes
      sizedObject n =
        liftM (A.object . map mapF) $
        replicateM n $ (,) <$> (arbitrary :: Gen String) <*> simpleAndArrays

-- | Checks if a given list has no duplicates in _O(n log n)_.
hasNoDups
  :: (Ord a)
  => [a] -> Bool
hasNoDups = go Set.empty
  where
    go _ [] = True
    go s (x:xs)
      | s' <- Set.insert x s
      , Set.size s' > Set.size s = go s' xs
      | otherwise = False

instance ApproxEq TI.Day where
  (=~) = (==)

arbitraryReduced :: Arbitrary a => Int -> Gen a
arbitraryReduced n = resize (n `div` 2) arbitrary

arbitraryReducedMaybe :: Arbitrary a => Int -> Gen (Maybe a)
arbitraryReducedMaybe 0 = elements [Nothing]
arbitraryReducedMaybe n = arbitraryReduced n

arbitraryReducedMaybeValue :: Int -> Gen (Maybe A.Value)
arbitraryReducedMaybeValue 0 = elements [Nothing]
arbitraryReducedMaybeValue n = do
  generated <- arbitraryReduced n
  if generated == Just A.Null
    then return Nothing
    else return generated

-- * Models

instance Arbitrary AcceptOrderCancellationRequest where
  arbitrary = sized genAcceptOrderCancellationRequest

genAcceptOrderCancellationRequest :: Int -> Gen AcceptOrderCancellationRequest
genAcceptOrderCancellationRequest n =
  AcceptOrderCancellationRequest
    <$> arbitrary -- acceptOrderCancellationRequestAccepted :: Bool
    <*> arbitraryReducedMaybe n -- acceptOrderCancellationRequestReason :: Maybe OrderCancellationReasonType
  
instance Arbitrary AddHiddenOffersRequest where
  arbitrary = sized genAddHiddenOffersRequest

genAddHiddenOffersRequest :: Int -> Gen AddHiddenOffersRequest
genAddHiddenOffersRequest n =
  AddHiddenOffersRequest
    <$> arbitraryReduced n -- addHiddenOffersRequestHiddenOffers :: [HiddenOfferDTO]
  
instance Arbitrary AddOffersToArchiveDTO where
  arbitrary = sized genAddOffersToArchiveDTO

genAddOffersToArchiveDTO :: Int -> Gen AddOffersToArchiveDTO
genAddOffersToArchiveDTO n =
  AddOffersToArchiveDTO
    <$> arbitraryReducedMaybe n -- addOffersToArchiveDTONotArchivedOffers :: Maybe [AddOffersToArchiveErrorDTO]
  
instance Arbitrary AddOffersToArchiveErrorDTO where
  arbitrary = sized genAddOffersToArchiveErrorDTO

genAddOffersToArchiveErrorDTO :: Int -> Gen AddOffersToArchiveErrorDTO
genAddOffersToArchiveErrorDTO n =
  AddOffersToArchiveErrorDTO
    <$> arbitrary -- addOffersToArchiveErrorDTOOfferId :: Text
    <*> arbitraryReduced n -- addOffersToArchiveErrorDTOError :: AddOffersToArchiveErrorType
  
instance Arbitrary AddOffersToArchiveRequest where
  arbitrary = sized genAddOffersToArchiveRequest

genAddOffersToArchiveRequest :: Int -> Gen AddOffersToArchiveRequest
genAddOffersToArchiveRequest n =
  AddOffersToArchiveRequest
    <$> arbitrary -- addOffersToArchiveRequestOfferIds :: [Text]
  
instance Arbitrary AddOffersToArchiveResponse where
  arbitrary = sized genAddOffersToArchiveResponse

genAddOffersToArchiveResponse :: Int -> Gen AddOffersToArchiveResponse
genAddOffersToArchiveResponse n =
  AddOffersToArchiveResponse
    <$> arbitraryReducedMaybe n -- addOffersToArchiveResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- addOffersToArchiveResponseResult :: Maybe AddOffersToArchiveDTO
  
instance Arbitrary AgeDTO where
  arbitrary = sized genAgeDTO

genAgeDTO :: Int -> Gen AgeDTO
genAgeDTO n =
  AgeDTO
    <$> arbitrary -- ageDTOValue :: Double
    <*> arbitraryReduced n -- ageDTOAgeUnit :: AgeUnitType
  
instance Arbitrary ApiClientDataErrorResponse where
  arbitrary = sized genApiClientDataErrorResponse

genApiClientDataErrorResponse :: Int -> Gen ApiClientDataErrorResponse
genApiClientDataErrorResponse n =
  ApiClientDataErrorResponse
    <$> arbitraryReducedMaybe n -- apiClientDataErrorResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- apiClientDataErrorResponseErrors :: Maybe [ApiErrorDTO]
  
instance Arbitrary ApiErrorDTO where
  arbitrary = sized genApiErrorDTO

genApiErrorDTO :: Int -> Gen ApiErrorDTO
genApiErrorDTO n =
  ApiErrorDTO
    <$> arbitrary -- apiErrorDTOCode :: Text
    <*> arbitraryReducedMaybe n -- apiErrorDTOMessage :: Maybe Text
  
instance Arbitrary ApiErrorResponse where
  arbitrary = sized genApiErrorResponse

genApiErrorResponse :: Int -> Gen ApiErrorResponse
genApiErrorResponse n =
  ApiErrorResponse
    <$> arbitraryReducedMaybe n -- apiErrorResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- apiErrorResponseErrors :: Maybe [ApiErrorDTO]
  
instance Arbitrary ApiForbiddenErrorResponse where
  arbitrary = sized genApiForbiddenErrorResponse

genApiForbiddenErrorResponse :: Int -> Gen ApiForbiddenErrorResponse
genApiForbiddenErrorResponse n =
  ApiForbiddenErrorResponse
    <$> arbitraryReducedMaybe n -- apiForbiddenErrorResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- apiForbiddenErrorResponseErrors :: Maybe [ApiErrorDTO]
  
instance Arbitrary ApiLimitErrorResponse where
  arbitrary = sized genApiLimitErrorResponse

genApiLimitErrorResponse :: Int -> Gen ApiLimitErrorResponse
genApiLimitErrorResponse n =
  ApiLimitErrorResponse
    <$> arbitraryReducedMaybe n -- apiLimitErrorResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- apiLimitErrorResponseErrors :: Maybe [ApiErrorDTO]
  
instance Arbitrary ApiLockedErrorResponse where
  arbitrary = sized genApiLockedErrorResponse

genApiLockedErrorResponse :: Int -> Gen ApiLockedErrorResponse
genApiLockedErrorResponse n =
  ApiLockedErrorResponse
    <$> arbitraryReducedMaybe n -- apiLockedErrorResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- apiLockedErrorResponseErrors :: Maybe [ApiErrorDTO]
  
instance Arbitrary ApiNotFoundErrorResponse where
  arbitrary = sized genApiNotFoundErrorResponse

genApiNotFoundErrorResponse :: Int -> Gen ApiNotFoundErrorResponse
genApiNotFoundErrorResponse n =
  ApiNotFoundErrorResponse
    <$> arbitraryReducedMaybe n -- apiNotFoundErrorResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- apiNotFoundErrorResponseErrors :: Maybe [ApiErrorDTO]
  
instance Arbitrary ApiResponse where
  arbitrary = sized genApiResponse

genApiResponse :: Int -> Gen ApiResponse
genApiResponse n =
  ApiResponse
    <$> arbitraryReducedMaybe n -- apiResponseStatus :: Maybe ApiResponseStatusType
  
instance Arbitrary ApiServerErrorResponse where
  arbitrary = sized genApiServerErrorResponse

genApiServerErrorResponse :: Int -> Gen ApiServerErrorResponse
genApiServerErrorResponse n =
  ApiServerErrorResponse
    <$> arbitraryReducedMaybe n -- apiServerErrorResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- apiServerErrorResponseErrors :: Maybe [ApiErrorDTO]
  
instance Arbitrary ApiUnauthorizedErrorResponse where
  arbitrary = sized genApiUnauthorizedErrorResponse

genApiUnauthorizedErrorResponse :: Int -> Gen ApiUnauthorizedErrorResponse
genApiUnauthorizedErrorResponse n =
  ApiUnauthorizedErrorResponse
    <$> arbitraryReducedMaybe n -- apiUnauthorizedErrorResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- apiUnauthorizedErrorResponseErrors :: Maybe [ApiErrorDTO]
  
instance Arbitrary BaseCampaignOfferDTO where
  arbitrary = sized genBaseCampaignOfferDTO

genBaseCampaignOfferDTO :: Int -> Gen BaseCampaignOfferDTO
genBaseCampaignOfferDTO n =
  BaseCampaignOfferDTO
    <$> arbitrary -- baseCampaignOfferDTOOfferId :: Text
    <*> arbitraryReducedMaybe n -- baseCampaignOfferDTOQuantum :: Maybe QuantumDTO
    <*> arbitraryReducedMaybe n -- baseCampaignOfferDTOAvailable :: Maybe Bool
  
instance Arbitrary BaseOfferDTO where
  arbitrary = sized genBaseOfferDTO

genBaseOfferDTO :: Int -> Gen BaseOfferDTO
genBaseOfferDTO n =
  BaseOfferDTO
    <$> arbitrary -- baseOfferDTOOfferId :: Text
    <*> arbitraryReducedMaybe n -- baseOfferDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- baseOfferDTOMarketCategoryId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- baseOfferDTOCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- baseOfferDTOPictures :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- baseOfferDTOVideos :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- baseOfferDTOManuals :: Maybe [OfferManualDTO]
    <*> arbitraryReducedMaybe n -- baseOfferDTOVendor :: Maybe Text
    <*> arbitraryReducedMaybe n -- baseOfferDTOBarcodes :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- baseOfferDTODescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- baseOfferDTOManufacturerCountries :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- baseOfferDTOWeightDimensions :: Maybe OfferWeightDimensionsDTO
    <*> arbitraryReducedMaybe n -- baseOfferDTOVendorCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- baseOfferDTOTags :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- baseOfferDTOShelfLife :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- baseOfferDTOLifeTime :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- baseOfferDTOGuaranteePeriod :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- baseOfferDTOCustomsCommodityCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- baseOfferDTOCertificates :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- baseOfferDTOBoxCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- baseOfferDTOCondition :: Maybe OfferConditionDTO
    <*> arbitraryReducedMaybe n -- baseOfferDTOType :: Maybe OfferType
    <*> arbitraryReducedMaybe n -- baseOfferDTODownloadable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- baseOfferDTOAdult :: Maybe Bool
    <*> arbitraryReducedMaybe n -- baseOfferDTOAge :: Maybe AgeDTO
    <*> arbitraryReducedMaybe n -- baseOfferDTOParams :: Maybe [OfferParamDTO]
  
instance Arbitrary BasePriceDTO where
  arbitrary = sized genBasePriceDTO

genBasePriceDTO :: Int -> Gen BasePriceDTO
genBasePriceDTO n =
  BasePriceDTO
    <$> arbitrary -- basePriceDTOValue :: Double
    <*> arbitraryReduced n -- basePriceDTOCurrencyId :: CurrencyType
  
instance Arbitrary BaseShipmentDTO where
  arbitrary = sized genBaseShipmentDTO

genBaseShipmentDTO :: Int -> Gen BaseShipmentDTO
genBaseShipmentDTO n =
  BaseShipmentDTO
    <$> arbitraryReducedMaybe n -- baseShipmentDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- baseShipmentDTOPlanIntervalFrom :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- baseShipmentDTOPlanIntervalTo :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- baseShipmentDTOShipmentType :: Maybe ShipmentType
    <*> arbitraryReducedMaybe n -- baseShipmentDTOWarehouse :: Maybe PartnerShipmentWarehouseDTO
    <*> arbitraryReducedMaybe n -- baseShipmentDTOWarehouseTo :: Maybe PartnerShipmentWarehouseDTO
    <*> arbitraryReducedMaybe n -- baseShipmentDTOExternalId :: Maybe Text
    <*> arbitraryReducedMaybe n -- baseShipmentDTODeliveryService :: Maybe DeliveryServiceDTO
    <*> arbitraryReducedMaybe n -- baseShipmentDTOPalletsCount :: Maybe PalletsCountDTO
    <*> arbitrary -- baseShipmentDTOOrderIds :: [Integer]
    <*> arbitraryReducedMaybe n -- baseShipmentDTODraftCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- baseShipmentDTOPlannedCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- baseShipmentDTOFactCount :: Maybe Int
  
instance Arbitrary BidRecommendationItemDTO where
  arbitrary = sized genBidRecommendationItemDTO

genBidRecommendationItemDTO :: Int -> Gen BidRecommendationItemDTO
genBidRecommendationItemDTO n =
  BidRecommendationItemDTO
    <$> arbitrary -- bidRecommendationItemDTOBid :: Int
    <*> arbitrary -- bidRecommendationItemDTOShowPercent :: Integer
  
instance Arbitrary BriefOrderItemDTO where
  arbitrary = sized genBriefOrderItemDTO

genBriefOrderItemDTO :: Int -> Gen BriefOrderItemDTO
genBriefOrderItemDTO n =
  BriefOrderItemDTO
    <$> arbitraryReducedMaybe n -- briefOrderItemDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- briefOrderItemDTOVat :: Maybe OrderVatType
    <*> arbitraryReducedMaybe n -- briefOrderItemDTOCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- briefOrderItemDTOPrice :: Maybe Double
    <*> arbitraryReducedMaybe n -- briefOrderItemDTOOfferName :: Maybe Text
    <*> arbitraryReducedMaybe n -- briefOrderItemDTOOfferId :: Maybe Text
    <*> arbitraryReducedMaybe n -- briefOrderItemDTOInstances :: Maybe [OrderItemInstanceDTO]
  
instance Arbitrary BriefOrderItemInstanceDTO where
  arbitrary = sized genBriefOrderItemInstanceDTO

genBriefOrderItemInstanceDTO :: Int -> Gen BriefOrderItemInstanceDTO
genBriefOrderItemInstanceDTO n =
  BriefOrderItemInstanceDTO
    <$> arbitraryReducedMaybe n -- briefOrderItemInstanceDTOCis :: Maybe Text
    <*> arbitraryReducedMaybe n -- briefOrderItemInstanceDTOUin :: Maybe Text
    <*> arbitraryReducedMaybe n -- briefOrderItemInstanceDTORnpt :: Maybe Text
    <*> arbitraryReducedMaybe n -- briefOrderItemInstanceDTOGtd :: Maybe Text
  
instance Arbitrary BusinessDTO where
  arbitrary = sized genBusinessDTO

genBusinessDTO :: Int -> Gen BusinessDTO
genBusinessDTO n =
  BusinessDTO
    <$> arbitraryReducedMaybe n -- businessDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- businessDTOName :: Maybe Text
  
instance Arbitrary BusinessSettingsDTO where
  arbitrary = sized genBusinessSettingsDTO

genBusinessSettingsDTO :: Int -> Gen BusinessSettingsDTO
genBusinessSettingsDTO n =
  BusinessSettingsDTO
    <$> arbitraryReducedMaybe n -- businessSettingsDTOOnlyDefaultPrice :: Maybe Bool
    <*> arbitraryReducedMaybe n -- businessSettingsDTOCurrency :: Maybe CurrencyType
  
instance Arbitrary CalculateTariffsOfferDTO where
  arbitrary = sized genCalculateTariffsOfferDTO

genCalculateTariffsOfferDTO :: Int -> Gen CalculateTariffsOfferDTO
genCalculateTariffsOfferDTO n =
  CalculateTariffsOfferDTO
    <$> arbitrary -- calculateTariffsOfferDTOCategoryId :: Integer
    <*> arbitrary -- calculateTariffsOfferDTOPrice :: Double
    <*> arbitrary -- calculateTariffsOfferDTOLength :: Double
    <*> arbitrary -- calculateTariffsOfferDTOWidth :: Double
    <*> arbitrary -- calculateTariffsOfferDTOHeight :: Double
    <*> arbitrary -- calculateTariffsOfferDTOWeight :: Double
    <*> arbitraryReducedMaybe n -- calculateTariffsOfferDTOQuantity :: Maybe Int
  
instance Arbitrary CalculateTariffsOfferInfoDTO where
  arbitrary = sized genCalculateTariffsOfferInfoDTO

genCalculateTariffsOfferInfoDTO :: Int -> Gen CalculateTariffsOfferInfoDTO
genCalculateTariffsOfferInfoDTO n =
  CalculateTariffsOfferInfoDTO
    <$> arbitraryReduced n -- calculateTariffsOfferInfoDTOOffer :: CalculateTariffsOfferDTO
    <*> arbitraryReduced n -- calculateTariffsOfferInfoDTOTariffs :: [CalculatedTariffDTO]
  
instance Arbitrary CalculateTariffsParametersDTO where
  arbitrary = sized genCalculateTariffsParametersDTO

genCalculateTariffsParametersDTO :: Int -> Gen CalculateTariffsParametersDTO
genCalculateTariffsParametersDTO n =
  CalculateTariffsParametersDTO
    <$> arbitraryReducedMaybe n -- calculateTariffsParametersDTOCampaignId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- calculateTariffsParametersDTOSellingProgram :: Maybe SellingProgramType
    <*> arbitraryReducedMaybe n -- calculateTariffsParametersDTOFrequency :: Maybe PaymentFrequencyType
  
instance Arbitrary CalculateTariffsRequest where
  arbitrary = sized genCalculateTariffsRequest

genCalculateTariffsRequest :: Int -> Gen CalculateTariffsRequest
genCalculateTariffsRequest n =
  CalculateTariffsRequest
    <$> arbitraryReduced n -- calculateTariffsRequestParameters :: CalculateTariffsParametersDTO
    <*> arbitraryReduced n -- calculateTariffsRequestOffers :: [CalculateTariffsOfferDTO]
  
instance Arbitrary CalculateTariffsResponse where
  arbitrary = sized genCalculateTariffsResponse

genCalculateTariffsResponse :: Int -> Gen CalculateTariffsResponse
genCalculateTariffsResponse n =
  CalculateTariffsResponse
    <$> arbitraryReducedMaybe n -- calculateTariffsResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- calculateTariffsResponseResult :: Maybe CalculateTariffsResponseDTO
  
instance Arbitrary CalculateTariffsResponseDTO where
  arbitrary = sized genCalculateTariffsResponseDTO

genCalculateTariffsResponseDTO :: Int -> Gen CalculateTariffsResponseDTO
genCalculateTariffsResponseDTO n =
  CalculateTariffsResponseDTO
    <$> arbitraryReduced n -- calculateTariffsResponseDTOOffers :: [CalculateTariffsOfferInfoDTO]
  
instance Arbitrary CalculatedTariffDTO where
  arbitrary = sized genCalculatedTariffDTO

genCalculatedTariffDTO :: Int -> Gen CalculatedTariffDTO
genCalculatedTariffDTO n =
  CalculatedTariffDTO
    <$> arbitraryReduced n -- calculatedTariffDTOType :: CalculatedTariffType
    <*> arbitraryReducedMaybe n -- calculatedTariffDTOAmount :: Maybe Double
    <*> arbitraryReduced n -- calculatedTariffDTOParameters :: [TariffParameterDTO]
  
instance Arbitrary CampaignDTO where
  arbitrary = sized genCampaignDTO

genCampaignDTO :: Int -> Gen CampaignDTO
genCampaignDTO n =
  CampaignDTO
    <$> arbitraryReducedMaybe n -- campaignDTODomain :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- campaignDTOClientId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- campaignDTOBusiness :: Maybe BusinessDTO
    <*> arbitraryReducedMaybe n -- campaignDTOPlacementType :: Maybe PlacementType
  
instance Arbitrary CampaignQualityRatingDTO where
  arbitrary = sized genCampaignQualityRatingDTO

genCampaignQualityRatingDTO :: Int -> Gen CampaignQualityRatingDTO
genCampaignQualityRatingDTO n =
  CampaignQualityRatingDTO
    <$> arbitrary -- campaignQualityRatingDTOCampaignId :: Integer
    <*> arbitraryReduced n -- campaignQualityRatingDTORatings :: [QualityRatingDTO]
  
instance Arbitrary CampaignSettingsDTO where
  arbitrary = sized genCampaignSettingsDTO

genCampaignSettingsDTO :: Int -> Gen CampaignSettingsDTO
genCampaignSettingsDTO n =
  CampaignSettingsDTO
    <$> arbitraryReducedMaybe n -- campaignSettingsDTOCountryRegion :: Maybe Integer
    <*> arbitraryReducedMaybe n -- campaignSettingsDTOShopName :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignSettingsDTOShowInContext :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignSettingsDTOShowInPremium :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignSettingsDTOUseOpenStat :: Maybe Bool
    <*> arbitraryReducedMaybe n -- campaignSettingsDTOLocalRegion :: Maybe CampaignSettingsLocalRegionDTO
  
instance Arbitrary CampaignSettingsDeliveryDTO where
  arbitrary = sized genCampaignSettingsDeliveryDTO

genCampaignSettingsDeliveryDTO :: Int -> Gen CampaignSettingsDeliveryDTO
genCampaignSettingsDeliveryDTO n =
  CampaignSettingsDeliveryDTO
    <$> arbitraryReducedMaybe n -- campaignSettingsDeliveryDTOSchedule :: Maybe CampaignSettingsScheduleDTO
  
instance Arbitrary CampaignSettingsLocalRegionDTO where
  arbitrary = sized genCampaignSettingsLocalRegionDTO

genCampaignSettingsLocalRegionDTO :: Int -> Gen CampaignSettingsLocalRegionDTO
genCampaignSettingsLocalRegionDTO n =
  CampaignSettingsLocalRegionDTO
    <$> arbitraryReducedMaybe n -- campaignSettingsLocalRegionDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- campaignSettingsLocalRegionDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignSettingsLocalRegionDTOType :: Maybe RegionType
    <*> arbitraryReducedMaybe n -- campaignSettingsLocalRegionDTODeliveryOptionsSource :: Maybe CampaignSettingsScheduleSourceType
    <*> arbitraryReducedMaybe n -- campaignSettingsLocalRegionDTODelivery :: Maybe CampaignSettingsDeliveryDTO
  
instance Arbitrary CampaignSettingsScheduleDTO where
  arbitrary = sized genCampaignSettingsScheduleDTO

genCampaignSettingsScheduleDTO :: Int -> Gen CampaignSettingsScheduleDTO
genCampaignSettingsScheduleDTO n =
  CampaignSettingsScheduleDTO
    <$> arbitraryReducedMaybe n -- campaignSettingsScheduleDTOAvailableOnHolidays :: Maybe Bool
    <*> arbitrary -- campaignSettingsScheduleDTOCustomHolidays :: [Text]
    <*> arbitrary -- campaignSettingsScheduleDTOCustomWorkingDays :: [Text]
    <*> arbitraryReducedMaybe n -- campaignSettingsScheduleDTOPeriod :: Maybe CampaignSettingsTimePeriodDTO
    <*> arbitrary -- campaignSettingsScheduleDTOTotalHolidays :: [Text]
    <*> arbitrary -- campaignSettingsScheduleDTOWeeklyHolidays :: [Int]
  
instance Arbitrary CampaignSettingsTimePeriodDTO where
  arbitrary = sized genCampaignSettingsTimePeriodDTO

genCampaignSettingsTimePeriodDTO :: Int -> Gen CampaignSettingsTimePeriodDTO
genCampaignSettingsTimePeriodDTO n =
  CampaignSettingsTimePeriodDTO
    <$> arbitraryReducedMaybe n -- campaignSettingsTimePeriodDTOFromDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- campaignSettingsTimePeriodDTOToDate :: Maybe Text
  
instance Arbitrary CampaignsQualityRatingDTO where
  arbitrary = sized genCampaignsQualityRatingDTO

genCampaignsQualityRatingDTO :: Int -> Gen CampaignsQualityRatingDTO
genCampaignsQualityRatingDTO n =
  CampaignsQualityRatingDTO
    <$> arbitraryReduced n -- campaignsQualityRatingDTOCampaignRatings :: [CampaignQualityRatingDTO]
  
instance Arbitrary CategoryContentParametersDTO where
  arbitrary = sized genCategoryContentParametersDTO

genCategoryContentParametersDTO :: Int -> Gen CategoryContentParametersDTO
genCategoryContentParametersDTO n =
  CategoryContentParametersDTO
    <$> arbitrary -- categoryContentParametersDTOCategoryId :: Int
    <*> arbitraryReducedMaybe n -- categoryContentParametersDTOParameters :: Maybe [CategoryParameterDTO]
  
instance Arbitrary CategoryDTO where
  arbitrary = sized genCategoryDTO

genCategoryDTO :: Int -> Gen CategoryDTO
genCategoryDTO n =
  CategoryDTO
    <$> arbitrary -- categoryDTOId :: Integer
    <*> arbitrary -- categoryDTOName :: Text
    <*> arbitraryReducedMaybe n -- categoryDTOChildren :: Maybe [CategoryDTO]
  
instance Arbitrary CategoryErrorDTO where
  arbitrary = sized genCategoryErrorDTO

genCategoryErrorDTO :: Int -> Gen CategoryErrorDTO
genCategoryErrorDTO n =
  CategoryErrorDTO
    <$> arbitraryReducedMaybe n -- categoryErrorDTOCategoryId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- categoryErrorDTOType :: Maybe CategoryErrorType
  
instance Arbitrary CategoryParameterDTO where
  arbitrary = sized genCategoryParameterDTO

genCategoryParameterDTO :: Int -> Gen CategoryParameterDTO
genCategoryParameterDTO n =
  CategoryParameterDTO
    <$> arbitrary -- categoryParameterDTOId :: Integer
    <*> arbitraryReducedMaybe n -- categoryParameterDTOName :: Maybe Text
    <*> arbitraryReduced n -- categoryParameterDTOType :: ParameterType
    <*> arbitraryReducedMaybe n -- categoryParameterDTOUnit :: Maybe CategoryParameterUnitDTO
    <*> arbitraryReducedMaybe n -- categoryParameterDTODescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- categoryParameterDTORecommendationTypes :: Maybe [OfferCardRecommendationType]
    <*> arbitrary -- categoryParameterDTORequired :: Bool
    <*> arbitrary -- categoryParameterDTOFiltering :: Bool
    <*> arbitrary -- categoryParameterDTODistinctive :: Bool
    <*> arbitrary -- categoryParameterDTOMultivalue :: Bool
    <*> arbitrary -- categoryParameterDTOAllowCustomValues :: Bool
    <*> arbitraryReducedMaybe n -- categoryParameterDTOValues :: Maybe [ParameterValueOptionDTO]
    <*> arbitraryReducedMaybe n -- categoryParameterDTOConstraints :: Maybe ParameterValueConstraintsDTO
    <*> arbitraryReducedMaybe n -- categoryParameterDTOValueRestrictions :: Maybe [ValueRestrictionDTO]
  
instance Arbitrary CategoryParameterUnitDTO where
  arbitrary = sized genCategoryParameterUnitDTO

genCategoryParameterUnitDTO :: Int -> Gen CategoryParameterUnitDTO
genCategoryParameterUnitDTO n =
  CategoryParameterUnitDTO
    <$> arbitrary -- categoryParameterUnitDTODefaultUnitId :: Integer
    <*> arbitraryReduced n -- categoryParameterUnitDTOUnits :: [UnitDTO]
  
instance Arbitrary ChangeOutletRequest where
  arbitrary = sized genChangeOutletRequest

genChangeOutletRequest :: Int -> Gen ChangeOutletRequest
genChangeOutletRequest n =
  ChangeOutletRequest
    <$> arbitrary -- changeOutletRequestName :: Text
    <*> arbitraryReduced n -- changeOutletRequestType :: OutletType
    <*> arbitraryReducedMaybe n -- changeOutletRequestCoords :: Maybe Text
    <*> arbitraryReducedMaybe n -- changeOutletRequestIsMain :: Maybe Bool
    <*> arbitraryReducedMaybe n -- changeOutletRequestShopOutletCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- changeOutletRequestVisibility :: Maybe OutletVisibilityType
    <*> arbitraryReduced n -- changeOutletRequestAddress :: OutletAddressDTO
    <*> arbitrary -- changeOutletRequestPhones :: [Text]
    <*> arbitraryReduced n -- changeOutletRequestWorkingSchedule :: OutletWorkingScheduleDTO
    <*> arbitraryReducedMaybe n -- changeOutletRequestDeliveryRules :: Maybe [OutletDeliveryRuleDTO]
    <*> arbitraryReducedMaybe n -- changeOutletRequestStoragePeriod :: Maybe Integer
  
instance Arbitrary ChannelType where
  arbitrary = sized genChannelType

genChannelType :: Int -> Gen ChannelType
genChannelType n =
  
  pure ChannelType
   
instance Arbitrary ChatMessageDTO where
  arbitrary = sized genChatMessageDTO

genChatMessageDTO :: Int -> Gen ChatMessageDTO
genChatMessageDTO n =
  ChatMessageDTO
    <$> arbitrary -- chatMessageDTOMessageId :: Integer
    <*> arbitraryReduced n -- chatMessageDTOCreatedAt :: DateTime
    <*> arbitraryReduced n -- chatMessageDTOSender :: ChatMessageSenderType
    <*> arbitraryReducedMaybe n -- chatMessageDTOMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- chatMessageDTOPayload :: Maybe [ChatMessagePayloadDTO]
  
instance Arbitrary ChatMessagePayloadDTO where
  arbitrary = sized genChatMessagePayloadDTO

genChatMessagePayloadDTO :: Int -> Gen ChatMessagePayloadDTO
genChatMessagePayloadDTO n =
  ChatMessagePayloadDTO
    <$> arbitrary -- chatMessagePayloadDTOName :: Text
    <*> arbitrary -- chatMessagePayloadDTOUrl :: Text
    <*> arbitrary -- chatMessagePayloadDTOSize :: Int
  
instance Arbitrary ChatMessagesResultDTO where
  arbitrary = sized genChatMessagesResultDTO

genChatMessagesResultDTO :: Int -> Gen ChatMessagesResultDTO
genChatMessagesResultDTO n =
  ChatMessagesResultDTO
    <$> arbitrary -- chatMessagesResultDTOOrderId :: Integer
    <*> arbitraryReduced n -- chatMessagesResultDTOMessages :: [ChatMessageDTO]
    <*> arbitraryReducedMaybe n -- chatMessagesResultDTOPaging :: Maybe ForwardScrollingPagerDTO
  
instance Arbitrary ConfirmPricesRequest where
  arbitrary = sized genConfirmPricesRequest

genConfirmPricesRequest :: Int -> Gen ConfirmPricesRequest
genConfirmPricesRequest n =
  ConfirmPricesRequest
    <$> arbitrary -- confirmPricesRequestOfferIds :: [Text]
  
instance Arbitrary ConfirmShipmentRequest where
  arbitrary = sized genConfirmShipmentRequest

genConfirmShipmentRequest :: Int -> Gen ConfirmShipmentRequest
genConfirmShipmentRequest n =
  ConfirmShipmentRequest
    <$> arbitraryReducedMaybe n -- confirmShipmentRequestExternalShipmentId :: Maybe Text
  
instance Arbitrary CreateChatRequest where
  arbitrary = sized genCreateChatRequest

genCreateChatRequest :: Int -> Gen CreateChatRequest
genCreateChatRequest n =
  CreateChatRequest
    <$> arbitrary -- createChatRequestOrderId :: Integer
  
instance Arbitrary CreateChatResponse where
  arbitrary = sized genCreateChatResponse

genCreateChatResponse :: Int -> Gen CreateChatResponse
genCreateChatResponse n =
  CreateChatResponse
    <$> arbitraryReducedMaybe n -- createChatResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- createChatResponseResult :: Maybe CreateChatResultDTO
  
instance Arbitrary CreateChatResultDTO where
  arbitrary = sized genCreateChatResultDTO

genCreateChatResultDTO :: Int -> Gen CreateChatResultDTO
genCreateChatResultDTO n =
  CreateChatResultDTO
    <$> arbitrary -- createChatResultDTOChatId :: Integer
  
instance Arbitrary CreateOutletResponse where
  arbitrary = sized genCreateOutletResponse

genCreateOutletResponse :: Int -> Gen CreateOutletResponse
genCreateOutletResponse n =
  CreateOutletResponse
    <$> arbitraryReducedMaybe n -- createOutletResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- createOutletResponseResult :: Maybe OutletResponseDTO
  
instance Arbitrary DeleteCampaignOffersDTO where
  arbitrary = sized genDeleteCampaignOffersDTO

genDeleteCampaignOffersDTO :: Int -> Gen DeleteCampaignOffersDTO
genDeleteCampaignOffersDTO n =
  DeleteCampaignOffersDTO
    <$> arbitraryReducedMaybe n -- deleteCampaignOffersDTONotDeletedOfferIds :: Maybe [Text]
  
instance Arbitrary DeleteCampaignOffersRequest where
  arbitrary = sized genDeleteCampaignOffersRequest

genDeleteCampaignOffersRequest :: Int -> Gen DeleteCampaignOffersRequest
genDeleteCampaignOffersRequest n =
  DeleteCampaignOffersRequest
    <$> arbitrary -- deleteCampaignOffersRequestOfferIds :: [Text]
  
instance Arbitrary DeleteCampaignOffersResponse where
  arbitrary = sized genDeleteCampaignOffersResponse

genDeleteCampaignOffersResponse :: Int -> Gen DeleteCampaignOffersResponse
genDeleteCampaignOffersResponse n =
  DeleteCampaignOffersResponse
    <$> arbitraryReducedMaybe n -- deleteCampaignOffersResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- deleteCampaignOffersResponseResult :: Maybe DeleteCampaignOffersDTO
  
instance Arbitrary DeleteGoodsFeedbackCommentRequest where
  arbitrary = sized genDeleteGoodsFeedbackCommentRequest

genDeleteGoodsFeedbackCommentRequest :: Int -> Gen DeleteGoodsFeedbackCommentRequest
genDeleteGoodsFeedbackCommentRequest n =
  DeleteGoodsFeedbackCommentRequest
    <$> arbitrary -- deleteGoodsFeedbackCommentRequestId :: Integer
  
instance Arbitrary DeleteHiddenOffersRequest where
  arbitrary = sized genDeleteHiddenOffersRequest

genDeleteHiddenOffersRequest :: Int -> Gen DeleteHiddenOffersRequest
genDeleteHiddenOffersRequest n =
  DeleteHiddenOffersRequest
    <$> arbitraryReduced n -- deleteHiddenOffersRequestHiddenOffers :: [HiddenOfferDTO]
  
instance Arbitrary DeleteOffersDTO where
  arbitrary = sized genDeleteOffersDTO

genDeleteOffersDTO :: Int -> Gen DeleteOffersDTO
genDeleteOffersDTO n =
  DeleteOffersDTO
    <$> arbitraryReducedMaybe n -- deleteOffersDTONotDeletedOfferIds :: Maybe [Text]
  
instance Arbitrary DeleteOffersFromArchiveDTO where
  arbitrary = sized genDeleteOffersFromArchiveDTO

genDeleteOffersFromArchiveDTO :: Int -> Gen DeleteOffersFromArchiveDTO
genDeleteOffersFromArchiveDTO n =
  DeleteOffersFromArchiveDTO
    <$> arbitraryReducedMaybe n -- deleteOffersFromArchiveDTONotUnarchivedOfferIds :: Maybe [Text]
  
instance Arbitrary DeleteOffersFromArchiveRequest where
  arbitrary = sized genDeleteOffersFromArchiveRequest

genDeleteOffersFromArchiveRequest :: Int -> Gen DeleteOffersFromArchiveRequest
genDeleteOffersFromArchiveRequest n =
  DeleteOffersFromArchiveRequest
    <$> arbitrary -- deleteOffersFromArchiveRequestOfferIds :: [Text]
  
instance Arbitrary DeleteOffersFromArchiveResponse where
  arbitrary = sized genDeleteOffersFromArchiveResponse

genDeleteOffersFromArchiveResponse :: Int -> Gen DeleteOffersFromArchiveResponse
genDeleteOffersFromArchiveResponse n =
  DeleteOffersFromArchiveResponse
    <$> arbitraryReducedMaybe n -- deleteOffersFromArchiveResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- deleteOffersFromArchiveResponseResult :: Maybe DeleteOffersFromArchiveDTO
  
instance Arbitrary DeleteOffersRequest where
  arbitrary = sized genDeleteOffersRequest

genDeleteOffersRequest :: Int -> Gen DeleteOffersRequest
genDeleteOffersRequest n =
  DeleteOffersRequest
    <$> arbitrary -- deleteOffersRequestOfferIds :: [Text]
  
instance Arbitrary DeleteOffersResponse where
  arbitrary = sized genDeleteOffersResponse

genDeleteOffersResponse :: Int -> Gen DeleteOffersResponse
genDeleteOffersResponse n =
  DeleteOffersResponse
    <$> arbitraryReducedMaybe n -- deleteOffersResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- deleteOffersResponseResult :: Maybe DeleteOffersDTO
  
instance Arbitrary DeletePromoOffersRequest where
  arbitrary = sized genDeletePromoOffersRequest

genDeletePromoOffersRequest :: Int -> Gen DeletePromoOffersRequest
genDeletePromoOffersRequest n =
  DeletePromoOffersRequest
    <$> arbitrary -- deletePromoOffersRequestPromoId :: Text
    <*> arbitraryReducedMaybe n -- deletePromoOffersRequestDeleteAllOffers :: Maybe Bool
    <*> arbitraryReducedMaybe n -- deletePromoOffersRequestOfferIds :: Maybe [Text]
  
instance Arbitrary DeletePromoOffersResponse where
  arbitrary = sized genDeletePromoOffersResponse

genDeletePromoOffersResponse :: Int -> Gen DeletePromoOffersResponse
genDeletePromoOffersResponse n =
  DeletePromoOffersResponse
    <$> arbitraryReducedMaybe n -- deletePromoOffersResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- deletePromoOffersResponseResult :: Maybe DeletePromoOffersResultDTO
  
instance Arbitrary DeletePromoOffersResultDTO where
  arbitrary = sized genDeletePromoOffersResultDTO

genDeletePromoOffersResultDTO :: Int -> Gen DeletePromoOffersResultDTO
genDeletePromoOffersResultDTO n =
  DeletePromoOffersResultDTO
    <$> arbitraryReducedMaybe n -- deletePromoOffersResultDTORejectedOffers :: Maybe [RejectedPromoOfferDeleteDTO]
  
instance Arbitrary DeliveryServiceDTO where
  arbitrary = sized genDeliveryServiceDTO

genDeliveryServiceDTO :: Int -> Gen DeliveryServiceDTO
genDeliveryServiceDTO n =
  DeliveryServiceDTO
    <$> arbitraryReducedMaybe n -- deliveryServiceDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- deliveryServiceDTOName :: Maybe Text
  
instance Arbitrary DeliveryServiceInfoDTO where
  arbitrary = sized genDeliveryServiceInfoDTO

genDeliveryServiceInfoDTO :: Int -> Gen DeliveryServiceInfoDTO
genDeliveryServiceInfoDTO n =
  DeliveryServiceInfoDTO
    <$> arbitrary -- deliveryServiceInfoDTOId :: Integer
    <*> arbitrary -- deliveryServiceInfoDTOName :: Text
  
instance Arbitrary DeliveryServicesDTO where
  arbitrary = sized genDeliveryServicesDTO

genDeliveryServicesDTO :: Int -> Gen DeliveryServicesDTO
genDeliveryServicesDTO n =
  DeliveryServicesDTO
    <$> arbitraryReduced n -- deliveryServicesDTODeliveryService :: [DeliveryServiceInfoDTO]
  
instance Arbitrary DocumentDTO where
  arbitrary = sized genDocumentDTO

genDocumentDTO :: Int -> Gen DocumentDTO
genDocumentDTO n =
  DocumentDTO
    <$> arbitraryReducedMaybe n -- documentDTOStatus :: Maybe OrderDocumentStatusType
    <*> arbitraryReducedMaybe n -- documentDTONumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- documentDTODate :: Maybe Date
  
instance Arbitrary EacVerificationResultDTO where
  arbitrary = sized genEacVerificationResultDTO

genEacVerificationResultDTO :: Int -> Gen EacVerificationResultDTO
genEacVerificationResultDTO n =
  EacVerificationResultDTO
    <$> arbitraryReducedMaybe n -- eacVerificationResultDTOVerificationResult :: Maybe EacVerificationStatusType
    <*> arbitraryReducedMaybe n -- eacVerificationResultDTOAttemptsLeft :: Maybe Int
  
instance Arbitrary EmptyApiResponse where
  arbitrary = sized genEmptyApiResponse

genEmptyApiResponse :: Int -> Gen EmptyApiResponse
genEmptyApiResponse n =
  EmptyApiResponse
    <$> arbitraryReducedMaybe n -- emptyApiResponseStatus :: Maybe ApiResponseStatusType
  
instance Arbitrary EnrichedMappingsOfferDTO where
  arbitrary = sized genEnrichedMappingsOfferDTO

genEnrichedMappingsOfferDTO :: Int -> Gen EnrichedMappingsOfferDTO
genEnrichedMappingsOfferDTO n =
  EnrichedMappingsOfferDTO
    <$> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOShopSku :: Maybe Text
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOVendor :: Maybe Text
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOVendorCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTODescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOId :: Maybe Text
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOFeedId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOBarcodes :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOUrls :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOPictures :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOManufacturer :: Maybe Text
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOManufacturerCountries :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOMinShipment :: Maybe Int
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOTransportUnitSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOQuantumOfSupply :: Maybe Int
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTODeliveryDurationDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOBoxCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOCustomsCommodityCodes :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOWeightDimensions :: Maybe OfferWeightDimensionsDTO
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOSupplyScheduleDays :: Maybe [DayOfWeekType]
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOShelfLifeDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOLifeTimeDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOGuaranteePeriodDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOProcessingState :: Maybe OfferProcessingStateDTO
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOAvailability :: Maybe OfferAvailabilityStatusType
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOShelfLife :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOLifeTime :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOGuaranteePeriod :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOCertificate :: Maybe Text
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOPrice :: Maybe Double
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOMarketCategoryId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOMarketCategoryName :: Maybe Text
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOMarketModelId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOMarketModelName :: Maybe Text
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOMarketSku :: Maybe Integer
    <*> arbitraryReducedMaybe n -- enrichedMappingsOfferDTOMarketSkuName :: Maybe Text
  
instance Arbitrary EnrichedModelDTO where
  arbitrary = sized genEnrichedModelDTO

genEnrichedModelDTO :: Int -> Gen EnrichedModelDTO
genEnrichedModelDTO n =
  EnrichedModelDTO
    <$> arbitraryReducedMaybe n -- enrichedModelDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- enrichedModelDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- enrichedModelDTOPrices :: Maybe ModelPriceDTO
    <*> arbitraryReducedMaybe n -- enrichedModelDTOOffers :: Maybe [ModelOfferDTO]
    <*> arbitraryReducedMaybe n -- enrichedModelDTOOfflineOffers :: Maybe Int
    <*> arbitraryReducedMaybe n -- enrichedModelDTOOnlineOffers :: Maybe Int
  
instance Arbitrary EnrichedModelsDTO where
  arbitrary = sized genEnrichedModelsDTO

genEnrichedModelsDTO :: Int -> Gen EnrichedModelsDTO
genEnrichedModelsDTO n =
  EnrichedModelsDTO
    <$> arbitraryReduced n -- enrichedModelsDTOModels :: [EnrichedModelDTO]
  
instance Arbitrary EnrichedOrderBoxLayoutDTO where
  arbitrary = sized genEnrichedOrderBoxLayoutDTO

genEnrichedOrderBoxLayoutDTO :: Int -> Gen EnrichedOrderBoxLayoutDTO
genEnrichedOrderBoxLayoutDTO n =
  EnrichedOrderBoxLayoutDTO
    <$> arbitraryReduced n -- enrichedOrderBoxLayoutDTOItems :: [OrderBoxLayoutItemDTO]
    <*> arbitraryReducedMaybe n -- enrichedOrderBoxLayoutDTOBoxId :: Maybe Integer
  
instance Arbitrary ExtensionShipmentDTO where
  arbitrary = sized genExtensionShipmentDTO

genExtensionShipmentDTO :: Int -> Gen ExtensionShipmentDTO
genExtensionShipmentDTO n =
  ExtensionShipmentDTO
    <$> arbitraryReducedMaybe n -- extensionShipmentDTOCurrentStatus :: Maybe ShipmentStatusChangeDTO
    <*> arbitraryReduced n -- extensionShipmentDTOAvailableActions :: [ShipmentActionType]
  
instance Arbitrary FeedContentDTO where
  arbitrary = sized genFeedContentDTO

genFeedContentDTO :: Int -> Gen FeedContentDTO
genFeedContentDTO n =
  FeedContentDTO
    <$> arbitraryReducedMaybe n -- feedContentDTORejectedOffersCount :: Maybe Integer
    <*> arbitraryReducedMaybe n -- feedContentDTOStatus :: Maybe FeedStatusType
    <*> arbitraryReducedMaybe n -- feedContentDTOTotalOffersCount :: Maybe Integer
    <*> arbitraryReducedMaybe n -- feedContentDTOError :: Maybe FeedContentErrorDTO
  
instance Arbitrary FeedContentErrorDTO where
  arbitrary = sized genFeedContentErrorDTO

genFeedContentErrorDTO :: Int -> Gen FeedContentErrorDTO
genFeedContentErrorDTO n =
  FeedContentErrorDTO
    <$> arbitraryReducedMaybe n -- feedContentErrorDTOType :: Maybe FeedContentErrorType
  
instance Arbitrary FeedDTO where
  arbitrary = sized genFeedDTO

genFeedDTO :: Int -> Gen FeedDTO
genFeedDTO n =
  FeedDTO
    <$> arbitraryReducedMaybe n -- feedDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- feedDTOLogin :: Maybe Text
    <*> arbitraryReducedMaybe n -- feedDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- feedDTOPassword :: Maybe Text
    <*> arbitraryReducedMaybe n -- feedDTOUploadDate :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- feedDTOUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- feedDTOContent :: Maybe FeedContentDTO
    <*> arbitraryReducedMaybe n -- feedDTODownload :: Maybe FeedDownloadDTO
    <*> arbitraryReducedMaybe n -- feedDTOPlacement :: Maybe FeedPlacementDTO
    <*> arbitraryReducedMaybe n -- feedDTOPublication :: Maybe FeedPublicationDTO
  
instance Arbitrary FeedDownloadDTO where
  arbitrary = sized genFeedDownloadDTO

genFeedDownloadDTO :: Int -> Gen FeedDownloadDTO
genFeedDownloadDTO n =
  FeedDownloadDTO
    <$> arbitraryReducedMaybe n -- feedDownloadDTOStatus :: Maybe FeedStatusType
    <*> arbitraryReducedMaybe n -- feedDownloadDTOError :: Maybe FeedDownloadErrorDTO
  
instance Arbitrary FeedDownloadErrorDTO where
  arbitrary = sized genFeedDownloadErrorDTO

genFeedDownloadErrorDTO :: Int -> Gen FeedDownloadErrorDTO
genFeedDownloadErrorDTO n =
  FeedDownloadErrorDTO
    <$> arbitraryReducedMaybe n -- feedDownloadErrorDTOHttpStatusCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- feedDownloadErrorDTOType :: Maybe FeedDownloadErrorType
    <*> arbitraryReducedMaybe n -- feedDownloadErrorDTODescription :: Maybe Text
  
instance Arbitrary FeedIndexLogsErrorDTO where
  arbitrary = sized genFeedIndexLogsErrorDTO

genFeedIndexLogsErrorDTO :: Int -> Gen FeedIndexLogsErrorDTO
genFeedIndexLogsErrorDTO n =
  FeedIndexLogsErrorDTO
    <$> arbitraryReducedMaybe n -- feedIndexLogsErrorDTOHttpStatusCode :: Maybe Int
    <*> arbitraryReducedMaybe n -- feedIndexLogsErrorDTOType :: Maybe FeedIndexLogsErrorType
    <*> arbitraryReducedMaybe n -- feedIndexLogsErrorDTODescription :: Maybe Text
  
instance Arbitrary FeedIndexLogsFeedDTO where
  arbitrary = sized genFeedIndexLogsFeedDTO

genFeedIndexLogsFeedDTO :: Int -> Gen FeedIndexLogsFeedDTO
genFeedIndexLogsFeedDTO n =
  FeedIndexLogsFeedDTO
    <$> arbitraryReducedMaybe n -- feedIndexLogsFeedDTOId :: Maybe Integer
  
instance Arbitrary FeedIndexLogsOffersDTO where
  arbitrary = sized genFeedIndexLogsOffersDTO

genFeedIndexLogsOffersDTO :: Int -> Gen FeedIndexLogsOffersDTO
genFeedIndexLogsOffersDTO n =
  FeedIndexLogsOffersDTO
    <$> arbitraryReducedMaybe n -- feedIndexLogsOffersDTORejectedCount :: Maybe Integer
    <*> arbitraryReducedMaybe n -- feedIndexLogsOffersDTOTotalCount :: Maybe Integer
  
instance Arbitrary FeedIndexLogsRecordDTO where
  arbitrary = sized genFeedIndexLogsRecordDTO

genFeedIndexLogsRecordDTO :: Int -> Gen FeedIndexLogsRecordDTO
genFeedIndexLogsRecordDTO n =
  FeedIndexLogsRecordDTO
    <$> arbitraryReducedMaybe n -- feedIndexLogsRecordDTODownloadTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- feedIndexLogsRecordDTOFileTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- feedIndexLogsRecordDTOGenerationId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- feedIndexLogsRecordDTOIndexType :: Maybe FeedIndexLogsIndexType
    <*> arbitraryReducedMaybe n -- feedIndexLogsRecordDTOPublishedTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- feedIndexLogsRecordDTOStatus :: Maybe FeedIndexLogsStatusType
    <*> arbitraryReducedMaybe n -- feedIndexLogsRecordDTOError :: Maybe FeedIndexLogsErrorDTO
    <*> arbitraryReducedMaybe n -- feedIndexLogsRecordDTOOffers :: Maybe FeedIndexLogsOffersDTO
  
instance Arbitrary FeedIndexLogsResultDTO where
  arbitrary = sized genFeedIndexLogsResultDTO

genFeedIndexLogsResultDTO :: Int -> Gen FeedIndexLogsResultDTO
genFeedIndexLogsResultDTO n =
  FeedIndexLogsResultDTO
    <$> arbitraryReducedMaybe n -- feedIndexLogsResultDTOFeed :: Maybe FeedIndexLogsFeedDTO
    <*> arbitraryReduced n -- feedIndexLogsResultDTOIndexLogRecords :: [FeedIndexLogsRecordDTO]
    <*> arbitraryReducedMaybe n -- feedIndexLogsResultDTOTotal :: Maybe Integer
  
instance Arbitrary FeedParameterDTO where
  arbitrary = sized genFeedParameterDTO

genFeedParameterDTO :: Int -> Gen FeedParameterDTO
genFeedParameterDTO n =
  FeedParameterDTO
    <$> arbitraryReducedMaybe n -- feedParameterDTODeleted :: Maybe Bool
    <*> arbitrary -- feedParameterDTOName :: Text
    <*> arbitraryReducedMaybe n -- feedParameterDTOValues :: Maybe [Int]
  
instance Arbitrary FeedPlacementDTO where
  arbitrary = sized genFeedPlacementDTO

genFeedPlacementDTO :: Int -> Gen FeedPlacementDTO
genFeedPlacementDTO n =
  FeedPlacementDTO
    <$> arbitraryReducedMaybe n -- feedPlacementDTOStatus :: Maybe FeedStatusType
    <*> arbitraryReducedMaybe n -- feedPlacementDTOTotalOffersCount :: Maybe Int
  
instance Arbitrary FeedPublicationDTO where
  arbitrary = sized genFeedPublicationDTO

genFeedPublicationDTO :: Int -> Gen FeedPublicationDTO
genFeedPublicationDTO n =
  FeedPublicationDTO
    <$> arbitraryReducedMaybe n -- feedPublicationDTOStatus :: Maybe FeedStatusType
    <*> arbitraryReducedMaybe n -- feedPublicationDTOFull :: Maybe FeedPublicationFullDTO
    <*> arbitraryReducedMaybe n -- feedPublicationDTOPriceAndStockUpdate :: Maybe FeedPublicationPriceAndStockUpdateDTO
  
instance Arbitrary FeedPublicationFullDTO where
  arbitrary = sized genFeedPublicationFullDTO

genFeedPublicationFullDTO :: Int -> Gen FeedPublicationFullDTO
genFeedPublicationFullDTO n =
  FeedPublicationFullDTO
    <$> arbitraryReducedMaybe n -- feedPublicationFullDTOFileTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- feedPublicationFullDTOPublishedTime :: Maybe DateTime
  
instance Arbitrary FeedPublicationPriceAndStockUpdateDTO where
  arbitrary = sized genFeedPublicationPriceAndStockUpdateDTO

genFeedPublicationPriceAndStockUpdateDTO :: Int -> Gen FeedPublicationPriceAndStockUpdateDTO
genFeedPublicationPriceAndStockUpdateDTO n =
  FeedPublicationPriceAndStockUpdateDTO
    <$> arbitraryReducedMaybe n -- feedPublicationPriceAndStockUpdateDTOFileTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- feedPublicationPriceAndStockUpdateDTOPublishedTime :: Maybe DateTime
  
instance Arbitrary FeedbackAuthorDTO where
  arbitrary = sized genFeedbackAuthorDTO

genFeedbackAuthorDTO :: Int -> Gen FeedbackAuthorDTO
genFeedbackAuthorDTO n =
  FeedbackAuthorDTO
    <$> arbitraryReducedMaybe n -- feedbackAuthorDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- feedbackAuthorDTORegion :: Maybe RegionDTO
  
instance Arbitrary FeedbackCommentAuthorDTO where
  arbitrary = sized genFeedbackCommentAuthorDTO

genFeedbackCommentAuthorDTO :: Int -> Gen FeedbackCommentAuthorDTO
genFeedbackCommentAuthorDTO n =
  FeedbackCommentAuthorDTO
    <$> arbitraryReducedMaybe n -- feedbackCommentAuthorDTOType :: Maybe FeedbackCommentAuthorType
    <*> arbitraryReducedMaybe n -- feedbackCommentAuthorDTOName :: Maybe Text
  
instance Arbitrary FeedbackCommentDTO where
  arbitrary = sized genFeedbackCommentDTO

genFeedbackCommentDTO :: Int -> Gen FeedbackCommentDTO
genFeedbackCommentDTO n =
  FeedbackCommentDTO
    <$> arbitraryReducedMaybe n -- feedbackCommentDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- feedbackCommentDTOParentId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- feedbackCommentDTOBody :: Maybe Text
    <*> arbitraryReducedMaybe n -- feedbackCommentDTOCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- feedbackCommentDTOUpdatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- feedbackCommentDTOAuthor :: Maybe FeedbackCommentAuthorDTO
    <*> arbitraryReducedMaybe n -- feedbackCommentDTOChildren :: Maybe [FeedbackCommentDTO]
  
instance Arbitrary FeedbackDTO where
  arbitrary = sized genFeedbackDTO

genFeedbackDTO :: Int -> Gen FeedbackDTO
genFeedbackDTO n =
  FeedbackDTO
    <$> arbitraryReducedMaybe n -- feedbackDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- feedbackDTOCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- feedbackDTOText :: Maybe Text
    <*> arbitraryReducedMaybe n -- feedbackDTOState :: Maybe FeedbackStateType
    <*> arbitraryReducedMaybe n -- feedbackDTOAuthor :: Maybe FeedbackAuthorDTO
    <*> arbitraryReducedMaybe n -- feedbackDTOPro :: Maybe Text
    <*> arbitraryReducedMaybe n -- feedbackDTOContra :: Maybe Text
    <*> arbitraryReduced n -- feedbackDTOComments :: [FeedbackCommentDTO]
    <*> arbitraryReducedMaybe n -- feedbackDTOShop :: Maybe FeedbackShopDTO
    <*> arbitraryReducedMaybe n -- feedbackDTOResolved :: Maybe Bool
    <*> arbitraryReducedMaybe n -- feedbackDTOVerified :: Maybe Bool
    <*> arbitraryReducedMaybe n -- feedbackDTORecommend :: Maybe Bool
    <*> arbitraryReducedMaybe n -- feedbackDTOGrades :: Maybe FeedbackGradesDTO
    <*> arbitraryReducedMaybe n -- feedbackDTOOrder :: Maybe FeedbackOrderDTO
  
instance Arbitrary FeedbackFactorDTO where
  arbitrary = sized genFeedbackFactorDTO

genFeedbackFactorDTO :: Int -> Gen FeedbackFactorDTO
genFeedbackFactorDTO n =
  FeedbackFactorDTO
    <$> arbitraryReducedMaybe n -- feedbackFactorDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- feedbackFactorDTOTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- feedbackFactorDTODescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- feedbackFactorDTOValue :: Maybe Int
  
instance Arbitrary FeedbackGradesDTO where
  arbitrary = sized genFeedbackGradesDTO

genFeedbackGradesDTO :: Int -> Gen FeedbackGradesDTO
genFeedbackGradesDTO n =
  FeedbackGradesDTO
    <$> arbitraryReducedMaybe n -- feedbackGradesDTOAverage :: Maybe Double
    <*> arbitraryReducedMaybe n -- feedbackGradesDTOAgreeCount :: Maybe Integer
    <*> arbitraryReducedMaybe n -- feedbackGradesDTORejectCount :: Maybe Integer
    <*> arbitraryReduced n -- feedbackGradesDTOFactors :: [FeedbackFactorDTO]
  
instance Arbitrary FeedbackListDTO where
  arbitrary = sized genFeedbackListDTO

genFeedbackListDTO :: Int -> Gen FeedbackListDTO
genFeedbackListDTO n =
  FeedbackListDTO
    <$> arbitraryReducedMaybe n -- feedbackListDTOPaging :: Maybe ScrollingPagerDTO
    <*> arbitraryReduced n -- feedbackListDTOFeedbackList :: [FeedbackDTO]
  
instance Arbitrary FeedbackOrderDTO where
  arbitrary = sized genFeedbackOrderDTO

genFeedbackOrderDTO :: Int -> Gen FeedbackOrderDTO
genFeedbackOrderDTO n =
  FeedbackOrderDTO
    <$> arbitraryReducedMaybe n -- feedbackOrderDTOShopOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- feedbackOrderDTODelivery :: Maybe FeedbackDeliveryType
  
instance Arbitrary FeedbackShopDTO where
  arbitrary = sized genFeedbackShopDTO

genFeedbackShopDTO :: Int -> Gen FeedbackShopDTO
genFeedbackShopDTO n =
  FeedbackShopDTO
    <$> arbitraryReducedMaybe n -- feedbackShopDTOName :: Maybe Text
  
instance Arbitrary FlippingPagerDTO where
  arbitrary = sized genFlippingPagerDTO

genFlippingPagerDTO :: Int -> Gen FlippingPagerDTO
genFlippingPagerDTO n =
  FlippingPagerDTO
    <$> arbitraryReducedMaybe n -- flippingPagerDTOTotal :: Maybe Int
    <*> arbitraryReducedMaybe n -- flippingPagerDTOFrom :: Maybe Int
    <*> arbitraryReducedMaybe n -- flippingPagerDTOTo :: Maybe Int
    <*> arbitraryReducedMaybe n -- flippingPagerDTOCurrentPage :: Maybe Int
    <*> arbitraryReducedMaybe n -- flippingPagerDTOPagesCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- flippingPagerDTOPageSize :: Maybe Int
  
instance Arbitrary ForwardScrollingPagerDTO where
  arbitrary = sized genForwardScrollingPagerDTO

genForwardScrollingPagerDTO :: Int -> Gen ForwardScrollingPagerDTO
genForwardScrollingPagerDTO n =
  ForwardScrollingPagerDTO
    <$> arbitraryReducedMaybe n -- forwardScrollingPagerDTONextPageToken :: Maybe Text
  
instance Arbitrary FulfillmentWarehouseDTO where
  arbitrary = sized genFulfillmentWarehouseDTO

genFulfillmentWarehouseDTO :: Int -> Gen FulfillmentWarehouseDTO
genFulfillmentWarehouseDTO n =
  FulfillmentWarehouseDTO
    <$> arbitrary -- fulfillmentWarehouseDTOId :: Integer
    <*> arbitrary -- fulfillmentWarehouseDTOName :: Text
    <*> arbitraryReducedMaybe n -- fulfillmentWarehouseDTOAddress :: Maybe WarehouseAddressDTO
  
instance Arbitrary FulfillmentWarehousesDTO where
  arbitrary = sized genFulfillmentWarehousesDTO

genFulfillmentWarehousesDTO :: Int -> Gen FulfillmentWarehousesDTO
genFulfillmentWarehousesDTO n =
  FulfillmentWarehousesDTO
    <$> arbitraryReduced n -- fulfillmentWarehousesDTOWarehouses :: [FulfillmentWarehouseDTO]
  
instance Arbitrary FullOutletDTO where
  arbitrary = sized genFullOutletDTO

genFullOutletDTO :: Int -> Gen FullOutletDTO
genFullOutletDTO n =
  FullOutletDTO
    <$> arbitrary -- fullOutletDTOName :: Text
    <*> arbitraryReduced n -- fullOutletDTOType :: OutletType
    <*> arbitraryReducedMaybe n -- fullOutletDTOCoords :: Maybe Text
    <*> arbitraryReducedMaybe n -- fullOutletDTOIsMain :: Maybe Bool
    <*> arbitraryReducedMaybe n -- fullOutletDTOShopOutletCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- fullOutletDTOVisibility :: Maybe OutletVisibilityType
    <*> arbitraryReduced n -- fullOutletDTOAddress :: OutletAddressDTO
    <*> arbitrary -- fullOutletDTOPhones :: [Text]
    <*> arbitraryReduced n -- fullOutletDTOWorkingSchedule :: OutletWorkingScheduleDTO
    <*> arbitraryReducedMaybe n -- fullOutletDTODeliveryRules :: Maybe [OutletDeliveryRuleDTO]
    <*> arbitraryReducedMaybe n -- fullOutletDTOStoragePeriod :: Maybe Integer
    <*> arbitraryReducedMaybe n -- fullOutletDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- fullOutletDTOStatus :: Maybe OutletStatusType
    <*> arbitraryReducedMaybe n -- fullOutletDTORegion :: Maybe RegionDTO
    <*> arbitraryReducedMaybe n -- fullOutletDTOShopOutletId :: Maybe Text
    <*> arbitraryReducedMaybe n -- fullOutletDTOWorkingTime :: Maybe Text
    <*> arbitraryReducedMaybe n -- fullOutletDTOModerationReason :: Maybe Text
  
instance Arbitrary FullOutletLicenseDTO where
  arbitrary = sized genFullOutletLicenseDTO

genFullOutletLicenseDTO :: Int -> Gen FullOutletLicenseDTO
genFullOutletLicenseDTO n =
  FullOutletLicenseDTO
    <$> arbitraryReducedMaybe n -- fullOutletLicenseDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- fullOutletLicenseDTOOutletId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- fullOutletLicenseDTOLicenseType :: Maybe LicenseType
    <*> arbitraryReducedMaybe n -- fullOutletLicenseDTONumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- fullOutletLicenseDTODateOfIssue :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- fullOutletLicenseDTODateOfExpiry :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- fullOutletLicenseDTOCheckStatus :: Maybe LicenseCheckStatusType
    <*> arbitraryReducedMaybe n -- fullOutletLicenseDTOCheckComment :: Maybe Text
  
instance Arbitrary GenerateBoostConsolidatedRequest where
  arbitrary = sized genGenerateBoostConsolidatedRequest

genGenerateBoostConsolidatedRequest :: Int -> Gen GenerateBoostConsolidatedRequest
genGenerateBoostConsolidatedRequest n =
  GenerateBoostConsolidatedRequest
    <$> arbitrary -- generateBoostConsolidatedRequestBusinessId :: Integer
    <*> arbitraryReduced n -- generateBoostConsolidatedRequestDateFrom :: Date
    <*> arbitraryReduced n -- generateBoostConsolidatedRequestDateTo :: Date
  
instance Arbitrary GenerateCompetitorsPositionReportRequest where
  arbitrary = sized genGenerateCompetitorsPositionReportRequest

genGenerateCompetitorsPositionReportRequest :: Int -> Gen GenerateCompetitorsPositionReportRequest
genGenerateCompetitorsPositionReportRequest n =
  GenerateCompetitorsPositionReportRequest
    <$> arbitrary -- generateCompetitorsPositionReportRequestBusinessId :: Integer
    <*> arbitrary -- generateCompetitorsPositionReportRequestCategoryId :: Integer
    <*> arbitraryReduced n -- generateCompetitorsPositionReportRequestDateFrom :: Date
    <*> arbitraryReduced n -- generateCompetitorsPositionReportRequestDateTo :: Date
  
instance Arbitrary GenerateGoodsFeedbackRequest where
  arbitrary = sized genGenerateGoodsFeedbackRequest

genGenerateGoodsFeedbackRequest :: Int -> Gen GenerateGoodsFeedbackRequest
genGenerateGoodsFeedbackRequest n =
  GenerateGoodsFeedbackRequest
    <$> arbitrary -- generateGoodsFeedbackRequestBusinessId :: Integer
  
instance Arbitrary GenerateGoodsMovementReportRequest where
  arbitrary = sized genGenerateGoodsMovementReportRequest

genGenerateGoodsMovementReportRequest :: Int -> Gen GenerateGoodsMovementReportRequest
genGenerateGoodsMovementReportRequest n =
  GenerateGoodsMovementReportRequest
    <$> arbitrary -- generateGoodsMovementReportRequestCampaignId :: Integer
    <*> arbitraryReduced n -- generateGoodsMovementReportRequestDateFrom :: Date
    <*> arbitraryReduced n -- generateGoodsMovementReportRequestDateTo :: Date
    <*> arbitraryReducedMaybe n -- generateGoodsMovementReportRequestShopSku :: Maybe Text
  
instance Arbitrary GenerateGoodsRealizationReportRequest where
  arbitrary = sized genGenerateGoodsRealizationReportRequest

genGenerateGoodsRealizationReportRequest :: Int -> Gen GenerateGoodsRealizationReportRequest
genGenerateGoodsRealizationReportRequest n =
  GenerateGoodsRealizationReportRequest
    <$> arbitrary -- generateGoodsRealizationReportRequestCampaignId :: Integer
    <*> arbitrary -- generateGoodsRealizationReportRequestYear :: Int
    <*> arbitrary -- generateGoodsRealizationReportRequestMonth :: Int
  
instance Arbitrary GenerateGoodsTurnoverRequest where
  arbitrary = sized genGenerateGoodsTurnoverRequest

genGenerateGoodsTurnoverRequest :: Int -> Gen GenerateGoodsTurnoverRequest
genGenerateGoodsTurnoverRequest n =
  GenerateGoodsTurnoverRequest
    <$> arbitrary -- generateGoodsTurnoverRequestCampaignId :: Integer
    <*> arbitraryReducedMaybe n -- generateGoodsTurnoverRequestDate :: Maybe Date
  
instance Arbitrary GenerateMassOrderLabelsRequest where
  arbitrary = sized genGenerateMassOrderLabelsRequest

genGenerateMassOrderLabelsRequest :: Int -> Gen GenerateMassOrderLabelsRequest
genGenerateMassOrderLabelsRequest n =
  GenerateMassOrderLabelsRequest
    <$> arbitrary -- generateMassOrderLabelsRequestBusinessId :: Integer
    <*> arbitrary -- generateMassOrderLabelsRequestOrderIds :: [Integer]
  
instance Arbitrary GeneratePricesReportRequest where
  arbitrary = sized genGeneratePricesReportRequest

genGeneratePricesReportRequest :: Int -> Gen GeneratePricesReportRequest
genGeneratePricesReportRequest n =
  GeneratePricesReportRequest
    <$> arbitraryReducedMaybe n -- generatePricesReportRequestBusinessId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- generatePricesReportRequestCampaignId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- generatePricesReportRequestCategoryIds :: Maybe [Integer]
    <*> arbitraryReducedMaybe n -- generatePricesReportRequestCreationDateFrom :: Maybe Date
    <*> arbitraryReducedMaybe n -- generatePricesReportRequestCreationDateTo :: Maybe Date
  
instance Arbitrary GenerateReportDTO where
  arbitrary = sized genGenerateReportDTO

genGenerateReportDTO :: Int -> Gen GenerateReportDTO
genGenerateReportDTO n =
  GenerateReportDTO
    <$> arbitrary -- generateReportDTOReportId :: Text
    <*> arbitrary -- generateReportDTOEstimatedGenerationTime :: Integer
  
instance Arbitrary GenerateReportResponse where
  arbitrary = sized genGenerateReportResponse

genGenerateReportResponse :: Int -> Gen GenerateReportResponse
genGenerateReportResponse n =
  GenerateReportResponse
    <$> arbitraryReducedMaybe n -- generateReportResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- generateReportResponseResult :: Maybe GenerateReportDTO
  
instance Arbitrary GenerateShelfsStatisticsRequest where
  arbitrary = sized genGenerateShelfsStatisticsRequest

genGenerateShelfsStatisticsRequest :: Int -> Gen GenerateShelfsStatisticsRequest
genGenerateShelfsStatisticsRequest n =
  GenerateShelfsStatisticsRequest
    <$> arbitrary -- generateShelfsStatisticsRequestBusinessId :: Integer
    <*> arbitraryReduced n -- generateShelfsStatisticsRequestDateFrom :: Date
    <*> arbitraryReduced n -- generateShelfsStatisticsRequestDateTo :: Date
    <*> arbitraryReduced n -- generateShelfsStatisticsRequestAttributionType :: ShelfsStatisticsAttributionType
  
instance Arbitrary GenerateShipmentListDocumentReportRequest where
  arbitrary = sized genGenerateShipmentListDocumentReportRequest

genGenerateShipmentListDocumentReportRequest :: Int -> Gen GenerateShipmentListDocumentReportRequest
genGenerateShipmentListDocumentReportRequest n =
  GenerateShipmentListDocumentReportRequest
    <$> arbitrary -- generateShipmentListDocumentReportRequestCampaignId :: Integer
    <*> arbitraryReducedMaybe n -- generateShipmentListDocumentReportRequestShipmentId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- generateShipmentListDocumentReportRequestOrderIds :: Maybe [Integer]
  
instance Arbitrary GenerateShowsSalesReportRequest where
  arbitrary = sized genGenerateShowsSalesReportRequest

genGenerateShowsSalesReportRequest :: Int -> Gen GenerateShowsSalesReportRequest
genGenerateShowsSalesReportRequest n =
  GenerateShowsSalesReportRequest
    <$> arbitraryReducedMaybe n -- generateShowsSalesReportRequestBusinessId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- generateShowsSalesReportRequestCampaignId :: Maybe Integer
    <*> arbitraryReduced n -- generateShowsSalesReportRequestDateFrom :: Date
    <*> arbitraryReduced n -- generateShowsSalesReportRequestDateTo :: Date
    <*> arbitraryReduced n -- generateShowsSalesReportRequestGrouping :: ShowsSalesGroupingType
  
instance Arbitrary GenerateStocksOnWarehousesReportRequest where
  arbitrary = sized genGenerateStocksOnWarehousesReportRequest

genGenerateStocksOnWarehousesReportRequest :: Int -> Gen GenerateStocksOnWarehousesReportRequest
genGenerateStocksOnWarehousesReportRequest n =
  GenerateStocksOnWarehousesReportRequest
    <$> arbitrary -- generateStocksOnWarehousesReportRequestCampaignId :: Integer
    <*> arbitraryReducedMaybe n -- generateStocksOnWarehousesReportRequestWarehouseIds :: Maybe [Integer]
    <*> arbitraryReducedMaybe n -- generateStocksOnWarehousesReportRequestReportDate :: Maybe Date
    <*> arbitraryReducedMaybe n -- generateStocksOnWarehousesReportRequestCategoryIds :: Maybe [Integer]
    <*> arbitraryReducedMaybe n -- generateStocksOnWarehousesReportRequestHasStocks :: Maybe Bool
  
instance Arbitrary GenerateUnitedMarketplaceServicesReportRequest where
  arbitrary = sized genGenerateUnitedMarketplaceServicesReportRequest

genGenerateUnitedMarketplaceServicesReportRequest :: Int -> Gen GenerateUnitedMarketplaceServicesReportRequest
genGenerateUnitedMarketplaceServicesReportRequest n =
  GenerateUnitedMarketplaceServicesReportRequest
    <$> arbitrary -- generateUnitedMarketplaceServicesReportRequestBusinessId :: Integer
    <*> arbitraryReducedMaybe n -- generateUnitedMarketplaceServicesReportRequestDateTimeFrom :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- generateUnitedMarketplaceServicesReportRequestDateTimeTo :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- generateUnitedMarketplaceServicesReportRequestDateFrom :: Maybe Date
    <*> arbitraryReducedMaybe n -- generateUnitedMarketplaceServicesReportRequestDateTo :: Maybe Date
    <*> arbitraryReducedMaybe n -- generateUnitedMarketplaceServicesReportRequestYearFrom :: Maybe Int
    <*> arbitraryReducedMaybe n -- generateUnitedMarketplaceServicesReportRequestMonthFrom :: Maybe Int
    <*> arbitraryReducedMaybe n -- generateUnitedMarketplaceServicesReportRequestYearTo :: Maybe Int
    <*> arbitraryReducedMaybe n -- generateUnitedMarketplaceServicesReportRequestMonthTo :: Maybe Int
    <*> arbitraryReducedMaybe n -- generateUnitedMarketplaceServicesReportRequestPlacementPrograms :: Maybe [PlacementType]
    <*> arbitraryReducedMaybe n -- generateUnitedMarketplaceServicesReportRequestInns :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- generateUnitedMarketplaceServicesReportRequestCampaignIds :: Maybe [Integer]
  
instance Arbitrary GenerateUnitedNettingReportRequest where
  arbitrary = sized genGenerateUnitedNettingReportRequest

genGenerateUnitedNettingReportRequest :: Int -> Gen GenerateUnitedNettingReportRequest
genGenerateUnitedNettingReportRequest n =
  GenerateUnitedNettingReportRequest
    <$> arbitrary -- generateUnitedNettingReportRequestBusinessId :: Integer
    <*> arbitraryReducedMaybe n -- generateUnitedNettingReportRequestDateTimeFrom :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- generateUnitedNettingReportRequestDateTimeTo :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- generateUnitedNettingReportRequestDateFrom :: Maybe Date
    <*> arbitraryReducedMaybe n -- generateUnitedNettingReportRequestDateTo :: Maybe Date
    <*> arbitraryReducedMaybe n -- generateUnitedNettingReportRequestBankOrderId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- generateUnitedNettingReportRequestBankOrderDateTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- generateUnitedNettingReportRequestPlacementPrograms :: Maybe [PlacementType]
    <*> arbitraryReducedMaybe n -- generateUnitedNettingReportRequestInns :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- generateUnitedNettingReportRequestCampaignIds :: Maybe [Integer]
  
instance Arbitrary GenerateUnitedOrdersRequest where
  arbitrary = sized genGenerateUnitedOrdersRequest

genGenerateUnitedOrdersRequest :: Int -> Gen GenerateUnitedOrdersRequest
genGenerateUnitedOrdersRequest n =
  GenerateUnitedOrdersRequest
    <$> arbitrary -- generateUnitedOrdersRequestBusinessId :: Integer
    <*> arbitraryReduced n -- generateUnitedOrdersRequestDateFrom :: Date
    <*> arbitraryReduced n -- generateUnitedOrdersRequestDateTo :: Date
    <*> arbitraryReducedMaybe n -- generateUnitedOrdersRequestCampaignIds :: Maybe [Integer]
    <*> arbitraryReducedMaybe n -- generateUnitedOrdersRequestPromoId :: Maybe Text
  
instance Arbitrary GetAllOffersResponse where
  arbitrary = sized genGetAllOffersResponse

genGetAllOffersResponse :: Int -> Gen GetAllOffersResponse
genGetAllOffersResponse n =
  GetAllOffersResponse
    <$> arbitraryReduced n -- getAllOffersResponseOffers :: [OfferDTO]
  
instance Arbitrary GetBidsInfoRequest where
  arbitrary = sized genGetBidsInfoRequest

genGetBidsInfoRequest :: Int -> Gen GetBidsInfoRequest
genGetBidsInfoRequest n =
  GetBidsInfoRequest
    <$> arbitraryReducedMaybe n -- getBidsInfoRequestSkus :: Maybe [Text]
  
instance Arbitrary GetBidsInfoResponse where
  arbitrary = sized genGetBidsInfoResponse

genGetBidsInfoResponse :: Int -> Gen GetBidsInfoResponse
genGetBidsInfoResponse n =
  GetBidsInfoResponse
    <$> arbitraryReducedMaybe n -- getBidsInfoResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getBidsInfoResponseResult :: Maybe GetBidsInfoResponseDTO
  
instance Arbitrary GetBidsInfoResponseDTO where
  arbitrary = sized genGetBidsInfoResponseDTO

genGetBidsInfoResponseDTO :: Int -> Gen GetBidsInfoResponseDTO
genGetBidsInfoResponseDTO n =
  GetBidsInfoResponseDTO
    <$> arbitraryReduced n -- getBidsInfoResponseDTOBids :: [SkuBidItemDTO]
    <*> arbitraryReducedMaybe n -- getBidsInfoResponseDTOPaging :: Maybe ForwardScrollingPagerDTO
  
instance Arbitrary GetBidsRecommendationsRequest where
  arbitrary = sized genGetBidsRecommendationsRequest

genGetBidsRecommendationsRequest :: Int -> Gen GetBidsRecommendationsRequest
genGetBidsRecommendationsRequest n =
  GetBidsRecommendationsRequest
    <$> arbitrary -- getBidsRecommendationsRequestSkus :: [Text]
  
instance Arbitrary GetBidsRecommendationsResponse where
  arbitrary = sized genGetBidsRecommendationsResponse

genGetBidsRecommendationsResponse :: Int -> Gen GetBidsRecommendationsResponse
genGetBidsRecommendationsResponse n =
  GetBidsRecommendationsResponse
    <$> arbitraryReducedMaybe n -- getBidsRecommendationsResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getBidsRecommendationsResponseResult :: Maybe GetBidsRecommendationsResponseDTO
  
instance Arbitrary GetBidsRecommendationsResponseDTO where
  arbitrary = sized genGetBidsRecommendationsResponseDTO

genGetBidsRecommendationsResponseDTO :: Int -> Gen GetBidsRecommendationsResponseDTO
genGetBidsRecommendationsResponseDTO n =
  GetBidsRecommendationsResponseDTO
    <$> arbitraryReduced n -- getBidsRecommendationsResponseDTORecommendations :: [SkuBidRecommendationItemDTO]
  
instance Arbitrary GetBusinessBuyerInfoResponse where
  arbitrary = sized genGetBusinessBuyerInfoResponse

genGetBusinessBuyerInfoResponse :: Int -> Gen GetBusinessBuyerInfoResponse
genGetBusinessBuyerInfoResponse n =
  GetBusinessBuyerInfoResponse
    <$> arbitraryReducedMaybe n -- getBusinessBuyerInfoResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getBusinessBuyerInfoResponseResult :: Maybe OrderBusinessBuyerDTO
  
instance Arbitrary GetBusinessDocumentsInfoResponse where
  arbitrary = sized genGetBusinessDocumentsInfoResponse

genGetBusinessDocumentsInfoResponse :: Int -> Gen GetBusinessDocumentsInfoResponse
genGetBusinessDocumentsInfoResponse n =
  GetBusinessDocumentsInfoResponse
    <$> arbitraryReducedMaybe n -- getBusinessDocumentsInfoResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getBusinessDocumentsInfoResponseResult :: Maybe OrderBusinessDocumentsDTO
  
instance Arbitrary GetBusinessSettingsInfoDTO where
  arbitrary = sized genGetBusinessSettingsInfoDTO

genGetBusinessSettingsInfoDTO :: Int -> Gen GetBusinessSettingsInfoDTO
genGetBusinessSettingsInfoDTO n =
  GetBusinessSettingsInfoDTO
    <$> arbitraryReducedMaybe n -- getBusinessSettingsInfoDTOInfo :: Maybe BusinessDTO
    <*> arbitraryReducedMaybe n -- getBusinessSettingsInfoDTOSettings :: Maybe BusinessSettingsDTO
  
instance Arbitrary GetBusinessSettingsResponse where
  arbitrary = sized genGetBusinessSettingsResponse

genGetBusinessSettingsResponse :: Int -> Gen GetBusinessSettingsResponse
genGetBusinessSettingsResponse n =
  GetBusinessSettingsResponse
    <$> arbitraryReducedMaybe n -- getBusinessSettingsResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getBusinessSettingsResponseResult :: Maybe GetBusinessSettingsInfoDTO
  
instance Arbitrary GetCampaignLoginsResponse where
  arbitrary = sized genGetCampaignLoginsResponse

genGetCampaignLoginsResponse :: Int -> Gen GetCampaignLoginsResponse
genGetCampaignLoginsResponse n =
  GetCampaignLoginsResponse
    <$> arbitrary -- getCampaignLoginsResponseLogins :: [Text]
  
instance Arbitrary GetCampaignOfferDTO where
  arbitrary = sized genGetCampaignOfferDTO

genGetCampaignOfferDTO :: Int -> Gen GetCampaignOfferDTO
genGetCampaignOfferDTO n =
  GetCampaignOfferDTO
    <$> arbitrary -- getCampaignOfferDTOOfferId :: Text
    <*> arbitraryReducedMaybe n -- getCampaignOfferDTOQuantum :: Maybe QuantumDTO
    <*> arbitraryReducedMaybe n -- getCampaignOfferDTOAvailable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- getCampaignOfferDTOBasicPrice :: Maybe GetPriceWithDiscountDTO
    <*> arbitraryReducedMaybe n -- getCampaignOfferDTOCampaignPrice :: Maybe GetPriceWithVatDTO
    <*> arbitraryReducedMaybe n -- getCampaignOfferDTOStatus :: Maybe OfferCampaignStatusType
    <*> arbitraryReducedMaybe n -- getCampaignOfferDTOErrors :: Maybe [OfferErrorDTO]
    <*> arbitraryReducedMaybe n -- getCampaignOfferDTOWarnings :: Maybe [OfferErrorDTO]
  
instance Arbitrary GetCampaignOffersRequest where
  arbitrary = sized genGetCampaignOffersRequest

genGetCampaignOffersRequest :: Int -> Gen GetCampaignOffersRequest
genGetCampaignOffersRequest n =
  GetCampaignOffersRequest
    <$> arbitraryReducedMaybe n -- getCampaignOffersRequestOfferIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getCampaignOffersRequestStatuses :: Maybe [OfferCampaignStatusType]
    <*> arbitraryReducedMaybe n -- getCampaignOffersRequestCategoryIds :: Maybe [Int]
    <*> arbitraryReducedMaybe n -- getCampaignOffersRequestVendorNames :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getCampaignOffersRequestTags :: Maybe [Text]
  
instance Arbitrary GetCampaignOffersResponse where
  arbitrary = sized genGetCampaignOffersResponse

genGetCampaignOffersResponse :: Int -> Gen GetCampaignOffersResponse
genGetCampaignOffersResponse n =
  GetCampaignOffersResponse
    <$> arbitraryReducedMaybe n -- getCampaignOffersResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getCampaignOffersResponseResult :: Maybe GetCampaignOffersResultDTO
  
instance Arbitrary GetCampaignOffersResultDTO where
  arbitrary = sized genGetCampaignOffersResultDTO

genGetCampaignOffersResultDTO :: Int -> Gen GetCampaignOffersResultDTO
genGetCampaignOffersResultDTO n =
  GetCampaignOffersResultDTO
    <$> arbitraryReducedMaybe n -- getCampaignOffersResultDTOPaging :: Maybe ScrollingPagerDTO
    <*> arbitraryReduced n -- getCampaignOffersResultDTOOffers :: [GetCampaignOfferDTO]
  
instance Arbitrary GetCampaignRegionResponse where
  arbitrary = sized genGetCampaignRegionResponse

genGetCampaignRegionResponse :: Int -> Gen GetCampaignRegionResponse
genGetCampaignRegionResponse n =
  GetCampaignRegionResponse
    <$> arbitraryReducedMaybe n -- getCampaignRegionResponseRegion :: Maybe RegionDTO
  
instance Arbitrary GetCampaignResponse where
  arbitrary = sized genGetCampaignResponse

genGetCampaignResponse :: Int -> Gen GetCampaignResponse
genGetCampaignResponse n =
  GetCampaignResponse
    <$> arbitraryReducedMaybe n -- getCampaignResponseCampaign :: Maybe CampaignDTO
  
instance Arbitrary GetCampaignSettingsResponse where
  arbitrary = sized genGetCampaignSettingsResponse

genGetCampaignSettingsResponse :: Int -> Gen GetCampaignSettingsResponse
genGetCampaignSettingsResponse n =
  GetCampaignSettingsResponse
    <$> arbitraryReducedMaybe n -- getCampaignSettingsResponseSettings :: Maybe CampaignSettingsDTO
  
instance Arbitrary GetCampaignsResponse where
  arbitrary = sized genGetCampaignsResponse

genGetCampaignsResponse :: Int -> Gen GetCampaignsResponse
genGetCampaignsResponse n =
  GetCampaignsResponse
    <$> arbitraryReduced n -- getCampaignsResponseCampaigns :: [CampaignDTO]
    <*> arbitraryReducedMaybe n -- getCampaignsResponsePager :: Maybe FlippingPagerDTO
  
instance Arbitrary GetCategoriesMaxSaleQuantumDTO where
  arbitrary = sized genGetCategoriesMaxSaleQuantumDTO

genGetCategoriesMaxSaleQuantumDTO :: Int -> Gen GetCategoriesMaxSaleQuantumDTO
genGetCategoriesMaxSaleQuantumDTO n =
  GetCategoriesMaxSaleQuantumDTO
    <$> arbitraryReduced n -- getCategoriesMaxSaleQuantumDTOResults :: [MaxSaleQuantumDTO]
    <*> arbitraryReducedMaybe n -- getCategoriesMaxSaleQuantumDTOErrors :: Maybe [CategoryErrorDTO]
  
instance Arbitrary GetCategoriesMaxSaleQuantumRequest where
  arbitrary = sized genGetCategoriesMaxSaleQuantumRequest

genGetCategoriesMaxSaleQuantumRequest :: Int -> Gen GetCategoriesMaxSaleQuantumRequest
genGetCategoriesMaxSaleQuantumRequest n =
  GetCategoriesMaxSaleQuantumRequest
    <$> arbitrary -- getCategoriesMaxSaleQuantumRequestMarketCategoryIds :: [Integer]
  
instance Arbitrary GetCategoriesMaxSaleQuantumResponse where
  arbitrary = sized genGetCategoriesMaxSaleQuantumResponse

genGetCategoriesMaxSaleQuantumResponse :: Int -> Gen GetCategoriesMaxSaleQuantumResponse
genGetCategoriesMaxSaleQuantumResponse n =
  GetCategoriesMaxSaleQuantumResponse
    <$> arbitraryReducedMaybe n -- getCategoriesMaxSaleQuantumResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReduced n -- getCategoriesMaxSaleQuantumResponseResults :: [MaxSaleQuantumDTO]
    <*> arbitraryReducedMaybe n -- getCategoriesMaxSaleQuantumResponseErrors :: Maybe [CategoryErrorDTO]
  
instance Arbitrary GetCategoriesRequest where
  arbitrary = sized genGetCategoriesRequest

genGetCategoriesRequest :: Int -> Gen GetCategoriesRequest
genGetCategoriesRequest n =
  GetCategoriesRequest
    <$> arbitraryReducedMaybe n -- getCategoriesRequestLanguage :: Maybe LanguageType
  
instance Arbitrary GetCategoriesResponse where
  arbitrary = sized genGetCategoriesResponse

genGetCategoriesResponse :: Int -> Gen GetCategoriesResponse
genGetCategoriesResponse n =
  GetCategoriesResponse
    <$> arbitraryReducedMaybe n -- getCategoriesResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getCategoriesResponseResult :: Maybe CategoryDTO
  
instance Arbitrary GetCategoryContentParametersResponse where
  arbitrary = sized genGetCategoryContentParametersResponse

genGetCategoryContentParametersResponse :: Int -> Gen GetCategoryContentParametersResponse
genGetCategoryContentParametersResponse n =
  GetCategoryContentParametersResponse
    <$> arbitraryReducedMaybe n -- getCategoryContentParametersResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getCategoryContentParametersResponseResult :: Maybe CategoryContentParametersDTO
  
instance Arbitrary GetChatHistoryRequest where
  arbitrary = sized genGetChatHistoryRequest

genGetChatHistoryRequest :: Int -> Gen GetChatHistoryRequest
genGetChatHistoryRequest n =
  GetChatHistoryRequest
    <$> arbitraryReducedMaybe n -- getChatHistoryRequestMessageIdFrom :: Maybe Integer
  
instance Arbitrary GetChatHistoryResponse where
  arbitrary = sized genGetChatHistoryResponse

genGetChatHistoryResponse :: Int -> Gen GetChatHistoryResponse
genGetChatHistoryResponse n =
  GetChatHistoryResponse
    <$> arbitraryReducedMaybe n -- getChatHistoryResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getChatHistoryResponseResult :: Maybe ChatMessagesResultDTO
  
instance Arbitrary GetChatInfoDTO where
  arbitrary = sized genGetChatInfoDTO

genGetChatInfoDTO :: Int -> Gen GetChatInfoDTO
genGetChatInfoDTO n =
  GetChatInfoDTO
    <$> arbitrary -- getChatInfoDTOChatId :: Integer
    <*> arbitrary -- getChatInfoDTOOrderId :: Integer
    <*> arbitraryReduced n -- getChatInfoDTOType :: ChatType
    <*> arbitraryReduced n -- getChatInfoDTOStatus :: ChatStatusType
    <*> arbitraryReduced n -- getChatInfoDTOCreatedAt :: DateTime
    <*> arbitraryReduced n -- getChatInfoDTOUpdatedAt :: DateTime
  
instance Arbitrary GetChatsInfoDTO where
  arbitrary = sized genGetChatsInfoDTO

genGetChatsInfoDTO :: Int -> Gen GetChatsInfoDTO
genGetChatsInfoDTO n =
  GetChatsInfoDTO
    <$> arbitraryReduced n -- getChatsInfoDTOChats :: [GetChatInfoDTO]
    <*> arbitraryReducedMaybe n -- getChatsInfoDTOPaging :: Maybe ForwardScrollingPagerDTO
  
instance Arbitrary GetChatsRequest where
  arbitrary = sized genGetChatsRequest

genGetChatsRequest :: Int -> Gen GetChatsRequest
genGetChatsRequest n =
  GetChatsRequest
    <$> arbitraryReducedMaybe n -- getChatsRequestOrderIds :: Maybe [Integer]
    <*> arbitraryReducedMaybe n -- getChatsRequestTypes :: Maybe [ChatType]
    <*> arbitraryReducedMaybe n -- getChatsRequestStatuses :: Maybe [ChatStatusType]
  
instance Arbitrary GetChatsResponse where
  arbitrary = sized genGetChatsResponse

genGetChatsResponse :: Int -> Gen GetChatsResponse
genGetChatsResponse n =
  GetChatsResponse
    <$> arbitraryReducedMaybe n -- getChatsResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getChatsResponseResult :: Maybe GetChatsInfoDTO
  
instance Arbitrary GetDeliveryServicesResponse where
  arbitrary = sized genGetDeliveryServicesResponse

genGetDeliveryServicesResponse :: Int -> Gen GetDeliveryServicesResponse
genGetDeliveryServicesResponse n =
  GetDeliveryServicesResponse
    <$> arbitraryReducedMaybe n -- getDeliveryServicesResponseResult :: Maybe DeliveryServicesDTO
  
instance Arbitrary GetFeedIndexLogsResponse where
  arbitrary = sized genGetFeedIndexLogsResponse

genGetFeedIndexLogsResponse :: Int -> Gen GetFeedIndexLogsResponse
genGetFeedIndexLogsResponse n =
  GetFeedIndexLogsResponse
    <$> arbitraryReducedMaybe n -- getFeedIndexLogsResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getFeedIndexLogsResponseResult :: Maybe FeedIndexLogsResultDTO
  
instance Arbitrary GetFeedResponse where
  arbitrary = sized genGetFeedResponse

genGetFeedResponse :: Int -> Gen GetFeedResponse
genGetFeedResponse n =
  GetFeedResponse
    <$> arbitraryReducedMaybe n -- getFeedResponseFeed :: Maybe FeedDTO
  
instance Arbitrary GetFeedbackListResponse where
  arbitrary = sized genGetFeedbackListResponse

genGetFeedbackListResponse :: Int -> Gen GetFeedbackListResponse
genGetFeedbackListResponse n =
  GetFeedbackListResponse
    <$> arbitraryReducedMaybe n -- getFeedbackListResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getFeedbackListResponseResult :: Maybe FeedbackListDTO
  
instance Arbitrary GetFeedsResponse where
  arbitrary = sized genGetFeedsResponse

genGetFeedsResponse :: Int -> Gen GetFeedsResponse
genGetFeedsResponse n =
  GetFeedsResponse
    <$> arbitraryReduced n -- getFeedsResponseFeeds :: [FeedDTO]
  
instance Arbitrary GetFulfillmentWarehousesResponse where
  arbitrary = sized genGetFulfillmentWarehousesResponse

genGetFulfillmentWarehousesResponse :: Int -> Gen GetFulfillmentWarehousesResponse
genGetFulfillmentWarehousesResponse n =
  GetFulfillmentWarehousesResponse
    <$> arbitraryReducedMaybe n -- getFulfillmentWarehousesResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getFulfillmentWarehousesResponseResult :: Maybe FulfillmentWarehousesDTO
  
instance Arbitrary GetGoodsFeedbackCommentsRequest where
  arbitrary = sized genGetGoodsFeedbackCommentsRequest

genGetGoodsFeedbackCommentsRequest :: Int -> Gen GetGoodsFeedbackCommentsRequest
genGetGoodsFeedbackCommentsRequest n =
  GetGoodsFeedbackCommentsRequest
    <$> arbitrary -- getGoodsFeedbackCommentsRequestFeedbackId :: Integer
  
instance Arbitrary GetGoodsFeedbackCommentsResponse where
  arbitrary = sized genGetGoodsFeedbackCommentsResponse

genGetGoodsFeedbackCommentsResponse :: Int -> Gen GetGoodsFeedbackCommentsResponse
genGetGoodsFeedbackCommentsResponse n =
  GetGoodsFeedbackCommentsResponse
    <$> arbitraryReducedMaybe n -- getGoodsFeedbackCommentsResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getGoodsFeedbackCommentsResponseResult :: Maybe GoodsFeedbackCommentListDTO
  
instance Arbitrary GetGoodsFeedbackRequest where
  arbitrary = sized genGetGoodsFeedbackRequest

genGetGoodsFeedbackRequest :: Int -> Gen GetGoodsFeedbackRequest
genGetGoodsFeedbackRequest n =
  GetGoodsFeedbackRequest
    <$> arbitraryReducedMaybe n -- getGoodsFeedbackRequestDateTimeFrom :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- getGoodsFeedbackRequestDateTimeTo :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- getGoodsFeedbackRequestReactionStatus :: Maybe FeedbackReactionStatusType
    <*> arbitraryReducedMaybe n -- getGoodsFeedbackRequestRatingValues :: Maybe [Int]
    <*> arbitraryReducedMaybe n -- getGoodsFeedbackRequestModelIds :: Maybe [Integer]
    <*> arbitraryReducedMaybe n -- getGoodsFeedbackRequestPaid :: Maybe Bool
  
instance Arbitrary GetGoodsFeedbackResponse where
  arbitrary = sized genGetGoodsFeedbackResponse

genGetGoodsFeedbackResponse :: Int -> Gen GetGoodsFeedbackResponse
genGetGoodsFeedbackResponse n =
  GetGoodsFeedbackResponse
    <$> arbitraryReducedMaybe n -- getGoodsFeedbackResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getGoodsFeedbackResponseResult :: Maybe GoodsFeedbackListDTO
  
instance Arbitrary GetGoodsStatsRequest where
  arbitrary = sized genGetGoodsStatsRequest

genGetGoodsStatsRequest :: Int -> Gen GetGoodsStatsRequest
genGetGoodsStatsRequest n =
  GetGoodsStatsRequest
    <$> arbitrary -- getGoodsStatsRequestShopSkus :: [Text]
  
instance Arbitrary GetGoodsStatsResponse where
  arbitrary = sized genGetGoodsStatsResponse

genGetGoodsStatsResponse :: Int -> Gen GetGoodsStatsResponse
genGetGoodsStatsResponse n =
  GetGoodsStatsResponse
    <$> arbitraryReducedMaybe n -- getGoodsStatsResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getGoodsStatsResponseResult :: Maybe GoodsStatsDTO
  
instance Arbitrary GetHiddenOffersResponse where
  arbitrary = sized genGetHiddenOffersResponse

genGetHiddenOffersResponse :: Int -> Gen GetHiddenOffersResponse
genGetHiddenOffersResponse n =
  GetHiddenOffersResponse
    <$> arbitraryReducedMaybe n -- getHiddenOffersResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getHiddenOffersResponseResult :: Maybe GetHiddenOffersResultDTO
  
instance Arbitrary GetHiddenOffersResultDTO where
  arbitrary = sized genGetHiddenOffersResultDTO

genGetHiddenOffersResultDTO :: Int -> Gen GetHiddenOffersResultDTO
genGetHiddenOffersResultDTO n =
  GetHiddenOffersResultDTO
    <$> arbitraryReducedMaybe n -- getHiddenOffersResultDTOPaging :: Maybe ScrollingPagerDTO
    <*> arbitraryReduced n -- getHiddenOffersResultDTOHiddenOffers :: [HiddenOfferDTO]
  
instance Arbitrary GetMappingDTO where
  arbitrary = sized genGetMappingDTO

genGetMappingDTO :: Int -> Gen GetMappingDTO
genGetMappingDTO n =
  GetMappingDTO
    <$> arbitraryReducedMaybe n -- getMappingDTOMarketSku :: Maybe Integer
    <*> arbitraryReducedMaybe n -- getMappingDTOMarketSkuName :: Maybe Text
    <*> arbitraryReducedMaybe n -- getMappingDTOMarketModelId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- getMappingDTOMarketModelName :: Maybe Text
    <*> arbitraryReducedMaybe n -- getMappingDTOMarketCategoryId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- getMappingDTOMarketCategoryName :: Maybe Text
  
instance Arbitrary GetModelsOffersResponse where
  arbitrary = sized genGetModelsOffersResponse

genGetModelsOffersResponse :: Int -> Gen GetModelsOffersResponse
genGetModelsOffersResponse n =
  GetModelsOffersResponse
    <$> arbitraryReduced n -- getModelsOffersResponseModels :: [EnrichedModelDTO]
    <*> arbitraryReducedMaybe n -- getModelsOffersResponseCurrency :: Maybe CurrencyType
    <*> arbitraryReducedMaybe n -- getModelsOffersResponseRegionId :: Maybe Integer
  
instance Arbitrary GetModelsRequest where
  arbitrary = sized genGetModelsRequest

genGetModelsRequest :: Int -> Gen GetModelsRequest
genGetModelsRequest n =
  GetModelsRequest
    <$> arbitrary -- getModelsRequestModels :: [Integer]
  
instance Arbitrary GetModelsResponse where
  arbitrary = sized genGetModelsResponse

genGetModelsResponse :: Int -> Gen GetModelsResponse
genGetModelsResponse n =
  GetModelsResponse
    <$> arbitraryReduced n -- getModelsResponseModels :: [ModelDTO]
    <*> arbitraryReducedMaybe n -- getModelsResponseCurrency :: Maybe CurrencyType
    <*> arbitraryReducedMaybe n -- getModelsResponseRegionId :: Maybe Integer
  
instance Arbitrary GetOfferCardsContentStatusRequest where
  arbitrary = sized genGetOfferCardsContentStatusRequest

genGetOfferCardsContentStatusRequest :: Int -> Gen GetOfferCardsContentStatusRequest
genGetOfferCardsContentStatusRequest n =
  GetOfferCardsContentStatusRequest
    <$> arbitraryReducedMaybe n -- getOfferCardsContentStatusRequestOfferIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getOfferCardsContentStatusRequestCardStatuses :: Maybe [OfferCardStatusType]
    <*> arbitraryReducedMaybe n -- getOfferCardsContentStatusRequestCategoryIds :: Maybe [Int]
  
instance Arbitrary GetOfferCardsContentStatusResponse where
  arbitrary = sized genGetOfferCardsContentStatusResponse

genGetOfferCardsContentStatusResponse :: Int -> Gen GetOfferCardsContentStatusResponse
genGetOfferCardsContentStatusResponse n =
  GetOfferCardsContentStatusResponse
    <$> arbitraryReducedMaybe n -- getOfferCardsContentStatusResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getOfferCardsContentStatusResponseResult :: Maybe OfferCardsContentStatusDTO
  
instance Arbitrary GetOfferDTO where
  arbitrary = sized genGetOfferDTO

genGetOfferDTO :: Int -> Gen GetOfferDTO
genGetOfferDTO n =
  GetOfferDTO
    <$> arbitrary -- getOfferDTOOfferId :: Text
    <*> arbitraryReducedMaybe n -- getOfferDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- getOfferDTOMarketCategoryId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- getOfferDTOCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- getOfferDTOPictures :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getOfferDTOVideos :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getOfferDTOManuals :: Maybe [OfferManualDTO]
    <*> arbitraryReducedMaybe n -- getOfferDTOVendor :: Maybe Text
    <*> arbitraryReducedMaybe n -- getOfferDTOBarcodes :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getOfferDTODescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- getOfferDTOManufacturerCountries :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getOfferDTOWeightDimensions :: Maybe OfferWeightDimensionsDTO
    <*> arbitraryReducedMaybe n -- getOfferDTOVendorCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- getOfferDTOTags :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getOfferDTOShelfLife :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- getOfferDTOLifeTime :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- getOfferDTOGuaranteePeriod :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- getOfferDTOCustomsCommodityCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- getOfferDTOCertificates :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getOfferDTOBoxCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- getOfferDTOCondition :: Maybe OfferConditionDTO
    <*> arbitraryReducedMaybe n -- getOfferDTOType :: Maybe OfferType
    <*> arbitraryReducedMaybe n -- getOfferDTODownloadable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- getOfferDTOAdult :: Maybe Bool
    <*> arbitraryReducedMaybe n -- getOfferDTOAge :: Maybe AgeDTO
    <*> arbitraryReducedMaybe n -- getOfferDTOParams :: Maybe [OfferParamDTO]
    <*> arbitraryReducedMaybe n -- getOfferDTOBasicPrice :: Maybe GetPriceWithDiscountDTO
    <*> arbitraryReducedMaybe n -- getOfferDTOPurchasePrice :: Maybe GetPriceDTO
    <*> arbitraryReducedMaybe n -- getOfferDTOAdditionalExpenses :: Maybe GetPriceDTO
    <*> arbitraryReducedMaybe n -- getOfferDTOCofinancePrice :: Maybe GetPriceDTO
    <*> arbitraryReducedMaybe n -- getOfferDTOCardStatus :: Maybe OfferCardStatusType
    <*> arbitraryReducedMaybe n -- getOfferDTOCampaigns :: Maybe [OfferCampaignStatusDTO]
    <*> arbitraryReducedMaybe n -- getOfferDTOSellingPrograms :: Maybe [OfferSellingProgramDTO]
    <*> arbitraryReducedMaybe n -- getOfferDTOArchived :: Maybe Bool
  
instance Arbitrary GetOfferMappingDTO where
  arbitrary = sized genGetOfferMappingDTO

genGetOfferMappingDTO :: Int -> Gen GetOfferMappingDTO
genGetOfferMappingDTO n =
  GetOfferMappingDTO
    <$> arbitraryReducedMaybe n -- getOfferMappingDTOOffer :: Maybe GetOfferDTO
    <*> arbitraryReducedMaybe n -- getOfferMappingDTOMapping :: Maybe GetMappingDTO
  
instance Arbitrary GetOfferMappingEntriesResponse where
  arbitrary = sized genGetOfferMappingEntriesResponse

genGetOfferMappingEntriesResponse :: Int -> Gen GetOfferMappingEntriesResponse
genGetOfferMappingEntriesResponse n =
  GetOfferMappingEntriesResponse
    <$> arbitraryReducedMaybe n -- getOfferMappingEntriesResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getOfferMappingEntriesResponseResult :: Maybe OfferMappingEntriesDTO
  
instance Arbitrary GetOfferMappingsRequest where
  arbitrary = sized genGetOfferMappingsRequest

genGetOfferMappingsRequest :: Int -> Gen GetOfferMappingsRequest
genGetOfferMappingsRequest n =
  GetOfferMappingsRequest
    <$> arbitraryReducedMaybe n -- getOfferMappingsRequestOfferIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getOfferMappingsRequestCardStatuses :: Maybe [OfferCardStatusType]
    <*> arbitraryReducedMaybe n -- getOfferMappingsRequestCategoryIds :: Maybe [Int]
    <*> arbitraryReducedMaybe n -- getOfferMappingsRequestVendorNames :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getOfferMappingsRequestTags :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getOfferMappingsRequestArchived :: Maybe Bool
  
instance Arbitrary GetOfferMappingsResponse where
  arbitrary = sized genGetOfferMappingsResponse

genGetOfferMappingsResponse :: Int -> Gen GetOfferMappingsResponse
genGetOfferMappingsResponse n =
  GetOfferMappingsResponse
    <$> arbitraryReducedMaybe n -- getOfferMappingsResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getOfferMappingsResponseResult :: Maybe GetOfferMappingsResultDTO
  
instance Arbitrary GetOfferMappingsResultDTO where
  arbitrary = sized genGetOfferMappingsResultDTO

genGetOfferMappingsResultDTO :: Int -> Gen GetOfferMappingsResultDTO
genGetOfferMappingsResultDTO n =
  GetOfferMappingsResultDTO
    <$> arbitraryReducedMaybe n -- getOfferMappingsResultDTOPaging :: Maybe ScrollingPagerDTO
    <*> arbitraryReduced n -- getOfferMappingsResultDTOOfferMappings :: [GetOfferMappingDTO]
  
instance Arbitrary GetOfferRecommendationsRequest where
  arbitrary = sized genGetOfferRecommendationsRequest

genGetOfferRecommendationsRequest :: Int -> Gen GetOfferRecommendationsRequest
genGetOfferRecommendationsRequest n =
  GetOfferRecommendationsRequest
    <$> arbitraryReducedMaybe n -- getOfferRecommendationsRequestOfferIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getOfferRecommendationsRequestCofinancePriceFilter :: Maybe FieldStateType
    <*> arbitraryReducedMaybe n -- getOfferRecommendationsRequestRecommendedCofinancePriceFilter :: Maybe FieldStateType
    <*> arbitraryReducedMaybe n -- getOfferRecommendationsRequestCompetitivenessFilter :: Maybe PriceCompetitivenessType
  
instance Arbitrary GetOfferRecommendationsResponse where
  arbitrary = sized genGetOfferRecommendationsResponse

genGetOfferRecommendationsResponse :: Int -> Gen GetOfferRecommendationsResponse
genGetOfferRecommendationsResponse n =
  GetOfferRecommendationsResponse
    <$> arbitraryReducedMaybe n -- getOfferRecommendationsResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getOfferRecommendationsResponseResult :: Maybe OfferRecommendationsResultDTO
  
instance Arbitrary GetOffersResponse where
  arbitrary = sized genGetOffersResponse

genGetOffersResponse :: Int -> Gen GetOffersResponse
genGetOffersResponse n =
  GetOffersResponse
    <$> arbitraryReduced n -- getOffersResponseOffers :: [OfferDTO]
    <*> arbitraryReducedMaybe n -- getOffersResponsePager :: Maybe FlippingPagerDTO
  
instance Arbitrary GetOrderBuyerInfoResponse where
  arbitrary = sized genGetOrderBuyerInfoResponse

genGetOrderBuyerInfoResponse :: Int -> Gen GetOrderBuyerInfoResponse
genGetOrderBuyerInfoResponse n =
  GetOrderBuyerInfoResponse
    <$> arbitraryReducedMaybe n -- getOrderBuyerInfoResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getOrderBuyerInfoResponseResult :: Maybe OrderBuyerInfoDTO
  
instance Arbitrary GetOrderLabelsDataResponse where
  arbitrary = sized genGetOrderLabelsDataResponse

genGetOrderLabelsDataResponse :: Int -> Gen GetOrderLabelsDataResponse
genGetOrderLabelsDataResponse n =
  GetOrderLabelsDataResponse
    <$> arbitraryReducedMaybe n -- getOrderLabelsDataResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getOrderLabelsDataResponseResult :: Maybe OrderLabelDTO
  
instance Arbitrary GetOrderResponse where
  arbitrary = sized genGetOrderResponse

genGetOrderResponse :: Int -> Gen GetOrderResponse
genGetOrderResponse n =
  GetOrderResponse
    <$> arbitraryReducedMaybe n -- getOrderResponseOrder :: Maybe OrderDTO
  
instance Arbitrary GetOrdersResponse where
  arbitrary = sized genGetOrdersResponse

genGetOrdersResponse :: Int -> Gen GetOrdersResponse
genGetOrdersResponse n =
  GetOrdersResponse
    <$> arbitraryReducedMaybe n -- getOrdersResponsePager :: Maybe FlippingPagerDTO
    <*> arbitraryReduced n -- getOrdersResponseOrders :: [OrderDTO]
    <*> arbitraryReducedMaybe n -- getOrdersResponsePaging :: Maybe ForwardScrollingPagerDTO
  
instance Arbitrary GetOrdersStatsRequest where
  arbitrary = sized genGetOrdersStatsRequest

genGetOrdersStatsRequest :: Int -> Gen GetOrdersStatsRequest
genGetOrdersStatsRequest n =
  GetOrdersStatsRequest
    <$> arbitraryReducedMaybe n -- getOrdersStatsRequestDateFrom :: Maybe Date
    <*> arbitraryReducedMaybe n -- getOrdersStatsRequestDateTo :: Maybe Date
    <*> arbitraryReducedMaybe n -- getOrdersStatsRequestUpdateFrom :: Maybe Date
    <*> arbitraryReducedMaybe n -- getOrdersStatsRequestUpdateTo :: Maybe Date
    <*> arbitraryReducedMaybe n -- getOrdersStatsRequestOrders :: Maybe [Integer]
    <*> arbitraryReducedMaybe n -- getOrdersStatsRequestStatuses :: Maybe [OrderStatsStatusType]
    <*> arbitraryReducedMaybe n -- getOrdersStatsRequestHasCis :: Maybe Bool
  
instance Arbitrary GetOrdersStatsResponse where
  arbitrary = sized genGetOrdersStatsResponse

genGetOrdersStatsResponse :: Int -> Gen GetOrdersStatsResponse
genGetOrdersStatsResponse n =
  GetOrdersStatsResponse
    <$> arbitraryReducedMaybe n -- getOrdersStatsResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getOrdersStatsResponseResult :: Maybe OrdersStatsDTO
  
instance Arbitrary GetOutletLicensesResponse where
  arbitrary = sized genGetOutletLicensesResponse

genGetOutletLicensesResponse :: Int -> Gen GetOutletLicensesResponse
genGetOutletLicensesResponse n =
  GetOutletLicensesResponse
    <$> arbitraryReducedMaybe n -- getOutletLicensesResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getOutletLicensesResponseResult :: Maybe OutletLicensesResponseDTO
  
instance Arbitrary GetOutletResponse where
  arbitrary = sized genGetOutletResponse

genGetOutletResponse :: Int -> Gen GetOutletResponse
genGetOutletResponse n =
  GetOutletResponse
    <$> arbitraryReducedMaybe n -- getOutletResponseOutlet :: Maybe FullOutletDTO
  
instance Arbitrary GetOutletsResponse where
  arbitrary = sized genGetOutletsResponse

genGetOutletsResponse :: Int -> Gen GetOutletsResponse
genGetOutletsResponse n =
  GetOutletsResponse
    <$> arbitraryReduced n -- getOutletsResponseOutlets :: [FullOutletDTO]
    <*> arbitraryReducedMaybe n -- getOutletsResponsePaging :: Maybe ScrollingPagerDTO
    <*> arbitraryReducedMaybe n -- getOutletsResponsePager :: Maybe FlippingPagerDTO
  
instance Arbitrary GetPriceDTO where
  arbitrary = sized genGetPriceDTO

genGetPriceDTO :: Int -> Gen GetPriceDTO
genGetPriceDTO n =
  GetPriceDTO
    <$> arbitrary -- getPriceDTOValue :: Double
    <*> arbitraryReduced n -- getPriceDTOCurrencyId :: CurrencyType
    <*> arbitraryReduced n -- getPriceDTOUpdatedAt :: DateTime
  
instance Arbitrary GetPriceWithDiscountDTO where
  arbitrary = sized genGetPriceWithDiscountDTO

genGetPriceWithDiscountDTO :: Int -> Gen GetPriceWithDiscountDTO
genGetPriceWithDiscountDTO n =
  GetPriceWithDiscountDTO
    <$> arbitrary -- getPriceWithDiscountDTOValue :: Double
    <*> arbitraryReduced n -- getPriceWithDiscountDTOCurrencyId :: CurrencyType
    <*> arbitraryReducedMaybe n -- getPriceWithDiscountDTODiscountBase :: Maybe Double
    <*> arbitraryReduced n -- getPriceWithDiscountDTOUpdatedAt :: DateTime
  
instance Arbitrary GetPriceWithVatDTO where
  arbitrary = sized genGetPriceWithVatDTO

genGetPriceWithVatDTO :: Int -> Gen GetPriceWithVatDTO
genGetPriceWithVatDTO n =
  GetPriceWithVatDTO
    <$> arbitraryReducedMaybe n -- getPriceWithVatDTOValue :: Maybe Double
    <*> arbitraryReducedMaybe n -- getPriceWithVatDTODiscountBase :: Maybe Double
    <*> arbitraryReducedMaybe n -- getPriceWithVatDTOCurrencyId :: Maybe CurrencyType
    <*> arbitraryReducedMaybe n -- getPriceWithVatDTOVat :: Maybe Int
    <*> arbitraryReduced n -- getPriceWithVatDTOUpdatedAt :: DateTime
  
instance Arbitrary GetPricesByOfferIdsRequest where
  arbitrary = sized genGetPricesByOfferIdsRequest

genGetPricesByOfferIdsRequest :: Int -> Gen GetPricesByOfferIdsRequest
genGetPricesByOfferIdsRequest n =
  GetPricesByOfferIdsRequest
    <$> arbitraryReducedMaybe n -- getPricesByOfferIdsRequestOfferIds :: Maybe [Text]
  
instance Arbitrary GetPricesByOfferIdsResponse where
  arbitrary = sized genGetPricesByOfferIdsResponse

genGetPricesByOfferIdsResponse :: Int -> Gen GetPricesByOfferIdsResponse
genGetPricesByOfferIdsResponse n =
  GetPricesByOfferIdsResponse
    <$> arbitraryReducedMaybe n -- getPricesByOfferIdsResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getPricesByOfferIdsResponseResult :: Maybe OfferPriceByOfferIdsListResponseDTO
  
instance Arbitrary GetPricesResponse where
  arbitrary = sized genGetPricesResponse

genGetPricesResponse :: Int -> Gen GetPricesResponse
genGetPricesResponse n =
  GetPricesResponse
    <$> arbitraryReducedMaybe n -- getPricesResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getPricesResponseResult :: Maybe OfferPriceListResponseDTO
  
instance Arbitrary GetPromoAssortmentInfoDTO where
  arbitrary = sized genGetPromoAssortmentInfoDTO

genGetPromoAssortmentInfoDTO :: Int -> Gen GetPromoAssortmentInfoDTO
genGetPromoAssortmentInfoDTO n =
  GetPromoAssortmentInfoDTO
    <$> arbitrary -- getPromoAssortmentInfoDTOActiveOffers :: Int
    <*> arbitraryReducedMaybe n -- getPromoAssortmentInfoDTOPotentialOffers :: Maybe Int
    <*> arbitraryReducedMaybe n -- getPromoAssortmentInfoDTOProcessing :: Maybe Bool
  
instance Arbitrary GetPromoBestsellerInfoDTO where
  arbitrary = sized genGetPromoBestsellerInfoDTO

genGetPromoBestsellerInfoDTO :: Int -> Gen GetPromoBestsellerInfoDTO
genGetPromoBestsellerInfoDTO n =
  GetPromoBestsellerInfoDTO
    <$> arbitrary -- getPromoBestsellerInfoDTOBestseller :: Bool
    <*> arbitraryReducedMaybe n -- getPromoBestsellerInfoDTOEntryDeadline :: Maybe DateTime
  
instance Arbitrary GetPromoConstraintsDTO where
  arbitrary = sized genGetPromoConstraintsDTO

genGetPromoConstraintsDTO :: Int -> Gen GetPromoConstraintsDTO
genGetPromoConstraintsDTO n =
  GetPromoConstraintsDTO
    <$> arbitraryReducedMaybe n -- getPromoConstraintsDTOWarehouseIds :: Maybe [Integer]
  
instance Arbitrary GetPromoDTO where
  arbitrary = sized genGetPromoDTO

genGetPromoDTO :: Int -> Gen GetPromoDTO
genGetPromoDTO n =
  GetPromoDTO
    <$> arbitrary -- getPromoDTOId :: Text
    <*> arbitrary -- getPromoDTOName :: Text
    <*> arbitraryReduced n -- getPromoDTOPeriod :: PromoPeriodDTO
    <*> arbitrary -- getPromoDTOParticipating :: Bool
    <*> arbitraryReduced n -- getPromoDTOAssortmentInfo :: GetPromoAssortmentInfoDTO
    <*> arbitraryReduced n -- getPromoDTOMechanicsInfo :: GetPromoMechanicsInfoDTO
    <*> arbitraryReduced n -- getPromoDTOBestsellerInfo :: GetPromoBestsellerInfoDTO
    <*> arbitraryReducedMaybe n -- getPromoDTOChannels :: Maybe [ChannelType]
    <*> arbitraryReducedMaybe n -- getPromoDTOConstraints :: Maybe GetPromoConstraintsDTO
  
instance Arbitrary GetPromoMechanicsInfoDTO where
  arbitrary = sized genGetPromoMechanicsInfoDTO

genGetPromoMechanicsInfoDTO :: Int -> Gen GetPromoMechanicsInfoDTO
genGetPromoMechanicsInfoDTO n =
  GetPromoMechanicsInfoDTO
    <$> arbitraryReduced n -- getPromoMechanicsInfoDTOType :: MechanicsType
    <*> arbitraryReducedMaybe n -- getPromoMechanicsInfoDTOPromocodeInfo :: Maybe GetPromoPromocodeInfoDTO
  
instance Arbitrary GetPromoOfferDTO where
  arbitrary = sized genGetPromoOfferDTO

genGetPromoOfferDTO :: Int -> Gen GetPromoOfferDTO
genGetPromoOfferDTO n =
  GetPromoOfferDTO
    <$> arbitrary -- getPromoOfferDTOOfferId :: Text
    <*> arbitraryReduced n -- getPromoOfferDTOStatus :: PromoOfferParticipationStatusType
    <*> arbitraryReduced n -- getPromoOfferDTOParams :: PromoOfferParamsDTO
    <*> arbitraryReducedMaybe n -- getPromoOfferDTOAutoParticipatingDetails :: Maybe PromoOfferAutoParticipatingDetailsDTO
  
instance Arbitrary GetPromoOffersRequest where
  arbitrary = sized genGetPromoOffersRequest

genGetPromoOffersRequest :: Int -> Gen GetPromoOffersRequest
genGetPromoOffersRequest n =
  GetPromoOffersRequest
    <$> arbitrary -- getPromoOffersRequestPromoId :: Text
    <*> arbitraryReducedMaybe n -- getPromoOffersRequestStatusType :: Maybe PromoOfferParticipationStatusFilterType
  
instance Arbitrary GetPromoOffersResponse where
  arbitrary = sized genGetPromoOffersResponse

genGetPromoOffersResponse :: Int -> Gen GetPromoOffersResponse
genGetPromoOffersResponse n =
  GetPromoOffersResponse
    <$> arbitraryReducedMaybe n -- getPromoOffersResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getPromoOffersResponseResult :: Maybe GetPromoOffersResultDTO
  
instance Arbitrary GetPromoOffersResultDTO where
  arbitrary = sized genGetPromoOffersResultDTO

genGetPromoOffersResultDTO :: Int -> Gen GetPromoOffersResultDTO
genGetPromoOffersResultDTO n =
  GetPromoOffersResultDTO
    <$> arbitraryReduced n -- getPromoOffersResultDTOOffers :: [GetPromoOfferDTO]
    <*> arbitraryReducedMaybe n -- getPromoOffersResultDTOPaging :: Maybe ForwardScrollingPagerDTO
  
instance Arbitrary GetPromoPromocodeInfoDTO where
  arbitrary = sized genGetPromoPromocodeInfoDTO

genGetPromoPromocodeInfoDTO :: Int -> Gen GetPromoPromocodeInfoDTO
genGetPromoPromocodeInfoDTO n =
  GetPromoPromocodeInfoDTO
    <$> arbitrary -- getPromoPromocodeInfoDTOPromocode :: Text
    <*> arbitrary -- getPromoPromocodeInfoDTODiscount :: Int
  
instance Arbitrary GetPromosRequest where
  arbitrary = sized genGetPromosRequest

genGetPromosRequest :: Int -> Gen GetPromosRequest
genGetPromosRequest n =
  GetPromosRequest
    <$> arbitraryReducedMaybe n -- getPromosRequestParticipation :: Maybe PromoParticipationType
    <*> arbitraryReducedMaybe n -- getPromosRequestMechanics :: Maybe MechanicsType
  
instance Arbitrary GetPromosResponse where
  arbitrary = sized genGetPromosResponse

genGetPromosResponse :: Int -> Gen GetPromosResponse
genGetPromosResponse n =
  GetPromosResponse
    <$> arbitraryReducedMaybe n -- getPromosResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getPromosResponseResult :: Maybe GetPromosResultDTO
  
instance Arbitrary GetPromosResultDTO where
  arbitrary = sized genGetPromosResultDTO

genGetPromosResultDTO :: Int -> Gen GetPromosResultDTO
genGetPromosResultDTO n =
  GetPromosResultDTO
    <$> arbitraryReduced n -- getPromosResultDTOPromos :: [GetPromoDTO]
  
instance Arbitrary GetQualityRatingDetailsResponse where
  arbitrary = sized genGetQualityRatingDetailsResponse

genGetQualityRatingDetailsResponse :: Int -> Gen GetQualityRatingDetailsResponse
genGetQualityRatingDetailsResponse n =
  GetQualityRatingDetailsResponse
    <$> arbitraryReducedMaybe n -- getQualityRatingDetailsResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getQualityRatingDetailsResponseResult :: Maybe QualityRatingDetailsDTO
  
instance Arbitrary GetQualityRatingRequest where
  arbitrary = sized genGetQualityRatingRequest

genGetQualityRatingRequest :: Int -> Gen GetQualityRatingRequest
genGetQualityRatingRequest n =
  GetQualityRatingRequest
    <$> arbitraryReducedMaybe n -- getQualityRatingRequestDateFrom :: Maybe Date
    <*> arbitraryReducedMaybe n -- getQualityRatingRequestDateTo :: Maybe Date
    <*> arbitrary -- getQualityRatingRequestCampaignIds :: [Integer]
  
instance Arbitrary GetQualityRatingResponse where
  arbitrary = sized genGetQualityRatingResponse

genGetQualityRatingResponse :: Int -> Gen GetQualityRatingResponse
genGetQualityRatingResponse n =
  GetQualityRatingResponse
    <$> arbitraryReducedMaybe n -- getQualityRatingResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getQualityRatingResponseResult :: Maybe CampaignsQualityRatingDTO
  
instance Arbitrary GetQuarantineOffersRequest where
  arbitrary = sized genGetQuarantineOffersRequest

genGetQuarantineOffersRequest :: Int -> Gen GetQuarantineOffersRequest
genGetQuarantineOffersRequest n =
  GetQuarantineOffersRequest
    <$> arbitraryReducedMaybe n -- getQuarantineOffersRequestOfferIds :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getQuarantineOffersRequestCardStatuses :: Maybe [OfferCardStatusType]
    <*> arbitraryReducedMaybe n -- getQuarantineOffersRequestCategoryIds :: Maybe [Int]
    <*> arbitraryReducedMaybe n -- getQuarantineOffersRequestVendorNames :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- getQuarantineOffersRequestTags :: Maybe [Text]
  
instance Arbitrary GetQuarantineOffersResponse where
  arbitrary = sized genGetQuarantineOffersResponse

genGetQuarantineOffersResponse :: Int -> Gen GetQuarantineOffersResponse
genGetQuarantineOffersResponse n =
  GetQuarantineOffersResponse
    <$> arbitraryReducedMaybe n -- getQuarantineOffersResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getQuarantineOffersResponseResult :: Maybe GetQuarantineOffersResultDTO
  
instance Arbitrary GetQuarantineOffersResultDTO where
  arbitrary = sized genGetQuarantineOffersResultDTO

genGetQuarantineOffersResultDTO :: Int -> Gen GetQuarantineOffersResultDTO
genGetQuarantineOffersResultDTO n =
  GetQuarantineOffersResultDTO
    <$> arbitraryReducedMaybe n -- getQuarantineOffersResultDTOPaging :: Maybe ScrollingPagerDTO
    <*> arbitraryReduced n -- getQuarantineOffersResultDTOOffers :: [QuarantineOfferDTO]
  
instance Arbitrary GetRegionWithChildrenResponse where
  arbitrary = sized genGetRegionWithChildrenResponse

genGetRegionWithChildrenResponse :: Int -> Gen GetRegionWithChildrenResponse
genGetRegionWithChildrenResponse n =
  GetRegionWithChildrenResponse
    <$> arbitraryReducedMaybe n -- getRegionWithChildrenResponsePager :: Maybe FlippingPagerDTO
    <*> arbitraryReducedMaybe n -- getRegionWithChildrenResponseRegions :: Maybe RegionDTO
  
instance Arbitrary GetRegionsResponse where
  arbitrary = sized genGetRegionsResponse

genGetRegionsResponse :: Int -> Gen GetRegionsResponse
genGetRegionsResponse n =
  GetRegionsResponse
    <$> arbitraryReduced n -- getRegionsResponseRegions :: [RegionDTO]
    <*> arbitraryReducedMaybe n -- getRegionsResponsePaging :: Maybe ForwardScrollingPagerDTO
  
instance Arbitrary GetReportInfoResponse where
  arbitrary = sized genGetReportInfoResponse

genGetReportInfoResponse :: Int -> Gen GetReportInfoResponse
genGetReportInfoResponse n =
  GetReportInfoResponse
    <$> arbitraryReducedMaybe n -- getReportInfoResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getReportInfoResponseResult :: Maybe ReportInfoDTO
  
instance Arbitrary GetReturnResponse where
  arbitrary = sized genGetReturnResponse

genGetReturnResponse :: Int -> Gen GetReturnResponse
genGetReturnResponse n =
  GetReturnResponse
    <$> arbitraryReducedMaybe n -- getReturnResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getReturnResponseResult :: Maybe ReturnDTO
  
instance Arbitrary GetReturnsResponse where
  arbitrary = sized genGetReturnsResponse

genGetReturnsResponse :: Int -> Gen GetReturnsResponse
genGetReturnsResponse n =
  GetReturnsResponse
    <$> arbitraryReducedMaybe n -- getReturnsResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getReturnsResponseResult :: Maybe PagedReturnsDTO
  
instance Arbitrary GetShipmentOrdersInfoResponse where
  arbitrary = sized genGetShipmentOrdersInfoResponse

genGetShipmentOrdersInfoResponse :: Int -> Gen GetShipmentOrdersInfoResponse
genGetShipmentOrdersInfoResponse n =
  GetShipmentOrdersInfoResponse
    <$> arbitraryReducedMaybe n -- getShipmentOrdersInfoResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getShipmentOrdersInfoResponseResult :: Maybe OrdersShipmentInfoDTO
  
instance Arbitrary GetShipmentResponse where
  arbitrary = sized genGetShipmentResponse

genGetShipmentResponse :: Int -> Gen GetShipmentResponse
genGetShipmentResponse n =
  GetShipmentResponse
    <$> arbitraryReducedMaybe n -- getShipmentResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getShipmentResponseResult :: Maybe ShipmentDTO
  
instance Arbitrary GetSuggestedOfferMappingEntriesRequest where
  arbitrary = sized genGetSuggestedOfferMappingEntriesRequest

genGetSuggestedOfferMappingEntriesRequest :: Int -> Gen GetSuggestedOfferMappingEntriesRequest
genGetSuggestedOfferMappingEntriesRequest n =
  GetSuggestedOfferMappingEntriesRequest
    <$> arbitraryReduced n -- getSuggestedOfferMappingEntriesRequestOffers :: [MappingsOfferDTO]
  
instance Arbitrary GetSuggestedOfferMappingEntriesResponse where
  arbitrary = sized genGetSuggestedOfferMappingEntriesResponse

genGetSuggestedOfferMappingEntriesResponse :: Int -> Gen GetSuggestedOfferMappingEntriesResponse
genGetSuggestedOfferMappingEntriesResponse n =
  GetSuggestedOfferMappingEntriesResponse
    <$> arbitraryReducedMaybe n -- getSuggestedOfferMappingEntriesResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getSuggestedOfferMappingEntriesResponseResult :: Maybe OfferMappingSuggestionsListDTO
  
instance Arbitrary GetSuggestedOfferMappingsRequest where
  arbitrary = sized genGetSuggestedOfferMappingsRequest

genGetSuggestedOfferMappingsRequest :: Int -> Gen GetSuggestedOfferMappingsRequest
genGetSuggestedOfferMappingsRequest n =
  GetSuggestedOfferMappingsRequest
    <$> arbitraryReducedMaybe n -- getSuggestedOfferMappingsRequestOffers :: Maybe [SuggestedOfferDTO]
  
instance Arbitrary GetSuggestedOfferMappingsResponse where
  arbitrary = sized genGetSuggestedOfferMappingsResponse

genGetSuggestedOfferMappingsResponse :: Int -> Gen GetSuggestedOfferMappingsResponse
genGetSuggestedOfferMappingsResponse n =
  GetSuggestedOfferMappingsResponse
    <$> arbitraryReducedMaybe n -- getSuggestedOfferMappingsResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getSuggestedOfferMappingsResponseResult :: Maybe GetSuggestedOfferMappingsResultDTO
  
instance Arbitrary GetSuggestedOfferMappingsResultDTO where
  arbitrary = sized genGetSuggestedOfferMappingsResultDTO

genGetSuggestedOfferMappingsResultDTO :: Int -> Gen GetSuggestedOfferMappingsResultDTO
genGetSuggestedOfferMappingsResultDTO n =
  GetSuggestedOfferMappingsResultDTO
    <$> arbitraryReduced n -- getSuggestedOfferMappingsResultDTOOffers :: [SuggestedOfferMappingDTO]
  
instance Arbitrary GetWarehouseStocksDTO where
  arbitrary = sized genGetWarehouseStocksDTO

genGetWarehouseStocksDTO :: Int -> Gen GetWarehouseStocksDTO
genGetWarehouseStocksDTO n =
  GetWarehouseStocksDTO
    <$> arbitraryReducedMaybe n -- getWarehouseStocksDTOPaging :: Maybe ScrollingPagerDTO
    <*> arbitraryReduced n -- getWarehouseStocksDTOWarehouses :: [WarehouseOffersDTO]
  
instance Arbitrary GetWarehouseStocksRequest where
  arbitrary = sized genGetWarehouseStocksRequest

genGetWarehouseStocksRequest :: Int -> Gen GetWarehouseStocksRequest
genGetWarehouseStocksRequest n =
  GetWarehouseStocksRequest
    <$> arbitraryReducedMaybe n -- getWarehouseStocksRequestWithTurnover :: Maybe Bool
    <*> arbitraryReducedMaybe n -- getWarehouseStocksRequestArchived :: Maybe Bool
    <*> arbitraryReducedMaybe n -- getWarehouseStocksRequestOfferIds :: Maybe [Text]
  
instance Arbitrary GetWarehouseStocksResponse where
  arbitrary = sized genGetWarehouseStocksResponse

genGetWarehouseStocksResponse :: Int -> Gen GetWarehouseStocksResponse
genGetWarehouseStocksResponse n =
  GetWarehouseStocksResponse
    <$> arbitraryReducedMaybe n -- getWarehouseStocksResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getWarehouseStocksResponseResult :: Maybe GetWarehouseStocksDTO
  
instance Arbitrary GetWarehousesResponse where
  arbitrary = sized genGetWarehousesResponse

genGetWarehousesResponse :: Int -> Gen GetWarehousesResponse
genGetWarehousesResponse n =
  GetWarehousesResponse
    <$> arbitraryReducedMaybe n -- getWarehousesResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- getWarehousesResponseResult :: Maybe WarehousesDTO
  
instance Arbitrary GoodsFeedbackCommentAuthorDTO where
  arbitrary = sized genGoodsFeedbackCommentAuthorDTO

genGoodsFeedbackCommentAuthorDTO :: Int -> Gen GoodsFeedbackCommentAuthorDTO
genGoodsFeedbackCommentAuthorDTO n =
  GoodsFeedbackCommentAuthorDTO
    <$> arbitraryReducedMaybe n -- goodsFeedbackCommentAuthorDTOType :: Maybe GoodsFeedbackCommentAuthorType
    <*> arbitraryReducedMaybe n -- goodsFeedbackCommentAuthorDTOName :: Maybe Text
  
instance Arbitrary GoodsFeedbackCommentDTO where
  arbitrary = sized genGoodsFeedbackCommentDTO

genGoodsFeedbackCommentDTO :: Int -> Gen GoodsFeedbackCommentDTO
genGoodsFeedbackCommentDTO n =
  GoodsFeedbackCommentDTO
    <$> arbitrary -- goodsFeedbackCommentDTOId :: Integer
    <*> arbitrary -- goodsFeedbackCommentDTOText :: Text
    <*> arbitraryReducedMaybe n -- goodsFeedbackCommentDTOCanModify :: Maybe Bool
    <*> arbitraryReducedMaybe n -- goodsFeedbackCommentDTOParentId :: Maybe Integer
    <*> arbitraryReduced n -- goodsFeedbackCommentDTOAuthor :: GoodsFeedbackCommentAuthorDTO
    <*> arbitraryReduced n -- goodsFeedbackCommentDTOStatus :: GoodsFeedbackCommentStatusType
  
instance Arbitrary GoodsFeedbackCommentListDTO where
  arbitrary = sized genGoodsFeedbackCommentListDTO

genGoodsFeedbackCommentListDTO :: Int -> Gen GoodsFeedbackCommentListDTO
genGoodsFeedbackCommentListDTO n =
  GoodsFeedbackCommentListDTO
    <$> arbitraryReduced n -- goodsFeedbackCommentListDTOComments :: [GoodsFeedbackCommentDTO]
    <*> arbitraryReducedMaybe n -- goodsFeedbackCommentListDTOPaging :: Maybe ForwardScrollingPagerDTO
  
instance Arbitrary GoodsFeedbackDTO where
  arbitrary = sized genGoodsFeedbackDTO

genGoodsFeedbackDTO :: Int -> Gen GoodsFeedbackDTO
genGoodsFeedbackDTO n =
  GoodsFeedbackDTO
    <$> arbitrary -- goodsFeedbackDTOFeedbackId :: Integer
    <*> arbitraryReduced n -- goodsFeedbackDTOCreatedAt :: DateTime
    <*> arbitrary -- goodsFeedbackDTONeedReaction :: Bool
    <*> arbitraryReduced n -- goodsFeedbackDTOIdentifiers :: GoodsFeedbackIdentifiersDTO
    <*> arbitraryReducedMaybe n -- goodsFeedbackDTOAuthor :: Maybe Text
    <*> arbitraryReducedMaybe n -- goodsFeedbackDTODescription :: Maybe GoodsFeedbackDescriptionDTO
    <*> arbitraryReducedMaybe n -- goodsFeedbackDTOMedia :: Maybe GoodsFeedbackMediaDTO
    <*> arbitraryReduced n -- goodsFeedbackDTOStatistics :: GoodsFeedbackStatisticsDTO
  
instance Arbitrary GoodsFeedbackDescriptionDTO where
  arbitrary = sized genGoodsFeedbackDescriptionDTO

genGoodsFeedbackDescriptionDTO :: Int -> Gen GoodsFeedbackDescriptionDTO
genGoodsFeedbackDescriptionDTO n =
  GoodsFeedbackDescriptionDTO
    <$> arbitraryReducedMaybe n -- goodsFeedbackDescriptionDTOAdvantages :: Maybe Text
    <*> arbitraryReducedMaybe n -- goodsFeedbackDescriptionDTODisadvantages :: Maybe Text
    <*> arbitraryReducedMaybe n -- goodsFeedbackDescriptionDTOComment :: Maybe Text
  
instance Arbitrary GoodsFeedbackIdentifiersDTO where
  arbitrary = sized genGoodsFeedbackIdentifiersDTO

genGoodsFeedbackIdentifiersDTO :: Int -> Gen GoodsFeedbackIdentifiersDTO
genGoodsFeedbackIdentifiersDTO n =
  GoodsFeedbackIdentifiersDTO
    <$> arbitrary -- goodsFeedbackIdentifiersDTOOrderId :: Integer
    <*> arbitrary -- goodsFeedbackIdentifiersDTOModelId :: Integer
  
instance Arbitrary GoodsFeedbackListDTO where
  arbitrary = sized genGoodsFeedbackListDTO

genGoodsFeedbackListDTO :: Int -> Gen GoodsFeedbackListDTO
genGoodsFeedbackListDTO n =
  GoodsFeedbackListDTO
    <$> arbitraryReduced n -- goodsFeedbackListDTOFeedbacks :: [GoodsFeedbackDTO]
    <*> arbitraryReducedMaybe n -- goodsFeedbackListDTOPaging :: Maybe ForwardScrollingPagerDTO
  
instance Arbitrary GoodsFeedbackMediaDTO where
  arbitrary = sized genGoodsFeedbackMediaDTO

genGoodsFeedbackMediaDTO :: Int -> Gen GoodsFeedbackMediaDTO
genGoodsFeedbackMediaDTO n =
  GoodsFeedbackMediaDTO
    <$> arbitraryReducedMaybe n -- goodsFeedbackMediaDTOPhotos :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- goodsFeedbackMediaDTOVideos :: Maybe [Text]
  
instance Arbitrary GoodsFeedbackStatisticsDTO where
  arbitrary = sized genGoodsFeedbackStatisticsDTO

genGoodsFeedbackStatisticsDTO :: Int -> Gen GoodsFeedbackStatisticsDTO
genGoodsFeedbackStatisticsDTO n =
  GoodsFeedbackStatisticsDTO
    <$> arbitrary -- goodsFeedbackStatisticsDTORating :: Int
    <*> arbitrary -- goodsFeedbackStatisticsDTOCommentsCount :: Integer
    <*> arbitraryReducedMaybe n -- goodsFeedbackStatisticsDTORecommended :: Maybe Bool
    <*> arbitraryReducedMaybe n -- goodsFeedbackStatisticsDTOPaidAmount :: Maybe Integer
  
instance Arbitrary GoodsStatsDTO where
  arbitrary = sized genGoodsStatsDTO

genGoodsStatsDTO :: Int -> Gen GoodsStatsDTO
genGoodsStatsDTO n =
  GoodsStatsDTO
    <$> arbitraryReduced n -- goodsStatsDTOShopSkus :: [GoodsStatsGoodsDTO]
  
instance Arbitrary GoodsStatsGoodsDTO where
  arbitrary = sized genGoodsStatsGoodsDTO

genGoodsStatsGoodsDTO :: Int -> Gen GoodsStatsGoodsDTO
genGoodsStatsGoodsDTO n =
  GoodsStatsGoodsDTO
    <$> arbitraryReducedMaybe n -- goodsStatsGoodsDTOShopSku :: Maybe Text
    <*> arbitraryReducedMaybe n -- goodsStatsGoodsDTOMarketSku :: Maybe Integer
    <*> arbitraryReducedMaybe n -- goodsStatsGoodsDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- goodsStatsGoodsDTOPrice :: Maybe Double
    <*> arbitraryReducedMaybe n -- goodsStatsGoodsDTOCategoryId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- goodsStatsGoodsDTOCategoryName :: Maybe Text
    <*> arbitraryReducedMaybe n -- goodsStatsGoodsDTOWeightDimensions :: Maybe GoodsStatsWeightDimensionsDTO
    <*> arbitraryReducedMaybe n -- goodsStatsGoodsDTOWarehouses :: Maybe [GoodsStatsWarehouseDTO]
    <*> arbitraryReducedMaybe n -- goodsStatsGoodsDTOTariffs :: Maybe [TariffDTO]
    <*> arbitraryReducedMaybe n -- goodsStatsGoodsDTOPictures :: Maybe [Text]
  
instance Arbitrary GoodsStatsWarehouseDTO where
  arbitrary = sized genGoodsStatsWarehouseDTO

genGoodsStatsWarehouseDTO :: Int -> Gen GoodsStatsWarehouseDTO
genGoodsStatsWarehouseDTO n =
  GoodsStatsWarehouseDTO
    <$> arbitraryReducedMaybe n -- goodsStatsWarehouseDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- goodsStatsWarehouseDTOName :: Maybe Text
    <*> arbitraryReduced n -- goodsStatsWarehouseDTOStocks :: [WarehouseStockDTO]
  
instance Arbitrary GoodsStatsWeightDimensionsDTO where
  arbitrary = sized genGoodsStatsWeightDimensionsDTO

genGoodsStatsWeightDimensionsDTO :: Int -> Gen GoodsStatsWeightDimensionsDTO
genGoodsStatsWeightDimensionsDTO n =
  GoodsStatsWeightDimensionsDTO
    <$> arbitraryReducedMaybe n -- goodsStatsWeightDimensionsDTOLength :: Maybe Double
    <*> arbitraryReducedMaybe n -- goodsStatsWeightDimensionsDTOWidth :: Maybe Double
    <*> arbitraryReducedMaybe n -- goodsStatsWeightDimensionsDTOHeight :: Maybe Double
    <*> arbitraryReducedMaybe n -- goodsStatsWeightDimensionsDTOWeight :: Maybe Double
  
instance Arbitrary GpsDTO where
  arbitrary = sized genGpsDTO

genGpsDTO :: Int -> Gen GpsDTO
genGpsDTO n =
  GpsDTO
    <$> arbitrary -- gpsDTOLatitude :: Double
    <*> arbitrary -- gpsDTOLongitude :: Double
  
instance Arbitrary HiddenOfferDTO where
  arbitrary = sized genHiddenOfferDTO

genHiddenOfferDTO :: Int -> Gen HiddenOfferDTO
genHiddenOfferDTO n =
  HiddenOfferDTO
    <$> arbitrary -- hiddenOfferDTOOfferId :: Text
  
instance Arbitrary LogisticPickupPointDTO where
  arbitrary = sized genLogisticPickupPointDTO

genLogisticPickupPointDTO :: Int -> Gen LogisticPickupPointDTO
genLogisticPickupPointDTO n =
  LogisticPickupPointDTO
    <$> arbitraryReducedMaybe n -- logisticPickupPointDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- logisticPickupPointDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- logisticPickupPointDTOAddress :: Maybe PickupAddressDTO
    <*> arbitraryReducedMaybe n -- logisticPickupPointDTOInstruction :: Maybe Text
    <*> arbitraryReducedMaybe n -- logisticPickupPointDTOType :: Maybe LogisticPointType
    <*> arbitraryReducedMaybe n -- logisticPickupPointDTOLogisticPartnerId :: Maybe Integer
  
instance Arbitrary MappingsOfferDTO where
  arbitrary = sized genMappingsOfferDTO

genMappingsOfferDTO :: Int -> Gen MappingsOfferDTO
genMappingsOfferDTO n =
  MappingsOfferDTO
    <$> arbitraryReducedMaybe n -- mappingsOfferDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOShopSku :: Maybe Text
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOVendor :: Maybe Text
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOVendorCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- mappingsOfferDTODescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOId :: Maybe Text
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOFeedId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOBarcodes :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOUrls :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOPictures :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOManufacturer :: Maybe Text
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOManufacturerCountries :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOMinShipment :: Maybe Int
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOTransportUnitSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOQuantumOfSupply :: Maybe Int
    <*> arbitraryReducedMaybe n -- mappingsOfferDTODeliveryDurationDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOBoxCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOCustomsCommodityCodes :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOWeightDimensions :: Maybe OfferWeightDimensionsDTO
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOSupplyScheduleDays :: Maybe [DayOfWeekType]
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOShelfLifeDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOLifeTimeDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOGuaranteePeriodDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOProcessingState :: Maybe OfferProcessingStateDTO
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOAvailability :: Maybe OfferAvailabilityStatusType
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOShelfLife :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOLifeTime :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOGuaranteePeriod :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOCertificate :: Maybe Text
    <*> arbitraryReducedMaybe n -- mappingsOfferDTOPrice :: Maybe Double
  
instance Arbitrary MappingsOfferInfoDTO where
  arbitrary = sized genMappingsOfferInfoDTO

genMappingsOfferInfoDTO :: Int -> Gen MappingsOfferInfoDTO
genMappingsOfferInfoDTO n =
  MappingsOfferInfoDTO
    <$> arbitraryReducedMaybe n -- mappingsOfferInfoDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOShopSku :: Maybe Text
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOVendor :: Maybe Text
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOVendorCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTODescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOId :: Maybe Text
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOFeedId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOBarcodes :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOUrls :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOPictures :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOManufacturer :: Maybe Text
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOManufacturerCountries :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOMinShipment :: Maybe Int
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOTransportUnitSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOQuantumOfSupply :: Maybe Int
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTODeliveryDurationDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOBoxCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOCustomsCommodityCodes :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOWeightDimensions :: Maybe OfferWeightDimensionsDTO
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOSupplyScheduleDays :: Maybe [DayOfWeekType]
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOShelfLifeDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOLifeTimeDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOGuaranteePeriodDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOProcessingState :: Maybe OfferProcessingStateDTO
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOAvailability :: Maybe OfferAvailabilityStatusType
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOShelfLife :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOLifeTime :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOGuaranteePeriod :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- mappingsOfferInfoDTOCertificate :: Maybe Text
  
instance Arbitrary MaxSaleQuantumDTO where
  arbitrary = sized genMaxSaleQuantumDTO

genMaxSaleQuantumDTO :: Int -> Gen MaxSaleQuantumDTO
genMaxSaleQuantumDTO n =
  MaxSaleQuantumDTO
    <$> arbitrary -- maxSaleQuantumDTOId :: Integer
    <*> arbitraryReducedMaybe n -- maxSaleQuantumDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- maxSaleQuantumDTOMaxSaleQuantum :: Maybe Int
  
instance Arbitrary ModelDTO where
  arbitrary = sized genModelDTO

genModelDTO :: Int -> Gen ModelDTO
genModelDTO n =
  ModelDTO
    <$> arbitraryReducedMaybe n -- modelDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- modelDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- modelDTOPrices :: Maybe ModelPriceDTO
  
instance Arbitrary ModelOfferDTO where
  arbitrary = sized genModelOfferDTO

genModelOfferDTO :: Int -> Gen ModelOfferDTO
genModelOfferDTO n =
  ModelOfferDTO
    <$> arbitraryReducedMaybe n -- modelOfferDTODiscount :: Maybe Int
    <*> arbitraryReducedMaybe n -- modelOfferDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- modelOfferDTOPos :: Maybe Int
    <*> arbitraryReducedMaybe n -- modelOfferDTOPreDiscountPrice :: Maybe Double
    <*> arbitraryReducedMaybe n -- modelOfferDTOPrice :: Maybe Double
    <*> arbitraryReducedMaybe n -- modelOfferDTORegionId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- modelOfferDTOShippingCost :: Maybe Double
    <*> arbitraryReducedMaybe n -- modelOfferDTOShopName :: Maybe Text
    <*> arbitraryReducedMaybe n -- modelOfferDTOShopRating :: Maybe Int
    <*> arbitraryReducedMaybe n -- modelOfferDTOInStock :: Maybe Int
  
instance Arbitrary ModelPriceDTO where
  arbitrary = sized genModelPriceDTO

genModelPriceDTO :: Int -> Gen ModelPriceDTO
genModelPriceDTO n =
  ModelPriceDTO
    <$> arbitraryReducedMaybe n -- modelPriceDTOAvg :: Maybe Double
    <*> arbitraryReducedMaybe n -- modelPriceDTOMax :: Maybe Double
    <*> arbitraryReducedMaybe n -- modelPriceDTOMin :: Maybe Double
  
instance Arbitrary ModelsDTO where
  arbitrary = sized genModelsDTO

genModelsDTO :: Int -> Gen ModelsDTO
genModelsDTO n =
  ModelsDTO
    <$> arbitraryReduced n -- modelsDTOModels :: [ModelDTO]
  
instance Arbitrary OfferCampaignStatusDTO where
  arbitrary = sized genOfferCampaignStatusDTO

genOfferCampaignStatusDTO :: Int -> Gen OfferCampaignStatusDTO
genOfferCampaignStatusDTO n =
  OfferCampaignStatusDTO
    <$> arbitrary -- offerCampaignStatusDTOCampaignId :: Integer
    <*> arbitraryReduced n -- offerCampaignStatusDTOStatus :: OfferCampaignStatusType
  
instance Arbitrary OfferCardDTO where
  arbitrary = sized genOfferCardDTO

genOfferCardDTO :: Int -> Gen OfferCardDTO
genOfferCardDTO n =
  OfferCardDTO
    <$> arbitrary -- offerCardDTOOfferId :: Text
    <*> arbitraryReducedMaybe n -- offerCardDTOMapping :: Maybe GetMappingDTO
    <*> arbitraryReducedMaybe n -- offerCardDTOParameterValues :: Maybe [ParameterValueDTO]
    <*> arbitraryReducedMaybe n -- offerCardDTOCardStatus :: Maybe OfferCardStatusType
    <*> arbitraryReducedMaybe n -- offerCardDTOContentRating :: Maybe Int
    <*> arbitraryReducedMaybe n -- offerCardDTORecommendations :: Maybe [OfferCardRecommendationDTO]
    <*> arbitraryReducedMaybe n -- offerCardDTOErrors :: Maybe [OfferErrorDTO]
    <*> arbitraryReducedMaybe n -- offerCardDTOWarnings :: Maybe [OfferErrorDTO]
  
instance Arbitrary OfferCardRecommendationDTO where
  arbitrary = sized genOfferCardRecommendationDTO

genOfferCardRecommendationDTO :: Int -> Gen OfferCardRecommendationDTO
genOfferCardRecommendationDTO n =
  OfferCardRecommendationDTO
    <$> arbitraryReduced n -- offerCardRecommendationDTOType :: OfferCardRecommendationType
    <*> arbitraryReducedMaybe n -- offerCardRecommendationDTOPercent :: Maybe Int
  
instance Arbitrary OfferCardsContentStatusDTO where
  arbitrary = sized genOfferCardsContentStatusDTO

genOfferCardsContentStatusDTO :: Int -> Gen OfferCardsContentStatusDTO
genOfferCardsContentStatusDTO n =
  OfferCardsContentStatusDTO
    <$> arbitraryReduced n -- offerCardsContentStatusDTOOfferCards :: [OfferCardDTO]
    <*> arbitraryReducedMaybe n -- offerCardsContentStatusDTOPaging :: Maybe ForwardScrollingPagerDTO
  
instance Arbitrary OfferConditionDTO where
  arbitrary = sized genOfferConditionDTO

genOfferConditionDTO :: Int -> Gen OfferConditionDTO
genOfferConditionDTO n =
  OfferConditionDTO
    <$> arbitraryReducedMaybe n -- offerConditionDTOType :: Maybe OfferConditionType
    <*> arbitraryReducedMaybe n -- offerConditionDTOQuality :: Maybe OfferConditionQualityType
    <*> arbitraryReducedMaybe n -- offerConditionDTOReason :: Maybe Text
  
instance Arbitrary OfferContentDTO where
  arbitrary = sized genOfferContentDTO

genOfferContentDTO :: Int -> Gen OfferContentDTO
genOfferContentDTO n =
  OfferContentDTO
    <$> arbitrary -- offerContentDTOOfferId :: Text
    <*> arbitrary -- offerContentDTOCategoryId :: Int
    <*> arbitraryReduced n -- offerContentDTOParameterValues :: [ParameterValueDTO]
  
instance Arbitrary OfferContentErrorDTO where
  arbitrary = sized genOfferContentErrorDTO

genOfferContentErrorDTO :: Int -> Gen OfferContentErrorDTO
genOfferContentErrorDTO n =
  OfferContentErrorDTO
    <$> arbitraryReduced n -- offerContentErrorDTOType :: OfferContentErrorType
    <*> arbitraryReducedMaybe n -- offerContentErrorDTOParameterId :: Maybe Integer
    <*> arbitrary -- offerContentErrorDTOMessage :: Text
  
instance Arbitrary OfferDTO where
  arbitrary = sized genOfferDTO

genOfferDTO :: Int -> Gen OfferDTO
genOfferDTO n =
  OfferDTO
    <$> arbitraryReducedMaybe n -- offerDTOPrice :: Maybe Double
    <*> arbitraryReducedMaybe n -- offerDTOFeedId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- offerDTOId :: Maybe Text
    <*> arbitraryReducedMaybe n -- offerDTOShopCategoryId :: Maybe Text
    <*> arbitraryReducedMaybe n -- offerDTOMarketCategoryId :: Maybe Int
    <*> arbitraryReducedMaybe n -- offerDTOPreDiscountPrice :: Maybe Double
    <*> arbitraryReducedMaybe n -- offerDTODiscount :: Maybe Int
    <*> arbitraryReducedMaybe n -- offerDTOCutPrice :: Maybe Bool
    <*> arbitraryReducedMaybe n -- offerDTOUrl :: Maybe Text
    <*> arbitrary -- offerDTOModelId :: Integer
    <*> arbitraryReducedMaybe n -- offerDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- offerDTOCurrency :: Maybe CurrencyType
    <*> arbitraryReducedMaybe n -- offerDTOBid :: Maybe Double
    <*> arbitraryReducedMaybe n -- offerDTOCbid :: Maybe Double
    <*> arbitraryReducedMaybe n -- offerDTOFee :: Maybe Double
    <*> arbitraryReducedMaybe n -- offerDTOBlocked :: Maybe Bool
  
instance Arbitrary OfferErrorDTO where
  arbitrary = sized genOfferErrorDTO

genOfferErrorDTO :: Int -> Gen OfferErrorDTO
genOfferErrorDTO n =
  OfferErrorDTO
    <$> arbitraryReducedMaybe n -- offerErrorDTOMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- offerErrorDTOComment :: Maybe Text
  
instance Arbitrary OfferForRecommendationDTO where
  arbitrary = sized genOfferForRecommendationDTO

genOfferForRecommendationDTO :: Int -> Gen OfferForRecommendationDTO
genOfferForRecommendationDTO n =
  OfferForRecommendationDTO
    <$> arbitraryReducedMaybe n -- offerForRecommendationDTOOfferId :: Maybe Text
    <*> arbitraryReducedMaybe n -- offerForRecommendationDTOPrice :: Maybe BasePriceDTO
    <*> arbitraryReducedMaybe n -- offerForRecommendationDTOCofinancePrice :: Maybe GetPriceDTO
    <*> arbitraryReducedMaybe n -- offerForRecommendationDTOCompetitiveness :: Maybe PriceCompetitivenessType
    <*> arbitraryReducedMaybe n -- offerForRecommendationDTOShows :: Maybe Integer
  
instance Arbitrary OfferManualDTO where
  arbitrary = sized genOfferManualDTO

genOfferManualDTO :: Int -> Gen OfferManualDTO
genOfferManualDTO n =
  OfferManualDTO
    <$> arbitrary -- offerManualDTOUrl :: Text
    <*> arbitraryReducedMaybe n -- offerManualDTOTitle :: Maybe Text
  
instance Arbitrary OfferMappingDTO where
  arbitrary = sized genOfferMappingDTO

genOfferMappingDTO :: Int -> Gen OfferMappingDTO
genOfferMappingDTO n =
  OfferMappingDTO
    <$> arbitraryReducedMaybe n -- offerMappingDTOMarketSku :: Maybe Integer
    <*> arbitraryReducedMaybe n -- offerMappingDTOModelId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- offerMappingDTOCategoryId :: Maybe Integer
  
instance Arbitrary OfferMappingEntriesDTO where
  arbitrary = sized genOfferMappingEntriesDTO

genOfferMappingEntriesDTO :: Int -> Gen OfferMappingEntriesDTO
genOfferMappingEntriesDTO n =
  OfferMappingEntriesDTO
    <$> arbitraryReducedMaybe n -- offerMappingEntriesDTOPaging :: Maybe ScrollingPagerDTO
    <*> arbitraryReduced n -- offerMappingEntriesDTOOfferMappingEntries :: [OfferMappingEntryDTO]
  
instance Arbitrary OfferMappingEntryDTO where
  arbitrary = sized genOfferMappingEntryDTO

genOfferMappingEntryDTO :: Int -> Gen OfferMappingEntryDTO
genOfferMappingEntryDTO n =
  OfferMappingEntryDTO
    <$> arbitraryReducedMaybe n -- offerMappingEntryDTOMapping :: Maybe OfferMappingDTO
    <*> arbitraryReducedMaybe n -- offerMappingEntryDTOAwaitingModerationMapping :: Maybe OfferMappingDTO
    <*> arbitraryReducedMaybe n -- offerMappingEntryDTORejectedMapping :: Maybe OfferMappingDTO
    <*> arbitraryReducedMaybe n -- offerMappingEntryDTOOffer :: Maybe MappingsOfferDTO
  
instance Arbitrary OfferMappingErrorDTO where
  arbitrary = sized genOfferMappingErrorDTO

genOfferMappingErrorDTO :: Int -> Gen OfferMappingErrorDTO
genOfferMappingErrorDTO n =
  OfferMappingErrorDTO
    <$> arbitraryReduced n -- offerMappingErrorDTOType :: OfferMappingErrorType
    <*> arbitraryReducedMaybe n -- offerMappingErrorDTOParameterId :: Maybe Integer
    <*> arbitrary -- offerMappingErrorDTOMessage :: Text
  
instance Arbitrary OfferMappingInfoDTO where
  arbitrary = sized genOfferMappingInfoDTO

genOfferMappingInfoDTO :: Int -> Gen OfferMappingInfoDTO
genOfferMappingInfoDTO n =
  OfferMappingInfoDTO
    <$> arbitraryReducedMaybe n -- offerMappingInfoDTOMapping :: Maybe OfferMappingDTO
    <*> arbitraryReducedMaybe n -- offerMappingInfoDTOAwaitingModerationMapping :: Maybe OfferMappingDTO
    <*> arbitraryReducedMaybe n -- offerMappingInfoDTORejectedMapping :: Maybe OfferMappingDTO
  
instance Arbitrary OfferMappingSuggestionsListDTO where
  arbitrary = sized genOfferMappingSuggestionsListDTO

genOfferMappingSuggestionsListDTO :: Int -> Gen OfferMappingSuggestionsListDTO
genOfferMappingSuggestionsListDTO n =
  OfferMappingSuggestionsListDTO
    <$> arbitraryReduced n -- offerMappingSuggestionsListDTOOffers :: [EnrichedMappingsOfferDTO]
  
instance Arbitrary OfferParamDTO where
  arbitrary = sized genOfferParamDTO

genOfferParamDTO :: Int -> Gen OfferParamDTO
genOfferParamDTO n =
  OfferParamDTO
    <$> arbitrary -- offerParamDTOName :: Text
    <*> arbitrary -- offerParamDTOValue :: Text
  
instance Arbitrary OfferPriceByOfferIdsListResponseDTO where
  arbitrary = sized genOfferPriceByOfferIdsListResponseDTO

genOfferPriceByOfferIdsListResponseDTO :: Int -> Gen OfferPriceByOfferIdsListResponseDTO
genOfferPriceByOfferIdsListResponseDTO n =
  OfferPriceByOfferIdsListResponseDTO
    <$> arbitraryReduced n -- offerPriceByOfferIdsListResponseDTOOffers :: [OfferPriceByOfferIdsResponseDTO]
    <*> arbitraryReducedMaybe n -- offerPriceByOfferIdsListResponseDTOPaging :: Maybe ScrollingPagerDTO
  
instance Arbitrary OfferPriceByOfferIdsResponseDTO where
  arbitrary = sized genOfferPriceByOfferIdsResponseDTO

genOfferPriceByOfferIdsResponseDTO :: Int -> Gen OfferPriceByOfferIdsResponseDTO
genOfferPriceByOfferIdsResponseDTO n =
  OfferPriceByOfferIdsResponseDTO
    <$> arbitraryReducedMaybe n -- offerPriceByOfferIdsResponseDTOOfferId :: Maybe Text
    <*> arbitraryReducedMaybe n -- offerPriceByOfferIdsResponseDTOPrice :: Maybe PriceDTO
    <*> arbitraryReducedMaybe n -- offerPriceByOfferIdsResponseDTOUpdatedAt :: Maybe DateTime
  
instance Arbitrary OfferPriceDTO where
  arbitrary = sized genOfferPriceDTO

genOfferPriceDTO :: Int -> Gen OfferPriceDTO
genOfferPriceDTO n =
  OfferPriceDTO
    <$> arbitraryReducedMaybe n -- offerPriceDTOOfferId :: Maybe Text
    <*> arbitraryReducedMaybe n -- offerPriceDTOPrice :: Maybe PriceDTO
  
instance Arbitrary OfferPriceListResponseDTO where
  arbitrary = sized genOfferPriceListResponseDTO

genOfferPriceListResponseDTO :: Int -> Gen OfferPriceListResponseDTO
genOfferPriceListResponseDTO n =
  OfferPriceListResponseDTO
    <$> arbitraryReduced n -- offerPriceListResponseDTOOffers :: [OfferPriceResponseDTO]
    <*> arbitraryReducedMaybe n -- offerPriceListResponseDTOPaging :: Maybe ScrollingPagerDTO
    <*> arbitraryReducedMaybe n -- offerPriceListResponseDTOTotal :: Maybe Int
  
instance Arbitrary OfferPriceResponseDTO where
  arbitrary = sized genOfferPriceResponseDTO

genOfferPriceResponseDTO :: Int -> Gen OfferPriceResponseDTO
genOfferPriceResponseDTO n =
  OfferPriceResponseDTO
    <$> arbitraryReducedMaybe n -- offerPriceResponseDTOId :: Maybe Text
    <*> arbitraryReducedMaybe n -- offerPriceResponseDTOPrice :: Maybe PriceDTO
    <*> arbitraryReducedMaybe n -- offerPriceResponseDTOMarketSku :: Maybe Integer
    <*> arbitraryReducedMaybe n -- offerPriceResponseDTOUpdatedAt :: Maybe DateTime
  
instance Arbitrary OfferProcessingNoteDTO where
  arbitrary = sized genOfferProcessingNoteDTO

genOfferProcessingNoteDTO :: Int -> Gen OfferProcessingNoteDTO
genOfferProcessingNoteDTO n =
  OfferProcessingNoteDTO
    <$> arbitraryReducedMaybe n -- offerProcessingNoteDTOType :: Maybe OfferProcessingNoteType
    <*> arbitraryReducedMaybe n -- offerProcessingNoteDTOPayload :: Maybe Text
  
instance Arbitrary OfferProcessingStateDTO where
  arbitrary = sized genOfferProcessingStateDTO

genOfferProcessingStateDTO :: Int -> Gen OfferProcessingStateDTO
genOfferProcessingStateDTO n =
  OfferProcessingStateDTO
    <$> arbitraryReducedMaybe n -- offerProcessingStateDTOStatus :: Maybe OfferProcessingStatusType
    <*> arbitraryReducedMaybe n -- offerProcessingStateDTONotes :: Maybe [OfferProcessingNoteDTO]
  
instance Arbitrary OfferRecommendationDTO where
  arbitrary = sized genOfferRecommendationDTO

genOfferRecommendationDTO :: Int -> Gen OfferRecommendationDTO
genOfferRecommendationDTO n =
  OfferRecommendationDTO
    <$> arbitraryReducedMaybe n -- offerRecommendationDTOOffer :: Maybe OfferForRecommendationDTO
    <*> arbitraryReducedMaybe n -- offerRecommendationDTORecommendation :: Maybe OfferRecommendationInfoDTO
  
instance Arbitrary OfferRecommendationInfoDTO where
  arbitrary = sized genOfferRecommendationInfoDTO

genOfferRecommendationInfoDTO :: Int -> Gen OfferRecommendationInfoDTO
genOfferRecommendationInfoDTO n =
  OfferRecommendationInfoDTO
    <$> arbitraryReducedMaybe n -- offerRecommendationInfoDTOOfferId :: Maybe Text
    <*> arbitraryReducedMaybe n -- offerRecommendationInfoDTORecommendedCofinancePrice :: Maybe BasePriceDTO
    <*> arbitraryReducedMaybe n -- offerRecommendationInfoDTOCompetitivenessThresholds :: Maybe PriceCompetitivenessThresholdsDTO
  
instance Arbitrary OfferRecommendationsResultDTO where
  arbitrary = sized genOfferRecommendationsResultDTO

genOfferRecommendationsResultDTO :: Int -> Gen OfferRecommendationsResultDTO
genOfferRecommendationsResultDTO n =
  OfferRecommendationsResultDTO
    <$> arbitraryReducedMaybe n -- offerRecommendationsResultDTOPaging :: Maybe ScrollingPagerDTO
    <*> arbitraryReduced n -- offerRecommendationsResultDTOOfferRecommendations :: [OfferRecommendationDTO]
  
instance Arbitrary OfferSellingProgramDTO where
  arbitrary = sized genOfferSellingProgramDTO

genOfferSellingProgramDTO :: Int -> Gen OfferSellingProgramDTO
genOfferSellingProgramDTO n =
  OfferSellingProgramDTO
    <$> arbitraryReduced n -- offerSellingProgramDTOSellingProgram :: SellingProgramType
    <*> arbitraryReduced n -- offerSellingProgramDTOStatus :: OfferSellingProgramStatusType
  
instance Arbitrary OfferWeightDimensionsDTO where
  arbitrary = sized genOfferWeightDimensionsDTO

genOfferWeightDimensionsDTO :: Int -> Gen OfferWeightDimensionsDTO
genOfferWeightDimensionsDTO n =
  OfferWeightDimensionsDTO
    <$> arbitrary -- offerWeightDimensionsDTOLength :: Double
    <*> arbitrary -- offerWeightDimensionsDTOWidth :: Double
    <*> arbitrary -- offerWeightDimensionsDTOHeight :: Double
    <*> arbitrary -- offerWeightDimensionsDTOWeight :: Double
  
instance Arbitrary OffersDTO where
  arbitrary = sized genOffersDTO

genOffersDTO :: Int -> Gen OffersDTO
genOffersDTO n =
  OffersDTO
    <$> arbitraryReduced n -- offersDTOOffers :: [OfferDTO]
  
instance Arbitrary OptionValuesLimitedDTO where
  arbitrary = sized genOptionValuesLimitedDTO

genOptionValuesLimitedDTO :: Int -> Gen OptionValuesLimitedDTO
genOptionValuesLimitedDTO n =
  OptionValuesLimitedDTO
    <$> arbitrary -- optionValuesLimitedDTOLimitingOptionValueId :: Integer
    <*> arbitrary -- optionValuesLimitedDTOOptionValueIds :: [Integer]
  
instance Arbitrary OrderBoxLayoutDTO where
  arbitrary = sized genOrderBoxLayoutDTO

genOrderBoxLayoutDTO :: Int -> Gen OrderBoxLayoutDTO
genOrderBoxLayoutDTO n =
  OrderBoxLayoutDTO
    <$> arbitraryReduced n -- orderBoxLayoutDTOItems :: [OrderBoxLayoutItemDTO]
  
instance Arbitrary OrderBoxLayoutItemDTO where
  arbitrary = sized genOrderBoxLayoutItemDTO

genOrderBoxLayoutItemDTO :: Int -> Gen OrderBoxLayoutItemDTO
genOrderBoxLayoutItemDTO n =
  OrderBoxLayoutItemDTO
    <$> arbitrary -- orderBoxLayoutItemDTOId :: Integer
    <*> arbitraryReducedMaybe n -- orderBoxLayoutItemDTOFullCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- orderBoxLayoutItemDTOPartialCount :: Maybe OrderBoxLayoutPartialCountDTO
    <*> arbitraryReducedMaybe n -- orderBoxLayoutItemDTOInstances :: Maybe [BriefOrderItemInstanceDTO]
  
instance Arbitrary OrderBoxLayoutPartialCountDTO where
  arbitrary = sized genOrderBoxLayoutPartialCountDTO

genOrderBoxLayoutPartialCountDTO :: Int -> Gen OrderBoxLayoutPartialCountDTO
genOrderBoxLayoutPartialCountDTO n =
  OrderBoxLayoutPartialCountDTO
    <$> arbitrary -- orderBoxLayoutPartialCountDTOCurrent :: Int
    <*> arbitrary -- orderBoxLayoutPartialCountDTOTotal :: Int
  
instance Arbitrary OrderBoxesLayoutDTO where
  arbitrary = sized genOrderBoxesLayoutDTO

genOrderBoxesLayoutDTO :: Int -> Gen OrderBoxesLayoutDTO
genOrderBoxesLayoutDTO n =
  OrderBoxesLayoutDTO
    <$> arbitraryReduced n -- orderBoxesLayoutDTOBoxes :: [EnrichedOrderBoxLayoutDTO]
  
instance Arbitrary OrderBusinessBuyerDTO where
  arbitrary = sized genOrderBusinessBuyerDTO

genOrderBusinessBuyerDTO :: Int -> Gen OrderBusinessBuyerDTO
genOrderBusinessBuyerDTO n =
  OrderBusinessBuyerDTO
    <$> arbitraryReducedMaybe n -- orderBusinessBuyerDTOInn :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderBusinessBuyerDTOKpp :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderBusinessBuyerDTOOrganizationName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderBusinessBuyerDTOOrganizationJurAddress :: Maybe Text
  
instance Arbitrary OrderBusinessDocumentsDTO where
  arbitrary = sized genOrderBusinessDocumentsDTO

genOrderBusinessDocumentsDTO :: Int -> Gen OrderBusinessDocumentsDTO
genOrderBusinessDocumentsDTO n =
  OrderBusinessDocumentsDTO
    <$> arbitraryReducedMaybe n -- orderBusinessDocumentsDTOUpd :: Maybe DocumentDTO
    <*> arbitraryReducedMaybe n -- orderBusinessDocumentsDTOUkd :: Maybe DocumentDTO
    <*> arbitraryReducedMaybe n -- orderBusinessDocumentsDTOTorgTwelve :: Maybe DocumentDTO
    <*> arbitraryReducedMaybe n -- orderBusinessDocumentsDTOSf :: Maybe DocumentDTO
    <*> arbitraryReducedMaybe n -- orderBusinessDocumentsDTOKsf :: Maybe DocumentDTO
  
instance Arbitrary OrderBuyerBasicInfoDTO where
  arbitrary = sized genOrderBuyerBasicInfoDTO

genOrderBuyerBasicInfoDTO :: Int -> Gen OrderBuyerBasicInfoDTO
genOrderBuyerBasicInfoDTO n =
  OrderBuyerBasicInfoDTO
    <$> arbitraryReducedMaybe n -- orderBuyerBasicInfoDTOId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderBuyerBasicInfoDTOLastName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderBuyerBasicInfoDTOFirstName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderBuyerBasicInfoDTOMiddleName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderBuyerBasicInfoDTOType :: Maybe OrderBuyerType
  
instance Arbitrary OrderBuyerDTO where
  arbitrary = sized genOrderBuyerDTO

genOrderBuyerDTO :: Int -> Gen OrderBuyerDTO
genOrderBuyerDTO n =
  OrderBuyerDTO
    <$> arbitraryReducedMaybe n -- orderBuyerDTOId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderBuyerDTOLastName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderBuyerDTOFirstName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderBuyerDTOMiddleName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderBuyerDTOType :: Maybe OrderBuyerType
  
instance Arbitrary OrderBuyerInfoDTO where
  arbitrary = sized genOrderBuyerInfoDTO

genOrderBuyerInfoDTO :: Int -> Gen OrderBuyerInfoDTO
genOrderBuyerInfoDTO n =
  OrderBuyerInfoDTO
    <$> arbitraryReducedMaybe n -- orderBuyerInfoDTOId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderBuyerInfoDTOLastName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderBuyerInfoDTOFirstName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderBuyerInfoDTOMiddleName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderBuyerInfoDTOType :: Maybe OrderBuyerType
    <*> arbitraryReducedMaybe n -- orderBuyerInfoDTOPhone :: Maybe Text
  
instance Arbitrary OrderCourierDTO where
  arbitrary = sized genOrderCourierDTO

genOrderCourierDTO :: Int -> Gen OrderCourierDTO
genOrderCourierDTO n =
  OrderCourierDTO
    <$> arbitraryReducedMaybe n -- orderCourierDTOFullName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderCourierDTOPhone :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderCourierDTOPhoneExtension :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderCourierDTOVehicleNumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderCourierDTOVehicleDescription :: Maybe Text
  
instance Arbitrary OrderDTO where
  arbitrary = sized genOrderDTO

genOrderDTO :: Int -> Gen OrderDTO
genOrderDTO n =
  OrderDTO
    <$> arbitraryReducedMaybe n -- orderDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- orderDTOStatus :: Maybe OrderStatusType
    <*> arbitraryReducedMaybe n -- orderDTOSubstatus :: Maybe OrderSubstatusType
    <*> arbitraryReducedMaybe n -- orderDTOCreationDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDTOUpdatedAt :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDTOCurrency :: Maybe CurrencyType
    <*> arbitraryReducedMaybe n -- orderDTOItemsTotal :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderDTODeliveryTotal :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderDTOBuyerItemsTotal :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderDTOBuyerTotal :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderDTOBuyerItemsTotalBeforeDiscount :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderDTOBuyerTotalBeforeDiscount :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderDTOPaymentType :: Maybe OrderPaymentType
    <*> arbitraryReducedMaybe n -- orderDTOPaymentMethod :: Maybe OrderPaymentMethodType
    <*> arbitraryReducedMaybe n -- orderDTOFake :: Maybe Bool
    <*> arbitraryReduced n -- orderDTOItems :: [OrderItemDTO]
    <*> arbitraryReducedMaybe n -- orderDTOSubsidies :: Maybe [OrderSubsidyDTO]
    <*> arbitraryReducedMaybe n -- orderDTODelivery :: Maybe OrderDeliveryDTO
    <*> arbitraryReducedMaybe n -- orderDTOBuyer :: Maybe OrderBuyerDTO
    <*> arbitraryReducedMaybe n -- orderDTONotes :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDTOTaxSystem :: Maybe OrderTaxSystemType
    <*> arbitraryReducedMaybe n -- orderDTOCancelRequested :: Maybe Bool
    <*> arbitraryReducedMaybe n -- orderDTOExpiryDate :: Maybe Text
  
instance Arbitrary OrderDeliveryAddressDTO where
  arbitrary = sized genOrderDeliveryAddressDTO

genOrderDeliveryAddressDTO :: Int -> Gen OrderDeliveryAddressDTO
genOrderDeliveryAddressDTO n =
  OrderDeliveryAddressDTO
    <$> arbitraryReducedMaybe n -- orderDeliveryAddressDTOCountry :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryAddressDTOPostcode :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryAddressDTOCity :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryAddressDTODistrict :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryAddressDTOSubway :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryAddressDTOStreet :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryAddressDTOHouse :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryAddressDTOBlock :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryAddressDTOEntrance :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryAddressDTOEntryphone :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryAddressDTOFloor :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryAddressDTOApartment :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryAddressDTOPhone :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryAddressDTORecipient :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryAddressDTOGps :: Maybe GpsDTO
  
instance Arbitrary OrderDeliveryDTO where
  arbitrary = sized genOrderDeliveryDTO

genOrderDeliveryDTO :: Int -> Gen OrderDeliveryDTO
genOrderDeliveryDTO n =
  OrderDeliveryDTO
    <$> arbitraryReducedMaybe n -- orderDeliveryDTOId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryDTOType :: Maybe OrderDeliveryType
    <*> arbitraryReducedMaybe n -- orderDeliveryDTOServiceName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryDTOPrice :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderDeliveryDTODeliveryPartnerType :: Maybe OrderDeliveryPartnerType
    <*> arbitraryReducedMaybe n -- orderDeliveryDTOCourier :: Maybe OrderCourierDTO
    <*> arbitraryReducedMaybe n -- orderDeliveryDTODates :: Maybe OrderDeliveryDatesDTO
    <*> arbitraryReducedMaybe n -- orderDeliveryDTORegion :: Maybe RegionDTO
    <*> arbitraryReducedMaybe n -- orderDeliveryDTOAddress :: Maybe OrderDeliveryAddressDTO
    <*> arbitraryReducedMaybe n -- orderDeliveryDTOVat :: Maybe OrderVatType
    <*> arbitraryReducedMaybe n -- orderDeliveryDTODeliveryServiceId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- orderDeliveryDTOLiftType :: Maybe OrderLiftType
    <*> arbitraryReducedMaybe n -- orderDeliveryDTOLiftPrice :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderDeliveryDTOOutletCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryDTOOutletStorageLimitDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryDTODispatchType :: Maybe OrderDeliveryDispatchType
    <*> arbitraryReducedMaybe n -- orderDeliveryDTOTracks :: Maybe [OrderTrackDTO]
    <*> arbitraryReducedMaybe n -- orderDeliveryDTOShipments :: Maybe [OrderShipmentDTO]
    <*> arbitraryReducedMaybe n -- orderDeliveryDTOEstimated :: Maybe Bool
    <*> arbitraryReducedMaybe n -- orderDeliveryDTOEacType :: Maybe OrderDeliveryEacType
    <*> arbitraryReducedMaybe n -- orderDeliveryDTOEacCode :: Maybe Text
  
instance Arbitrary OrderDeliveryDateDTO where
  arbitrary = sized genOrderDeliveryDateDTO

genOrderDeliveryDateDTO :: Int -> Gen OrderDeliveryDateDTO
genOrderDeliveryDateDTO n =
  OrderDeliveryDateDTO
    <$> arbitraryReduced n -- orderDeliveryDateDTOToDate :: Date
  
instance Arbitrary OrderDeliveryDatesDTO where
  arbitrary = sized genOrderDeliveryDatesDTO

genOrderDeliveryDatesDTO :: Int -> Gen OrderDeliveryDatesDTO
genOrderDeliveryDatesDTO n =
  OrderDeliveryDatesDTO
    <$> arbitraryReducedMaybe n -- orderDeliveryDatesDTOFromDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryDatesDTOToDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryDatesDTOFromTime :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryDatesDTOToTime :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderDeliveryDatesDTORealDeliveryDate :: Maybe Text
  
instance Arbitrary OrderDigitalItemDTO where
  arbitrary = sized genOrderDigitalItemDTO

genOrderDigitalItemDTO :: Int -> Gen OrderDigitalItemDTO
genOrderDigitalItemDTO n =
  OrderDigitalItemDTO
    <$> arbitrary -- orderDigitalItemDTOId :: Integer
    <*> arbitrary -- orderDigitalItemDTOCode :: Text
    <*> arbitrary -- orderDigitalItemDTOSlip :: Text
    <*> arbitraryReduced n -- orderDigitalItemDTOActivateTill :: Date
  
instance Arbitrary OrderItemDTO where
  arbitrary = sized genOrderItemDTO

genOrderItemDTO :: Int -> Gen OrderItemDTO
genOrderItemDTO n =
  OrderItemDTO
    <$> arbitraryReducedMaybe n -- orderItemDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- orderItemDTOOfferId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderItemDTOOfferName :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderItemDTOPrice :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderItemDTOBuyerPrice :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderItemDTOBuyerPriceBeforeDiscount :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderItemDTOPriceBeforeDiscount :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderItemDTOCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- orderItemDTOVat :: Maybe OrderVatType
    <*> arbitraryReducedMaybe n -- orderItemDTOShopSku :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderItemDTOSubsidy :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderItemDTOPartnerWarehouseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderItemDTOPromos :: Maybe [OrderItemPromoDTO]
    <*> arbitraryReducedMaybe n -- orderItemDTOInstances :: Maybe [OrderItemInstanceDTO]
    <*> arbitraryReducedMaybe n -- orderItemDTODetails :: Maybe [OrderItemDetailDTO]
    <*> arbitraryReducedMaybe n -- orderItemDTOSubsidies :: Maybe [OrderItemSubsidyDTO]
    <*> arbitraryReducedMaybe n -- orderItemDTORequiredInstanceTypes :: Maybe [OrderItemInstanceType]
  
instance Arbitrary OrderItemDetailDTO where
  arbitrary = sized genOrderItemDetailDTO

genOrderItemDetailDTO :: Int -> Gen OrderItemDetailDTO
genOrderItemDetailDTO n =
  OrderItemDetailDTO
    <$> arbitraryReducedMaybe n -- orderItemDetailDTOItemCount :: Maybe Integer
    <*> arbitraryReducedMaybe n -- orderItemDetailDTOItemStatus :: Maybe OrderItemStatusType
    <*> arbitraryReducedMaybe n -- orderItemDetailDTOUpdateDate :: Maybe Text
  
instance Arbitrary OrderItemInstanceDTO where
  arbitrary = sized genOrderItemInstanceDTO

genOrderItemInstanceDTO :: Int -> Gen OrderItemInstanceDTO
genOrderItemInstanceDTO n =
  OrderItemInstanceDTO
    <$> arbitraryReducedMaybe n -- orderItemInstanceDTOCis :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderItemInstanceDTOCisFull :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderItemInstanceDTOUin :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderItemInstanceDTORnpt :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderItemInstanceDTOGtd :: Maybe Text
  
instance Arbitrary OrderItemInstanceModificationDTO where
  arbitrary = sized genOrderItemInstanceModificationDTO

genOrderItemInstanceModificationDTO :: Int -> Gen OrderItemInstanceModificationDTO
genOrderItemInstanceModificationDTO n =
  OrderItemInstanceModificationDTO
    <$> arbitrary -- orderItemInstanceModificationDTOId :: Integer
    <*> arbitraryReduced n -- orderItemInstanceModificationDTOInstances :: [BriefOrderItemInstanceDTO]
  
instance Arbitrary OrderItemModificationDTO where
  arbitrary = sized genOrderItemModificationDTO

genOrderItemModificationDTO :: Int -> Gen OrderItemModificationDTO
genOrderItemModificationDTO n =
  OrderItemModificationDTO
    <$> arbitrary -- orderItemModificationDTOId :: Integer
    <*> arbitrary -- orderItemModificationDTOCount :: Int
    <*> arbitraryReducedMaybe n -- orderItemModificationDTOInstances :: Maybe [BriefOrderItemInstanceDTO]
  
instance Arbitrary OrderItemPromoDTO where
  arbitrary = sized genOrderItemPromoDTO

genOrderItemPromoDTO :: Int -> Gen OrderItemPromoDTO
genOrderItemPromoDTO n =
  OrderItemPromoDTO
    <$> arbitraryReduced n -- orderItemPromoDTOType :: OrderPromoType
    <*> arbitraryReducedMaybe n -- orderItemPromoDTODiscount :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderItemPromoDTOSubsidy :: Maybe Double
    <*> arbitraryReducedMaybe n -- orderItemPromoDTOShopPromoId :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderItemPromoDTOMarketPromoId :: Maybe Text
  
instance Arbitrary OrderItemSubsidyDTO where
  arbitrary = sized genOrderItemSubsidyDTO

genOrderItemSubsidyDTO :: Int -> Gen OrderItemSubsidyDTO
genOrderItemSubsidyDTO n =
  OrderItemSubsidyDTO
    <$> arbitraryReducedMaybe n -- orderItemSubsidyDTOType :: Maybe OrderItemSubsidyType
    <*> arbitraryReducedMaybe n -- orderItemSubsidyDTOAmount :: Maybe Double
  
instance Arbitrary OrderItemsModificationResultDTO where
  arbitrary = sized genOrderItemsModificationResultDTO

genOrderItemsModificationResultDTO :: Int -> Gen OrderItemsModificationResultDTO
genOrderItemsModificationResultDTO n =
  OrderItemsModificationResultDTO
    <$> arbitraryReduced n -- orderItemsModificationResultDTOItems :: [BriefOrderItemDTO]
  
instance Arbitrary OrderLabelDTO where
  arbitrary = sized genOrderLabelDTO

genOrderLabelDTO :: Int -> Gen OrderLabelDTO
genOrderLabelDTO n =
  OrderLabelDTO
    <$> arbitrary -- orderLabelDTOOrderId :: Integer
    <*> arbitrary -- orderLabelDTOPlacesNumber :: Int
    <*> arbitrary -- orderLabelDTOUrl :: Text
    <*> arbitraryReduced n -- orderLabelDTOParcelBoxLabels :: [ParcelBoxLabelDTO]
  
instance Arbitrary OrderParcelBoxDTO where
  arbitrary = sized genOrderParcelBoxDTO

genOrderParcelBoxDTO :: Int -> Gen OrderParcelBoxDTO
genOrderParcelBoxDTO n =
  OrderParcelBoxDTO
    <$> arbitraryReducedMaybe n -- orderParcelBoxDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- orderParcelBoxDTOFulfilmentId :: Maybe Text
  
instance Arbitrary OrderShipmentDTO where
  arbitrary = sized genOrderShipmentDTO

genOrderShipmentDTO :: Int -> Gen OrderShipmentDTO
genOrderShipmentDTO n =
  OrderShipmentDTO
    <$> arbitraryReducedMaybe n -- orderShipmentDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- orderShipmentDTOShipmentDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderShipmentDTOShipmentTime :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderShipmentDTOTracks :: Maybe [OrderTrackDTO]
    <*> arbitraryReducedMaybe n -- orderShipmentDTOBoxes :: Maybe [OrderParcelBoxDTO]
  
instance Arbitrary OrderStateDTO where
  arbitrary = sized genOrderStateDTO

genOrderStateDTO :: Int -> Gen OrderStateDTO
genOrderStateDTO n =
  OrderStateDTO
    <$> arbitrary -- orderStateDTOId :: Integer
    <*> arbitraryReduced n -- orderStateDTOStatus :: OrderStatusType
    <*> arbitraryReducedMaybe n -- orderStateDTOSubstatus :: Maybe OrderSubstatusType
  
instance Arbitrary OrderStatusChangeDTO where
  arbitrary = sized genOrderStatusChangeDTO

genOrderStatusChangeDTO :: Int -> Gen OrderStatusChangeDTO
genOrderStatusChangeDTO n =
  OrderStatusChangeDTO
    <$> arbitraryReduced n -- orderStatusChangeDTOStatus :: OrderStatusType
    <*> arbitraryReducedMaybe n -- orderStatusChangeDTOSubstatus :: Maybe OrderSubstatusType
    <*> arbitraryReducedMaybe n -- orderStatusChangeDTODelivery :: Maybe OrderStatusChangeDeliveryDTO
  
instance Arbitrary OrderStatusChangeDeliveryDTO where
  arbitrary = sized genOrderStatusChangeDeliveryDTO

genOrderStatusChangeDeliveryDTO :: Int -> Gen OrderStatusChangeDeliveryDTO
genOrderStatusChangeDeliveryDTO n =
  OrderStatusChangeDeliveryDTO
    <$> arbitraryReducedMaybe n -- orderStatusChangeDeliveryDTODates :: Maybe OrderStatusChangeDeliveryDatesDTO
  
instance Arbitrary OrderStatusChangeDeliveryDatesDTO where
  arbitrary = sized genOrderStatusChangeDeliveryDatesDTO

genOrderStatusChangeDeliveryDatesDTO :: Int -> Gen OrderStatusChangeDeliveryDatesDTO
genOrderStatusChangeDeliveryDatesDTO n =
  OrderStatusChangeDeliveryDatesDTO
    <$> arbitraryReducedMaybe n -- orderStatusChangeDeliveryDatesDTORealDeliveryDate :: Maybe Date
  
instance Arbitrary OrderSubsidyDTO where
  arbitrary = sized genOrderSubsidyDTO

genOrderSubsidyDTO :: Int -> Gen OrderSubsidyDTO
genOrderSubsidyDTO n =
  OrderSubsidyDTO
    <$> arbitraryReducedMaybe n -- orderSubsidyDTOType :: Maybe OrderSubsidyType
    <*> arbitraryReducedMaybe n -- orderSubsidyDTOAmount :: Maybe Double
  
instance Arbitrary OrderTrackDTO where
  arbitrary = sized genOrderTrackDTO

genOrderTrackDTO :: Int -> Gen OrderTrackDTO
genOrderTrackDTO n =
  OrderTrackDTO
    <$> arbitraryReducedMaybe n -- orderTrackDTOTrackCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- orderTrackDTODeliveryServiceId :: Maybe Integer
  
instance Arbitrary OrdersShipmentInfoDTO where
  arbitrary = sized genOrdersShipmentInfoDTO

genOrdersShipmentInfoDTO :: Int -> Gen OrdersShipmentInfoDTO
genOrdersShipmentInfoDTO n =
  OrdersShipmentInfoDTO
    <$> arbitrary -- ordersShipmentInfoDTOOrderIdsWithLabels :: [Integer]
    <*> arbitrary -- ordersShipmentInfoDTOOrderIdsWithoutLabels :: [Integer]
  
instance Arbitrary OrdersStatsCommissionDTO where
  arbitrary = sized genOrdersStatsCommissionDTO

genOrdersStatsCommissionDTO :: Int -> Gen OrdersStatsCommissionDTO
genOrdersStatsCommissionDTO n =
  OrdersStatsCommissionDTO
    <$> arbitraryReducedMaybe n -- ordersStatsCommissionDTOType :: Maybe OrdersStatsCommissionType
    <*> arbitraryReducedMaybe n -- ordersStatsCommissionDTOActual :: Maybe Double
  
instance Arbitrary OrdersStatsDTO where
  arbitrary = sized genOrdersStatsDTO

genOrdersStatsDTO :: Int -> Gen OrdersStatsDTO
genOrdersStatsDTO n =
  OrdersStatsDTO
    <$> arbitraryReduced n -- ordersStatsDTOOrders :: [OrdersStatsOrderDTO]
    <*> arbitraryReducedMaybe n -- ordersStatsDTOPaging :: Maybe ForwardScrollingPagerDTO
  
instance Arbitrary OrdersStatsDeliveryRegionDTO where
  arbitrary = sized genOrdersStatsDeliveryRegionDTO

genOrdersStatsDeliveryRegionDTO :: Int -> Gen OrdersStatsDeliveryRegionDTO
genOrdersStatsDeliveryRegionDTO n =
  OrdersStatsDeliveryRegionDTO
    <$> arbitraryReducedMaybe n -- ordersStatsDeliveryRegionDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- ordersStatsDeliveryRegionDTOName :: Maybe Text
  
instance Arbitrary OrdersStatsDetailsDTO where
  arbitrary = sized genOrdersStatsDetailsDTO

genOrdersStatsDetailsDTO :: Int -> Gen OrdersStatsDetailsDTO
genOrdersStatsDetailsDTO n =
  OrdersStatsDetailsDTO
    <$> arbitraryReducedMaybe n -- ordersStatsDetailsDTOItemStatus :: Maybe OrdersStatsItemStatusType
    <*> arbitraryReducedMaybe n -- ordersStatsDetailsDTOItemCount :: Maybe Integer
    <*> arbitraryReducedMaybe n -- ordersStatsDetailsDTOUpdateDate :: Maybe Date
    <*> arbitraryReducedMaybe n -- ordersStatsDetailsDTOStockType :: Maybe OrdersStatsStockType
  
instance Arbitrary OrdersStatsItemDTO where
  arbitrary = sized genOrdersStatsItemDTO

genOrdersStatsItemDTO :: Int -> Gen OrdersStatsItemDTO
genOrdersStatsItemDTO n =
  OrdersStatsItemDTO
    <$> arbitraryReducedMaybe n -- ordersStatsItemDTOOfferName :: Maybe Text
    <*> arbitraryReducedMaybe n -- ordersStatsItemDTOMarketSku :: Maybe Integer
    <*> arbitraryReducedMaybe n -- ordersStatsItemDTOShopSku :: Maybe Text
    <*> arbitraryReducedMaybe n -- ordersStatsItemDTOCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- ordersStatsItemDTOPrices :: Maybe [OrdersStatsPriceDTO]
    <*> arbitraryReducedMaybe n -- ordersStatsItemDTOWarehouse :: Maybe OrdersStatsWarehouseDTO
    <*> arbitraryReducedMaybe n -- ordersStatsItemDTODetails :: Maybe [OrdersStatsDetailsDTO]
    <*> arbitraryReducedMaybe n -- ordersStatsItemDTOCisList :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- ordersStatsItemDTOInitialCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- ordersStatsItemDTOBidFee :: Maybe Int
    <*> arbitraryReducedMaybe n -- ordersStatsItemDTOCofinanceThreshold :: Maybe Double
    <*> arbitraryReducedMaybe n -- ordersStatsItemDTOCofinanceValue :: Maybe Double
  
instance Arbitrary OrdersStatsOrderDTO where
  arbitrary = sized genOrdersStatsOrderDTO

genOrdersStatsOrderDTO :: Int -> Gen OrdersStatsOrderDTO
genOrdersStatsOrderDTO n =
  OrdersStatsOrderDTO
    <$> arbitraryReducedMaybe n -- ordersStatsOrderDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- ordersStatsOrderDTOCreationDate :: Maybe Date
    <*> arbitraryReducedMaybe n -- ordersStatsOrderDTOStatusUpdateDate :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- ordersStatsOrderDTOStatus :: Maybe OrderStatsStatusType
    <*> arbitraryReducedMaybe n -- ordersStatsOrderDTOPartnerOrderId :: Maybe Text
    <*> arbitraryReducedMaybe n -- ordersStatsOrderDTOPaymentType :: Maybe OrdersStatsOrderPaymentType
    <*> arbitraryReducedMaybe n -- ordersStatsOrderDTOFake :: Maybe Bool
    <*> arbitraryReducedMaybe n -- ordersStatsOrderDTODeliveryRegion :: Maybe OrdersStatsDeliveryRegionDTO
    <*> arbitraryReduced n -- ordersStatsOrderDTOItems :: [OrdersStatsItemDTO]
    <*> arbitraryReducedMaybe n -- ordersStatsOrderDTOInitialItems :: Maybe [OrdersStatsItemDTO]
    <*> arbitraryReduced n -- ordersStatsOrderDTOPayments :: [OrdersStatsPaymentDTO]
    <*> arbitraryReduced n -- ordersStatsOrderDTOCommissions :: [OrdersStatsCommissionDTO]
  
instance Arbitrary OrdersStatsPaymentDTO where
  arbitrary = sized genOrdersStatsPaymentDTO

genOrdersStatsPaymentDTO :: Int -> Gen OrdersStatsPaymentDTO
genOrdersStatsPaymentDTO n =
  OrdersStatsPaymentDTO
    <$> arbitraryReducedMaybe n -- ordersStatsPaymentDTOId :: Maybe Text
    <*> arbitraryReducedMaybe n -- ordersStatsPaymentDTODate :: Maybe Date
    <*> arbitraryReducedMaybe n -- ordersStatsPaymentDTOType :: Maybe OrdersStatsPaymentType
    <*> arbitraryReducedMaybe n -- ordersStatsPaymentDTOSource :: Maybe OrdersStatsPaymentSourceType
    <*> arbitraryReducedMaybe n -- ordersStatsPaymentDTOTotal :: Maybe Double
    <*> arbitraryReducedMaybe n -- ordersStatsPaymentDTOPaymentOrder :: Maybe OrdersStatsPaymentOrderDTO
  
instance Arbitrary OrdersStatsPaymentOrderDTO where
  arbitrary = sized genOrdersStatsPaymentOrderDTO

genOrdersStatsPaymentOrderDTO :: Int -> Gen OrdersStatsPaymentOrderDTO
genOrdersStatsPaymentOrderDTO n =
  OrdersStatsPaymentOrderDTO
    <$> arbitraryReducedMaybe n -- ordersStatsPaymentOrderDTOId :: Maybe Text
    <*> arbitraryReducedMaybe n -- ordersStatsPaymentOrderDTODate :: Maybe Date
  
instance Arbitrary OrdersStatsPriceDTO where
  arbitrary = sized genOrdersStatsPriceDTO

genOrdersStatsPriceDTO :: Int -> Gen OrdersStatsPriceDTO
genOrdersStatsPriceDTO n =
  OrdersStatsPriceDTO
    <$> arbitraryReducedMaybe n -- ordersStatsPriceDTOType :: Maybe OrdersStatsPriceType
    <*> arbitraryReducedMaybe n -- ordersStatsPriceDTOCostPerItem :: Maybe Double
    <*> arbitraryReducedMaybe n -- ordersStatsPriceDTOTotal :: Maybe Double
  
instance Arbitrary OrdersStatsWarehouseDTO where
  arbitrary = sized genOrdersStatsWarehouseDTO

genOrdersStatsWarehouseDTO :: Int -> Gen OrdersStatsWarehouseDTO
genOrdersStatsWarehouseDTO n =
  OrdersStatsWarehouseDTO
    <$> arbitraryReducedMaybe n -- ordersStatsWarehouseDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- ordersStatsWarehouseDTOName :: Maybe Text
  
instance Arbitrary OutletAddressDTO where
  arbitrary = sized genOutletAddressDTO

genOutletAddressDTO :: Int -> Gen OutletAddressDTO
genOutletAddressDTO n =
  OutletAddressDTO
    <$> arbitrary -- outletAddressDTORegionId :: Integer
    <*> arbitraryReducedMaybe n -- outletAddressDTOStreet :: Maybe Text
    <*> arbitraryReducedMaybe n -- outletAddressDTONumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- outletAddressDTOBuilding :: Maybe Text
    <*> arbitraryReducedMaybe n -- outletAddressDTOEstate :: Maybe Text
    <*> arbitraryReducedMaybe n -- outletAddressDTOBlock :: Maybe Text
    <*> arbitraryReducedMaybe n -- outletAddressDTOAdditional :: Maybe Text
    <*> arbitraryReducedMaybe n -- outletAddressDTOKm :: Maybe Int
    <*> arbitraryReducedMaybe n -- outletAddressDTOCity :: Maybe Text
  
instance Arbitrary OutletDTO where
  arbitrary = sized genOutletDTO

genOutletDTO :: Int -> Gen OutletDTO
genOutletDTO n =
  OutletDTO
    <$> arbitrary -- outletDTOName :: Text
    <*> arbitraryReduced n -- outletDTOType :: OutletType
    <*> arbitraryReducedMaybe n -- outletDTOCoords :: Maybe Text
    <*> arbitraryReducedMaybe n -- outletDTOIsMain :: Maybe Bool
    <*> arbitraryReducedMaybe n -- outletDTOShopOutletCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- outletDTOVisibility :: Maybe OutletVisibilityType
    <*> arbitraryReduced n -- outletDTOAddress :: OutletAddressDTO
    <*> arbitrary -- outletDTOPhones :: [Text]
    <*> arbitraryReduced n -- outletDTOWorkingSchedule :: OutletWorkingScheduleDTO
    <*> arbitraryReducedMaybe n -- outletDTODeliveryRules :: Maybe [OutletDeliveryRuleDTO]
    <*> arbitraryReducedMaybe n -- outletDTOStoragePeriod :: Maybe Integer
  
instance Arbitrary OutletDeliveryRuleDTO where
  arbitrary = sized genOutletDeliveryRuleDTO

genOutletDeliveryRuleDTO :: Int -> Gen OutletDeliveryRuleDTO
genOutletDeliveryRuleDTO n =
  OutletDeliveryRuleDTO
    <$> arbitraryReducedMaybe n -- outletDeliveryRuleDTOMinDeliveryDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- outletDeliveryRuleDTOMaxDeliveryDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- outletDeliveryRuleDTODeliveryServiceId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- outletDeliveryRuleDTOOrderBefore :: Maybe Int
    <*> arbitraryReducedMaybe n -- outletDeliveryRuleDTOPriceFreePickup :: Maybe Double
    <*> arbitraryReducedMaybe n -- outletDeliveryRuleDTOUnspecifiedDeliveryInterval :: Maybe Bool
  
instance Arbitrary OutletLicenseDTO where
  arbitrary = sized genOutletLicenseDTO

genOutletLicenseDTO :: Int -> Gen OutletLicenseDTO
genOutletLicenseDTO n =
  OutletLicenseDTO
    <$> arbitraryReducedMaybe n -- outletLicenseDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- outletLicenseDTOOutletId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- outletLicenseDTOLicenseType :: Maybe LicenseType
    <*> arbitraryReducedMaybe n -- outletLicenseDTONumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- outletLicenseDTODateOfIssue :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- outletLicenseDTODateOfExpiry :: Maybe DateTime
  
instance Arbitrary OutletLicensesResponseDTO where
  arbitrary = sized genOutletLicensesResponseDTO

genOutletLicensesResponseDTO :: Int -> Gen OutletLicensesResponseDTO
genOutletLicensesResponseDTO n =
  OutletLicensesResponseDTO
    <$> arbitraryReduced n -- outletLicensesResponseDTOLicenses :: [FullOutletLicenseDTO]
  
instance Arbitrary OutletResponseDTO where
  arbitrary = sized genOutletResponseDTO

genOutletResponseDTO :: Int -> Gen OutletResponseDTO
genOutletResponseDTO n =
  OutletResponseDTO
    <$> arbitraryReducedMaybe n -- outletResponseDTOId :: Maybe Integer
  
instance Arbitrary OutletWorkingScheduleDTO where
  arbitrary = sized genOutletWorkingScheduleDTO

genOutletWorkingScheduleDTO :: Int -> Gen OutletWorkingScheduleDTO
genOutletWorkingScheduleDTO n =
  OutletWorkingScheduleDTO
    <$> arbitraryReducedMaybe n -- outletWorkingScheduleDTOWorkInHoliday :: Maybe Bool
    <*> arbitraryReduced n -- outletWorkingScheduleDTOScheduleItems :: [OutletWorkingScheduleItemDTO]
  
instance Arbitrary OutletWorkingScheduleItemDTO where
  arbitrary = sized genOutletWorkingScheduleItemDTO

genOutletWorkingScheduleItemDTO :: Int -> Gen OutletWorkingScheduleItemDTO
genOutletWorkingScheduleItemDTO n =
  OutletWorkingScheduleItemDTO
    <$> arbitraryReduced n -- outletWorkingScheduleItemDTOStartDay :: DayOfWeekType
    <*> arbitraryReduced n -- outletWorkingScheduleItemDTOEndDay :: DayOfWeekType
    <*> arbitrary -- outletWorkingScheduleItemDTOStartTime :: Text
    <*> arbitrary -- outletWorkingScheduleItemDTOEndTime :: Text
  
instance Arbitrary PagedReturnsDTO where
  arbitrary = sized genPagedReturnsDTO

genPagedReturnsDTO :: Int -> Gen PagedReturnsDTO
genPagedReturnsDTO n =
  PagedReturnsDTO
    <$> arbitraryReducedMaybe n -- pagedReturnsDTOPaging :: Maybe ForwardScrollingPagerDTO
    <*> arbitraryReduced n -- pagedReturnsDTOReturns :: [ReturnDTO]
  
instance Arbitrary PalletsCountDTO where
  arbitrary = sized genPalletsCountDTO

genPalletsCountDTO :: Int -> Gen PalletsCountDTO
genPalletsCountDTO n =
  PalletsCountDTO
    <$> arbitraryReducedMaybe n -- palletsCountDTOPlanned :: Maybe Int
    <*> arbitraryReducedMaybe n -- palletsCountDTOFact :: Maybe Int
  
instance Arbitrary ParameterValueConstraintsDTO where
  arbitrary = sized genParameterValueConstraintsDTO

genParameterValueConstraintsDTO :: Int -> Gen ParameterValueConstraintsDTO
genParameterValueConstraintsDTO n =
  ParameterValueConstraintsDTO
    <$> arbitraryReducedMaybe n -- parameterValueConstraintsDTOMinValue :: Maybe Double
    <*> arbitraryReducedMaybe n -- parameterValueConstraintsDTOMaxValue :: Maybe Double
    <*> arbitraryReducedMaybe n -- parameterValueConstraintsDTOMaxLength :: Maybe Int
  
instance Arbitrary ParameterValueDTO where
  arbitrary = sized genParameterValueDTO

genParameterValueDTO :: Int -> Gen ParameterValueDTO
genParameterValueDTO n =
  ParameterValueDTO
    <$> arbitrary -- parameterValueDTOParameterId :: Integer
    <*> arbitraryReducedMaybe n -- parameterValueDTOUnitId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- parameterValueDTOValueId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- parameterValueDTOValue :: Maybe Text
  
instance Arbitrary ParameterValueOptionDTO where
  arbitrary = sized genParameterValueOptionDTO

genParameterValueOptionDTO :: Int -> Gen ParameterValueOptionDTO
genParameterValueOptionDTO n =
  ParameterValueOptionDTO
    <$> arbitrary -- parameterValueOptionDTOId :: Integer
    <*> arbitrary -- parameterValueOptionDTOValue :: Text
    <*> arbitraryReducedMaybe n -- parameterValueOptionDTODescription :: Maybe Text
  
instance Arbitrary ParcelBoxDTO where
  arbitrary = sized genParcelBoxDTO

genParcelBoxDTO :: Int -> Gen ParcelBoxDTO
genParcelBoxDTO n =
  ParcelBoxDTO
    <$> arbitraryReducedMaybe n -- parcelBoxDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- parcelBoxDTOFulfilmentId :: Maybe Text
  
instance Arbitrary ParcelBoxLabelDTO where
  arbitrary = sized genParcelBoxLabelDTO

genParcelBoxLabelDTO :: Int -> Gen ParcelBoxLabelDTO
genParcelBoxLabelDTO n =
  ParcelBoxLabelDTO
    <$> arbitrary -- parcelBoxLabelDTOUrl :: Text
    <*> arbitrary -- parcelBoxLabelDTOSupplierName :: Text
    <*> arbitrary -- parcelBoxLabelDTODeliveryServiceName :: Text
    <*> arbitrary -- parcelBoxLabelDTOOrderId :: Integer
    <*> arbitrary -- parcelBoxLabelDTOOrderNum :: Text
    <*> arbitrary -- parcelBoxLabelDTORecipientName :: Text
    <*> arbitrary -- parcelBoxLabelDTOBoxId :: Integer
    <*> arbitrary -- parcelBoxLabelDTOFulfilmentId :: Text
    <*> arbitrary -- parcelBoxLabelDTOPlace :: Text
    <*> arbitrary -- parcelBoxLabelDTOWeight :: Text
    <*> arbitrary -- parcelBoxLabelDTODeliveryServiceId :: Text
    <*> arbitraryReducedMaybe n -- parcelBoxLabelDTODeliveryAddress :: Maybe Text
    <*> arbitraryReducedMaybe n -- parcelBoxLabelDTOShipmentDate :: Maybe Text
  
instance Arbitrary ParcelDTO where
  arbitrary = sized genParcelDTO

genParcelDTO :: Int -> Gen ParcelDTO
genParcelDTO n =
  ParcelDTO
    <$> arbitraryReduced n -- parcelDTOBoxes :: [ParcelBoxDTO]
  
instance Arbitrary PartnerShipmentWarehouseDTO where
  arbitrary = sized genPartnerShipmentWarehouseDTO

genPartnerShipmentWarehouseDTO :: Int -> Gen PartnerShipmentWarehouseDTO
genPartnerShipmentWarehouseDTO n =
  PartnerShipmentWarehouseDTO
    <$> arbitraryReducedMaybe n -- partnerShipmentWarehouseDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- partnerShipmentWarehouseDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- partnerShipmentWarehouseDTOAddress :: Maybe Text
  
instance Arbitrary PickupAddressDTO where
  arbitrary = sized genPickupAddressDTO

genPickupAddressDTO :: Int -> Gen PickupAddressDTO
genPickupAddressDTO n =
  PickupAddressDTO
    <$> arbitraryReducedMaybe n -- pickupAddressDTOCountry :: Maybe Text
    <*> arbitraryReducedMaybe n -- pickupAddressDTOCity :: Maybe Text
    <*> arbitraryReducedMaybe n -- pickupAddressDTOStreet :: Maybe Text
    <*> arbitraryReducedMaybe n -- pickupAddressDTOHouse :: Maybe Text
    <*> arbitraryReducedMaybe n -- pickupAddressDTOPostcode :: Maybe Text
  
instance Arbitrary PriceCompetitivenessThresholdsDTO where
  arbitrary = sized genPriceCompetitivenessThresholdsDTO

genPriceCompetitivenessThresholdsDTO :: Int -> Gen PriceCompetitivenessThresholdsDTO
genPriceCompetitivenessThresholdsDTO n =
  PriceCompetitivenessThresholdsDTO
    <$> arbitraryReducedMaybe n -- priceCompetitivenessThresholdsDTOOptimalPrice :: Maybe BasePriceDTO
    <*> arbitraryReducedMaybe n -- priceCompetitivenessThresholdsDTOAveragePrice :: Maybe BasePriceDTO
  
instance Arbitrary PriceDTO where
  arbitrary = sized genPriceDTO

genPriceDTO :: Int -> Gen PriceDTO
genPriceDTO n =
  PriceDTO
    <$> arbitraryReducedMaybe n -- priceDTOValue :: Maybe Double
    <*> arbitraryReducedMaybe n -- priceDTODiscountBase :: Maybe Double
    <*> arbitraryReducedMaybe n -- priceDTOCurrencyId :: Maybe CurrencyType
    <*> arbitraryReducedMaybe n -- priceDTOVat :: Maybe Int
  
instance Arbitrary PriceQuarantineVerdictDTO where
  arbitrary = sized genPriceQuarantineVerdictDTO

genPriceQuarantineVerdictDTO :: Int -> Gen PriceQuarantineVerdictDTO
genPriceQuarantineVerdictDTO n =
  PriceQuarantineVerdictDTO
    <$> arbitraryReducedMaybe n -- priceQuarantineVerdictDTOType :: Maybe PriceQuarantineVerdictType
    <*> arbitraryReduced n -- priceQuarantineVerdictDTOParams :: [PriceQuarantineVerdictParameterDTO]
  
instance Arbitrary PriceQuarantineVerdictParameterDTO where
  arbitrary = sized genPriceQuarantineVerdictParameterDTO

genPriceQuarantineVerdictParameterDTO :: Int -> Gen PriceQuarantineVerdictParameterDTO
genPriceQuarantineVerdictParameterDTO n =
  PriceQuarantineVerdictParameterDTO
    <$> arbitraryReduced n -- priceQuarantineVerdictParameterDTOName :: PriceQuarantineVerdictParamNameType
    <*> arbitrary -- priceQuarantineVerdictParameterDTOValue :: Text
  
instance Arbitrary PriceRecommendationItemDTO where
  arbitrary = sized genPriceRecommendationItemDTO

genPriceRecommendationItemDTO :: Int -> Gen PriceRecommendationItemDTO
genPriceRecommendationItemDTO n =
  PriceRecommendationItemDTO
    <$> arbitrary -- priceRecommendationItemDTOCampaignId :: Integer
    <*> arbitrary -- priceRecommendationItemDTOPrice :: Double
  
instance Arbitrary PriceSuggestDTO where
  arbitrary = sized genPriceSuggestDTO

genPriceSuggestDTO :: Int -> Gen PriceSuggestDTO
genPriceSuggestDTO n =
  PriceSuggestDTO
    <$> arbitraryReducedMaybe n -- priceSuggestDTOType :: Maybe PriceSuggestType
    <*> arbitraryReducedMaybe n -- priceSuggestDTOPrice :: Maybe Double
  
instance Arbitrary PriceSuggestOfferDTO where
  arbitrary = sized genPriceSuggestOfferDTO

genPriceSuggestOfferDTO :: Int -> Gen PriceSuggestOfferDTO
genPriceSuggestOfferDTO n =
  PriceSuggestOfferDTO
    <$> arbitraryReducedMaybe n -- priceSuggestOfferDTOMarketSku :: Maybe Integer
    <*> arbitraryReducedMaybe n -- priceSuggestOfferDTOOfferId :: Maybe Text
    <*> arbitraryReducedMaybe n -- priceSuggestOfferDTOPriceSuggestion :: Maybe [PriceSuggestDTO]
  
instance Arbitrary PromoOfferAutoParticipatingDetailsDTO where
  arbitrary = sized genPromoOfferAutoParticipatingDetailsDTO

genPromoOfferAutoParticipatingDetailsDTO :: Int -> Gen PromoOfferAutoParticipatingDetailsDTO
genPromoOfferAutoParticipatingDetailsDTO n =
  PromoOfferAutoParticipatingDetailsDTO
    <$> arbitraryReducedMaybe n -- promoOfferAutoParticipatingDetailsDTOCampaignIds :: Maybe [Integer]
  
instance Arbitrary PromoOfferDiscountParamsDTO where
  arbitrary = sized genPromoOfferDiscountParamsDTO

genPromoOfferDiscountParamsDTO :: Int -> Gen PromoOfferDiscountParamsDTO
genPromoOfferDiscountParamsDTO n =
  PromoOfferDiscountParamsDTO
    <$> arbitraryReducedMaybe n -- promoOfferDiscountParamsDTOPrice :: Maybe Integer
    <*> arbitraryReducedMaybe n -- promoOfferDiscountParamsDTOPromoPrice :: Maybe Integer
    <*> arbitrary -- promoOfferDiscountParamsDTOMaxPromoPrice :: Integer
  
instance Arbitrary PromoOfferParamsDTO where
  arbitrary = sized genPromoOfferParamsDTO

genPromoOfferParamsDTO :: Int -> Gen PromoOfferParamsDTO
genPromoOfferParamsDTO n =
  PromoOfferParamsDTO
    <$> arbitraryReducedMaybe n -- promoOfferParamsDTODiscountParams :: Maybe PromoOfferDiscountParamsDTO
    <*> arbitraryReducedMaybe n -- promoOfferParamsDTOPromocodeParams :: Maybe PromoOfferPromocodeParamsDTO
  
instance Arbitrary PromoOfferPromocodeParamsDTO where
  arbitrary = sized genPromoOfferPromocodeParamsDTO

genPromoOfferPromocodeParamsDTO :: Int -> Gen PromoOfferPromocodeParamsDTO
genPromoOfferPromocodeParamsDTO n =
  PromoOfferPromocodeParamsDTO
    <$> arbitrary -- promoOfferPromocodeParamsDTOMaxPrice :: Integer
  
instance Arbitrary PromoOfferUpdateWarningDTO where
  arbitrary = sized genPromoOfferUpdateWarningDTO

genPromoOfferUpdateWarningDTO :: Int -> Gen PromoOfferUpdateWarningDTO
genPromoOfferUpdateWarningDTO n =
  PromoOfferUpdateWarningDTO
    <$> arbitraryReduced n -- promoOfferUpdateWarningDTOCode :: PromoOfferUpdateWarningCodeType
    <*> arbitraryReducedMaybe n -- promoOfferUpdateWarningDTOCampaignIds :: Maybe [Integer]
  
instance Arbitrary PromoPeriodDTO where
  arbitrary = sized genPromoPeriodDTO

genPromoPeriodDTO :: Int -> Gen PromoPeriodDTO
genPromoPeriodDTO n =
  PromoPeriodDTO
    <$> arbitraryReduced n -- promoPeriodDTODateTimeFrom :: DateTime
    <*> arbitraryReduced n -- promoPeriodDTODateTimeTo :: DateTime
  
instance Arbitrary ProvideOrderDigitalCodesRequest where
  arbitrary = sized genProvideOrderDigitalCodesRequest

genProvideOrderDigitalCodesRequest :: Int -> Gen ProvideOrderDigitalCodesRequest
genProvideOrderDigitalCodesRequest n =
  ProvideOrderDigitalCodesRequest
    <$> arbitraryReduced n -- provideOrderDigitalCodesRequestItems :: [OrderDigitalItemDTO]
  
instance Arbitrary ProvideOrderItemIdentifiersRequest where
  arbitrary = sized genProvideOrderItemIdentifiersRequest

genProvideOrderItemIdentifiersRequest :: Int -> Gen ProvideOrderItemIdentifiersRequest
genProvideOrderItemIdentifiersRequest n =
  ProvideOrderItemIdentifiersRequest
    <$> arbitraryReduced n -- provideOrderItemIdentifiersRequestItems :: [OrderItemInstanceModificationDTO]
  
instance Arbitrary ProvideOrderItemIdentifiersResponse where
  arbitrary = sized genProvideOrderItemIdentifiersResponse

genProvideOrderItemIdentifiersResponse :: Int -> Gen ProvideOrderItemIdentifiersResponse
genProvideOrderItemIdentifiersResponse n =
  ProvideOrderItemIdentifiersResponse
    <$> arbitraryReducedMaybe n -- provideOrderItemIdentifiersResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- provideOrderItemIdentifiersResponseResult :: Maybe OrderItemsModificationResultDTO
  
instance Arbitrary PutSkuBidsRequest where
  arbitrary = sized genPutSkuBidsRequest

genPutSkuBidsRequest :: Int -> Gen PutSkuBidsRequest
genPutSkuBidsRequest n =
  PutSkuBidsRequest
    <$> arbitraryReduced n -- putSkuBidsRequestBids :: [SkuBidItemDTO]
  
instance Arbitrary QualityRatingAffectedOrderDTO where
  arbitrary = sized genQualityRatingAffectedOrderDTO

genQualityRatingAffectedOrderDTO :: Int -> Gen QualityRatingAffectedOrderDTO
genQualityRatingAffectedOrderDTO n =
  QualityRatingAffectedOrderDTO
    <$> arbitrary -- qualityRatingAffectedOrderDTOOrderId :: Integer
    <*> arbitrary -- qualityRatingAffectedOrderDTODescription :: Text
    <*> arbitraryReduced n -- qualityRatingAffectedOrderDTOComponentType :: AffectedOrderQualityRatingComponentType
  
instance Arbitrary QualityRatingComponentDTO where
  arbitrary = sized genQualityRatingComponentDTO

genQualityRatingComponentDTO :: Int -> Gen QualityRatingComponentDTO
genQualityRatingComponentDTO n =
  QualityRatingComponentDTO
    <$> arbitrary -- qualityRatingComponentDTOValue :: Double
    <*> arbitraryReduced n -- qualityRatingComponentDTOComponentType :: QualityRatingComponentType
  
instance Arbitrary QualityRatingDTO where
  arbitrary = sized genQualityRatingDTO

genQualityRatingDTO :: Int -> Gen QualityRatingDTO
genQualityRatingDTO n =
  QualityRatingDTO
    <$> arbitrary -- qualityRatingDTORating :: Integer
    <*> arbitraryReduced n -- qualityRatingDTOCalculationDate :: Date
    <*> arbitraryReduced n -- qualityRatingDTOComponents :: [QualityRatingComponentDTO]
  
instance Arbitrary QualityRatingDetailsDTO where
  arbitrary = sized genQualityRatingDetailsDTO

genQualityRatingDetailsDTO :: Int -> Gen QualityRatingDetailsDTO
genQualityRatingDetailsDTO n =
  QualityRatingDetailsDTO
    <$> arbitraryReduced n -- qualityRatingDetailsDTOAffectedOrders :: [QualityRatingAffectedOrderDTO]
  
instance Arbitrary QuantumDTO where
  arbitrary = sized genQuantumDTO

genQuantumDTO :: Int -> Gen QuantumDTO
genQuantumDTO n =
  QuantumDTO
    <$> arbitraryReducedMaybe n -- quantumDTOMinQuantity :: Maybe Int
    <*> arbitraryReducedMaybe n -- quantumDTOStepQuantity :: Maybe Int
  
instance Arbitrary QuarantineOfferDTO where
  arbitrary = sized genQuarantineOfferDTO

genQuarantineOfferDTO :: Int -> Gen QuarantineOfferDTO
genQuarantineOfferDTO n =
  QuarantineOfferDTO
    <$> arbitraryReducedMaybe n -- quarantineOfferDTOOfferId :: Maybe Text
    <*> arbitraryReducedMaybe n -- quarantineOfferDTOCurrentPrice :: Maybe BasePriceDTO
    <*> arbitraryReducedMaybe n -- quarantineOfferDTOLastValidPrice :: Maybe BasePriceDTO
    <*> arbitraryReducedMaybe n -- quarantineOfferDTOVerdicts :: Maybe [PriceQuarantineVerdictDTO]
  
instance Arbitrary RegionDTO where
  arbitrary = sized genRegionDTO

genRegionDTO :: Int -> Gen RegionDTO
genRegionDTO n =
  RegionDTO
    <$> arbitraryReducedMaybe n -- regionDTOId :: Maybe Integer
    <*> arbitrary -- regionDTOName :: Text
    <*> arbitraryReduced n -- regionDTOType :: RegionType
    <*> arbitraryReducedMaybe n -- regionDTOParent :: Maybe RegionDTO
    <*> arbitraryReducedMaybe n -- regionDTOChildren :: Maybe [RegionDTO]
  
instance Arbitrary RegionalModelInfoDTO where
  arbitrary = sized genRegionalModelInfoDTO

genRegionalModelInfoDTO :: Int -> Gen RegionalModelInfoDTO
genRegionalModelInfoDTO n =
  RegionalModelInfoDTO
    <$> arbitraryReducedMaybe n -- regionalModelInfoDTOCurrency :: Maybe CurrencyType
    <*> arbitraryReducedMaybe n -- regionalModelInfoDTORegionId :: Maybe Integer
  
instance Arbitrary RejectedPromoOfferDeleteDTO where
  arbitrary = sized genRejectedPromoOfferDeleteDTO

genRejectedPromoOfferDeleteDTO :: Int -> Gen RejectedPromoOfferDeleteDTO
genRejectedPromoOfferDeleteDTO n =
  RejectedPromoOfferDeleteDTO
    <$> arbitrary -- rejectedPromoOfferDeleteDTOOfferId :: Text
    <*> arbitraryReduced n -- rejectedPromoOfferDeleteDTOReason :: RejectedPromoOfferDeleteReasonType
  
instance Arbitrary RejectedPromoOfferUpdateDTO where
  arbitrary = sized genRejectedPromoOfferUpdateDTO

genRejectedPromoOfferUpdateDTO :: Int -> Gen RejectedPromoOfferUpdateDTO
genRejectedPromoOfferUpdateDTO n =
  RejectedPromoOfferUpdateDTO
    <$> arbitrary -- rejectedPromoOfferUpdateDTOOfferId :: Text
    <*> arbitraryReduced n -- rejectedPromoOfferUpdateDTOReason :: RejectedPromoOfferUpdateReasonType
  
instance Arbitrary ReportInfoDTO where
  arbitrary = sized genReportInfoDTO

genReportInfoDTO :: Int -> Gen ReportInfoDTO
genReportInfoDTO n =
  ReportInfoDTO
    <$> arbitraryReduced n -- reportInfoDTOStatus :: ReportStatusType
    <*> arbitraryReducedMaybe n -- reportInfoDTOSubStatus :: Maybe ReportSubStatusType
    <*> arbitraryReduced n -- reportInfoDTOGenerationRequestedAt :: DateTime
    <*> arbitraryReducedMaybe n -- reportInfoDTOGenerationFinishedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- reportInfoDTOFile :: Maybe Text
    <*> arbitraryReducedMaybe n -- reportInfoDTOEstimatedGenerationTime :: Maybe Integer
  
instance Arbitrary ReturnDTO where
  arbitrary = sized genReturnDTO

genReturnDTO :: Int -> Gen ReturnDTO
genReturnDTO n =
  ReturnDTO
    <$> arbitraryReducedMaybe n -- returnDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- returnDTOOrderId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- returnDTOCreationDate :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- returnDTOUpdateDate :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- returnDTORefundStatus :: Maybe RefundStatusType
    <*> arbitraryReducedMaybe n -- returnDTOLogisticPickupPoint :: Maybe LogisticPickupPointDTO
    <*> arbitraryReducedMaybe n -- returnDTOShipmentRecipientType :: Maybe RecipientType
    <*> arbitraryReducedMaybe n -- returnDTOShipmentStatus :: Maybe ReturnShipmentStatusType
    <*> arbitraryReducedMaybe n -- returnDTORefundAmount :: Maybe Integer
    <*> arbitraryReduced n -- returnDTOItems :: [ReturnItemDTO]
    <*> arbitraryReducedMaybe n -- returnDTOReturnType :: Maybe ReturnType
    <*> arbitraryReducedMaybe n -- returnDTOFastReturn :: Maybe Bool
  
instance Arbitrary ReturnDecisionDTO where
  arbitrary = sized genReturnDecisionDTO

genReturnDecisionDTO :: Int -> Gen ReturnDecisionDTO
genReturnDecisionDTO n =
  ReturnDecisionDTO
    <$> arbitraryReducedMaybe n -- returnDecisionDTOReturnItemId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- returnDecisionDTOCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- returnDecisionDTOComment :: Maybe Text
    <*> arbitraryReducedMaybe n -- returnDecisionDTOReasonType :: Maybe ReturnDecisionReasonType
    <*> arbitraryReducedMaybe n -- returnDecisionDTOSubreasonType :: Maybe ReturnDecisionSubreasonType
    <*> arbitraryReducedMaybe n -- returnDecisionDTODecisionType :: Maybe ReturnDecisionType
    <*> arbitraryReducedMaybe n -- returnDecisionDTORefundAmount :: Maybe Integer
    <*> arbitraryReducedMaybe n -- returnDecisionDTOPartnerCompensation :: Maybe Integer
    <*> arbitraryReducedMaybe n -- returnDecisionDTOImages :: Maybe [Text]
  
instance Arbitrary ReturnInstanceDTO where
  arbitrary = sized genReturnInstanceDTO

genReturnInstanceDTO :: Int -> Gen ReturnInstanceDTO
genReturnInstanceDTO n =
  ReturnInstanceDTO
    <$> arbitraryReducedMaybe n -- returnInstanceDTOStockType :: Maybe ReturnInstanceStockType
    <*> arbitraryReducedMaybe n -- returnInstanceDTOStatus :: Maybe ReturnInstanceStatusType
    <*> arbitraryReducedMaybe n -- returnInstanceDTOCis :: Maybe Text
    <*> arbitraryReducedMaybe n -- returnInstanceDTOImei :: Maybe Text
  
instance Arbitrary ReturnItemDTO where
  arbitrary = sized genReturnItemDTO

genReturnItemDTO :: Int -> Gen ReturnItemDTO
genReturnItemDTO n =
  ReturnItemDTO
    <$> arbitraryReducedMaybe n -- returnItemDTOMarketSku :: Maybe Integer
    <*> arbitrary -- returnItemDTOShopSku :: Text
    <*> arbitrary -- returnItemDTOCount :: Integer
    <*> arbitraryReducedMaybe n -- returnItemDTODecisions :: Maybe [ReturnDecisionDTO]
    <*> arbitraryReducedMaybe n -- returnItemDTOInstances :: Maybe [ReturnInstanceDTO]
    <*> arbitraryReducedMaybe n -- returnItemDTOTracks :: Maybe [TrackDTO]
  
instance Arbitrary ScrollingPagerDTO where
  arbitrary = sized genScrollingPagerDTO

genScrollingPagerDTO :: Int -> Gen ScrollingPagerDTO
genScrollingPagerDTO n =
  ScrollingPagerDTO
    <$> arbitraryReducedMaybe n -- scrollingPagerDTONextPageToken :: Maybe Text
    <*> arbitraryReducedMaybe n -- scrollingPagerDTOPrevPageToken :: Maybe Text
  
instance Arbitrary SearchModelsResponse where
  arbitrary = sized genSearchModelsResponse

genSearchModelsResponse :: Int -> Gen SearchModelsResponse
genSearchModelsResponse n =
  SearchModelsResponse
    <$> arbitraryReduced n -- searchModelsResponseModels :: [ModelDTO]
    <*> arbitraryReducedMaybe n -- searchModelsResponseCurrency :: Maybe CurrencyType
    <*> arbitraryReducedMaybe n -- searchModelsResponseRegionId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- searchModelsResponsePager :: Maybe FlippingPagerDTO
  
instance Arbitrary SearchShipmentsRequest where
  arbitrary = sized genSearchShipmentsRequest

genSearchShipmentsRequest :: Int -> Gen SearchShipmentsRequest
genSearchShipmentsRequest n =
  SearchShipmentsRequest
    <$> arbitraryReduced n -- searchShipmentsRequestDateFrom :: Date
    <*> arbitraryReduced n -- searchShipmentsRequestDateTo :: Date
    <*> arbitraryReducedMaybe n -- searchShipmentsRequestStatuses :: Maybe [ShipmentStatusType]
    <*> arbitraryReducedMaybe n -- searchShipmentsRequestOrderIds :: Maybe [Integer]
    <*> arbitraryReducedMaybe n -- searchShipmentsRequestCancelledOrders :: Maybe Bool
  
instance Arbitrary SearchShipmentsResponse where
  arbitrary = sized genSearchShipmentsResponse

genSearchShipmentsResponse :: Int -> Gen SearchShipmentsResponse
genSearchShipmentsResponse n =
  SearchShipmentsResponse
    <$> arbitraryReducedMaybe n -- searchShipmentsResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- searchShipmentsResponseResult :: Maybe SearchShipmentsResponseDTO
  
instance Arbitrary SearchShipmentsResponseDTO where
  arbitrary = sized genSearchShipmentsResponseDTO

genSearchShipmentsResponseDTO :: Int -> Gen SearchShipmentsResponseDTO
genSearchShipmentsResponseDTO n =
  SearchShipmentsResponseDTO
    <$> arbitraryReduced n -- searchShipmentsResponseDTOShipments :: [ShipmentInfoDTO]
    <*> arbitraryReducedMaybe n -- searchShipmentsResponseDTOPaging :: Maybe ForwardScrollingPagerDTO
  
instance Arbitrary SendMessageToChatRequest where
  arbitrary = sized genSendMessageToChatRequest

genSendMessageToChatRequest :: Int -> Gen SendMessageToChatRequest
genSendMessageToChatRequest n =
  SendMessageToChatRequest
    <$> arbitrary -- sendMessageToChatRequestMessage :: Text
  
instance Arbitrary SetFeedParamsRequest where
  arbitrary = sized genSetFeedParamsRequest

genSetFeedParamsRequest :: Int -> Gen SetFeedParamsRequest
genSetFeedParamsRequest n =
  SetFeedParamsRequest
    <$> arbitraryReduced n -- setFeedParamsRequestParameters :: [FeedParameterDTO]
  
instance Arbitrary SetOrderBoxLayoutRequest where
  arbitrary = sized genSetOrderBoxLayoutRequest

genSetOrderBoxLayoutRequest :: Int -> Gen SetOrderBoxLayoutRequest
genSetOrderBoxLayoutRequest n =
  SetOrderBoxLayoutRequest
    <$> arbitraryReduced n -- setOrderBoxLayoutRequestBoxes :: [OrderBoxLayoutDTO]
    <*> arbitraryReducedMaybe n -- setOrderBoxLayoutRequestAllowRemove :: Maybe Bool
  
instance Arbitrary SetOrderBoxLayoutResponse where
  arbitrary = sized genSetOrderBoxLayoutResponse

genSetOrderBoxLayoutResponse :: Int -> Gen SetOrderBoxLayoutResponse
genSetOrderBoxLayoutResponse n =
  SetOrderBoxLayoutResponse
    <$> arbitraryReducedMaybe n -- setOrderBoxLayoutResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- setOrderBoxLayoutResponseResult :: Maybe OrderBoxesLayoutDTO
  
instance Arbitrary SetOrderDeliveryDateRequest where
  arbitrary = sized genSetOrderDeliveryDateRequest

genSetOrderDeliveryDateRequest :: Int -> Gen SetOrderDeliveryDateRequest
genSetOrderDeliveryDateRequest n =
  SetOrderDeliveryDateRequest
    <$> arbitraryReduced n -- setOrderDeliveryDateRequestDates :: OrderDeliveryDateDTO
    <*> arbitraryReduced n -- setOrderDeliveryDateRequestReason :: OrderDeliveryDateReasonType
  
instance Arbitrary SetOrderDeliveryTrackCodeRequest where
  arbitrary = sized genSetOrderDeliveryTrackCodeRequest

genSetOrderDeliveryTrackCodeRequest :: Int -> Gen SetOrderDeliveryTrackCodeRequest
genSetOrderDeliveryTrackCodeRequest n =
  SetOrderDeliveryTrackCodeRequest
    <$> arbitrary -- setOrderDeliveryTrackCodeRequestTrackCode :: Text
    <*> arbitrary -- setOrderDeliveryTrackCodeRequestDeliveryServiceId :: Integer
  
instance Arbitrary SetOrderShipmentBoxesRequest where
  arbitrary = sized genSetOrderShipmentBoxesRequest

genSetOrderShipmentBoxesRequest :: Int -> Gen SetOrderShipmentBoxesRequest
genSetOrderShipmentBoxesRequest n =
  SetOrderShipmentBoxesRequest
    <$> arbitraryReduced n -- setOrderShipmentBoxesRequestBoxes :: [ParcelBoxDTO]
  
instance Arbitrary SetOrderShipmentBoxesResponse where
  arbitrary = sized genSetOrderShipmentBoxesResponse

genSetOrderShipmentBoxesResponse :: Int -> Gen SetOrderShipmentBoxesResponse
genSetOrderShipmentBoxesResponse n =
  SetOrderShipmentBoxesResponse
    <$> arbitraryReducedMaybe n -- setOrderShipmentBoxesResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- setOrderShipmentBoxesResponseResult :: Maybe ShipmentBoxesDTO
  
instance Arbitrary SetReturnDecisionRequest where
  arbitrary = sized genSetReturnDecisionRequest

genSetReturnDecisionRequest :: Int -> Gen SetReturnDecisionRequest
genSetReturnDecisionRequest n =
  SetReturnDecisionRequest
    <$> arbitrary -- setReturnDecisionRequestReturnItemId :: Integer
    <*> arbitraryReduced n -- setReturnDecisionRequestDecisionType :: ReturnRequestDecisionType
    <*> arbitraryReducedMaybe n -- setReturnDecisionRequestComment :: Maybe Text
  
instance Arbitrary SetShipmentPalletsCountRequest where
  arbitrary = sized genSetShipmentPalletsCountRequest

genSetShipmentPalletsCountRequest :: Int -> Gen SetShipmentPalletsCountRequest
genSetShipmentPalletsCountRequest n =
  SetShipmentPalletsCountRequest
    <$> arbitrary -- setShipmentPalletsCountRequestPlacesCount :: Int
  
instance Arbitrary ShipmentBoxesDTO where
  arbitrary = sized genShipmentBoxesDTO

genShipmentBoxesDTO :: Int -> Gen ShipmentBoxesDTO
genShipmentBoxesDTO n =
  ShipmentBoxesDTO
    <$> arbitraryReduced n -- shipmentBoxesDTOBoxes :: [ParcelBoxDTO]
  
instance Arbitrary ShipmentDTO where
  arbitrary = sized genShipmentDTO

genShipmentDTO :: Int -> Gen ShipmentDTO
genShipmentDTO n =
  ShipmentDTO
    <$> arbitraryReducedMaybe n -- shipmentDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- shipmentDTOPlanIntervalFrom :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- shipmentDTOPlanIntervalTo :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- shipmentDTOShipmentType :: Maybe ShipmentType
    <*> arbitraryReducedMaybe n -- shipmentDTOWarehouse :: Maybe PartnerShipmentWarehouseDTO
    <*> arbitraryReducedMaybe n -- shipmentDTOWarehouseTo :: Maybe PartnerShipmentWarehouseDTO
    <*> arbitraryReducedMaybe n -- shipmentDTOExternalId :: Maybe Text
    <*> arbitraryReducedMaybe n -- shipmentDTODeliveryService :: Maybe DeliveryServiceDTO
    <*> arbitraryReducedMaybe n -- shipmentDTOPalletsCount :: Maybe PalletsCountDTO
    <*> arbitrary -- shipmentDTOOrderIds :: [Integer]
    <*> arbitraryReducedMaybe n -- shipmentDTODraftCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- shipmentDTOPlannedCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- shipmentDTOFactCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- shipmentDTOCurrentStatus :: Maybe ShipmentStatusChangeDTO
    <*> arbitraryReduced n -- shipmentDTOAvailableActions :: [ShipmentActionType]
  
instance Arbitrary ShipmentInfoDTO where
  arbitrary = sized genShipmentInfoDTO

genShipmentInfoDTO :: Int -> Gen ShipmentInfoDTO
genShipmentInfoDTO n =
  ShipmentInfoDTO
    <$> arbitraryReducedMaybe n -- shipmentInfoDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- shipmentInfoDTOPlanIntervalFrom :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- shipmentInfoDTOPlanIntervalTo :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- shipmentInfoDTOShipmentType :: Maybe ShipmentType
    <*> arbitraryReducedMaybe n -- shipmentInfoDTOWarehouse :: Maybe PartnerShipmentWarehouseDTO
    <*> arbitraryReducedMaybe n -- shipmentInfoDTOWarehouseTo :: Maybe PartnerShipmentWarehouseDTO
    <*> arbitraryReducedMaybe n -- shipmentInfoDTOExternalId :: Maybe Text
    <*> arbitraryReducedMaybe n -- shipmentInfoDTODeliveryService :: Maybe DeliveryServiceDTO
    <*> arbitraryReducedMaybe n -- shipmentInfoDTOPalletsCount :: Maybe PalletsCountDTO
    <*> arbitrary -- shipmentInfoDTOOrderIds :: [Integer]
    <*> arbitraryReducedMaybe n -- shipmentInfoDTODraftCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- shipmentInfoDTOPlannedCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- shipmentInfoDTOFactCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- shipmentInfoDTOStatus :: Maybe ShipmentStatusType
    <*> arbitraryReducedMaybe n -- shipmentInfoDTOStatusDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- shipmentInfoDTOStatusUpdateTime :: Maybe DateTime
  
instance Arbitrary ShipmentStatusChangeDTO where
  arbitrary = sized genShipmentStatusChangeDTO

genShipmentStatusChangeDTO :: Int -> Gen ShipmentStatusChangeDTO
genShipmentStatusChangeDTO n =
  ShipmentStatusChangeDTO
    <$> arbitraryReducedMaybe n -- shipmentStatusChangeDTOStatus :: Maybe ShipmentStatusType
    <*> arbitraryReducedMaybe n -- shipmentStatusChangeDTODescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- shipmentStatusChangeDTOUpdateTime :: Maybe DateTime
  
instance Arbitrary SkipGoodsFeedbackReactionRequest where
  arbitrary = sized genSkipGoodsFeedbackReactionRequest

genSkipGoodsFeedbackReactionRequest :: Int -> Gen SkipGoodsFeedbackReactionRequest
genSkipGoodsFeedbackReactionRequest n =
  SkipGoodsFeedbackReactionRequest
    <$> arbitrary -- skipGoodsFeedbackReactionRequestFeedbackIds :: [Integer]
  
instance Arbitrary SkuBidItemDTO where
  arbitrary = sized genSkuBidItemDTO

genSkuBidItemDTO :: Int -> Gen SkuBidItemDTO
genSkuBidItemDTO n =
  SkuBidItemDTO
    <$> arbitrary -- skuBidItemDTOSku :: Text
    <*> arbitrary -- skuBidItemDTOBid :: Int
  
instance Arbitrary SkuBidRecommendationItemDTO where
  arbitrary = sized genSkuBidRecommendationItemDTO

genSkuBidRecommendationItemDTO :: Int -> Gen SkuBidRecommendationItemDTO
genSkuBidRecommendationItemDTO n =
  SkuBidRecommendationItemDTO
    <$> arbitrary -- skuBidRecommendationItemDTOSku :: Text
    <*> arbitrary -- skuBidRecommendationItemDTOBid :: Int
    <*> arbitraryReducedMaybe n -- skuBidRecommendationItemDTOBidRecommendations :: Maybe [BidRecommendationItemDTO]
    <*> arbitraryReducedMaybe n -- skuBidRecommendationItemDTOPriceRecommendations :: Maybe [PriceRecommendationItemDTO]
  
instance Arbitrary SuggestOfferPriceDTO where
  arbitrary = sized genSuggestOfferPriceDTO

genSuggestOfferPriceDTO :: Int -> Gen SuggestOfferPriceDTO
genSuggestOfferPriceDTO n =
  SuggestOfferPriceDTO
    <$> arbitraryReducedMaybe n -- suggestOfferPriceDTOOfferId :: Maybe Text
    <*> arbitraryReducedMaybe n -- suggestOfferPriceDTOMarketSku :: Maybe Integer
  
instance Arbitrary SuggestPricesRequest where
  arbitrary = sized genSuggestPricesRequest

genSuggestPricesRequest :: Int -> Gen SuggestPricesRequest
genSuggestPricesRequest n =
  SuggestPricesRequest
    <$> arbitraryReduced n -- suggestPricesRequestOffers :: [SuggestOfferPriceDTO]
  
instance Arbitrary SuggestPricesResponse where
  arbitrary = sized genSuggestPricesResponse

genSuggestPricesResponse :: Int -> Gen SuggestPricesResponse
genSuggestPricesResponse n =
  SuggestPricesResponse
    <$> arbitraryReducedMaybe n -- suggestPricesResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- suggestPricesResponseResult :: Maybe SuggestPricesResultDTO
  
instance Arbitrary SuggestPricesResultDTO where
  arbitrary = sized genSuggestPricesResultDTO

genSuggestPricesResultDTO :: Int -> Gen SuggestPricesResultDTO
genSuggestPricesResultDTO n =
  SuggestPricesResultDTO
    <$> arbitraryReduced n -- suggestPricesResultDTOOffers :: [PriceSuggestOfferDTO]
  
instance Arbitrary SuggestedOfferDTO where
  arbitrary = sized genSuggestedOfferDTO

genSuggestedOfferDTO :: Int -> Gen SuggestedOfferDTO
genSuggestedOfferDTO n =
  SuggestedOfferDTO
    <$> arbitraryReducedMaybe n -- suggestedOfferDTOOfferId :: Maybe Text
    <*> arbitraryReducedMaybe n -- suggestedOfferDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- suggestedOfferDTOCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- suggestedOfferDTOVendor :: Maybe Text
    <*> arbitraryReducedMaybe n -- suggestedOfferDTOBarcodes :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- suggestedOfferDTODescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- suggestedOfferDTOVendorCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- suggestedOfferDTOBasicPrice :: Maybe BasePriceDTO
  
instance Arbitrary SuggestedOfferMappingDTO where
  arbitrary = sized genSuggestedOfferMappingDTO

genSuggestedOfferMappingDTO :: Int -> Gen SuggestedOfferMappingDTO
genSuggestedOfferMappingDTO n =
  SuggestedOfferMappingDTO
    <$> arbitraryReducedMaybe n -- suggestedOfferMappingDTOOffer :: Maybe SuggestedOfferDTO
    <*> arbitraryReducedMaybe n -- suggestedOfferMappingDTOMapping :: Maybe GetMappingDTO
  
instance Arbitrary TariffDTO where
  arbitrary = sized genTariffDTO

genTariffDTO :: Int -> Gen TariffDTO
genTariffDTO n =
  TariffDTO
    <$> arbitraryReduced n -- tariffDTOType :: TariffType
    <*> arbitraryReducedMaybe n -- tariffDTOPercent :: Maybe Double
    <*> arbitrary -- tariffDTOAmount :: Double
    <*> arbitraryReduced n -- tariffDTOParameters :: [TariffParameterDTO]
  
instance Arbitrary TariffParameterDTO where
  arbitrary = sized genTariffParameterDTO

genTariffParameterDTO :: Int -> Gen TariffParameterDTO
genTariffParameterDTO n =
  TariffParameterDTO
    <$> arbitrary -- tariffParameterDTOName :: Text
    <*> arbitrary -- tariffParameterDTOValue :: Text
  
instance Arbitrary TimePeriodDTO where
  arbitrary = sized genTimePeriodDTO

genTimePeriodDTO :: Int -> Gen TimePeriodDTO
genTimePeriodDTO n =
  TimePeriodDTO
    <$> arbitrary -- timePeriodDTOTimePeriod :: Int
    <*> arbitraryReduced n -- timePeriodDTOTimeUnit :: TimeUnitType
    <*> arbitraryReducedMaybe n -- timePeriodDTOComment :: Maybe Text
  
instance Arbitrary TrackDTO where
  arbitrary = sized genTrackDTO

genTrackDTO :: Int -> Gen TrackDTO
genTrackDTO n =
  TrackDTO
    <$> arbitraryReducedMaybe n -- trackDTOTrackCode :: Maybe Text
  
instance Arbitrary TransferOrdersFromShipmentRequest where
  arbitrary = sized genTransferOrdersFromShipmentRequest

genTransferOrdersFromShipmentRequest :: Int -> Gen TransferOrdersFromShipmentRequest
genTransferOrdersFromShipmentRequest n =
  TransferOrdersFromShipmentRequest
    <$> arbitrary -- transferOrdersFromShipmentRequestOrderIds :: [Integer]
  
instance Arbitrary TurnoverDTO where
  arbitrary = sized genTurnoverDTO

genTurnoverDTO :: Int -> Gen TurnoverDTO
genTurnoverDTO n =
  TurnoverDTO
    <$> arbitraryReduced n -- turnoverDTOTurnover :: TurnoverType
    <*> arbitraryReducedMaybe n -- turnoverDTOTurnoverDays :: Maybe Double
  
instance Arbitrary UnitDTO where
  arbitrary = sized genUnitDTO

genUnitDTO :: Int -> Gen UnitDTO
genUnitDTO n =
  UnitDTO
    <$> arbitrary -- unitDTOId :: Integer
    <*> arbitrary -- unitDTOName :: Text
    <*> arbitrary -- unitDTOFullName :: Text
  
instance Arbitrary UpdateBusinessOfferPriceDTO where
  arbitrary = sized genUpdateBusinessOfferPriceDTO

genUpdateBusinessOfferPriceDTO :: Int -> Gen UpdateBusinessOfferPriceDTO
genUpdateBusinessOfferPriceDTO n =
  UpdateBusinessOfferPriceDTO
    <$> arbitrary -- updateBusinessOfferPriceDTOOfferId :: Text
    <*> arbitraryReduced n -- updateBusinessOfferPriceDTOPrice :: UpdatePriceWithDiscountDTO
  
instance Arbitrary UpdateBusinessPricesRequest where
  arbitrary = sized genUpdateBusinessPricesRequest

genUpdateBusinessPricesRequest :: Int -> Gen UpdateBusinessPricesRequest
genUpdateBusinessPricesRequest n =
  UpdateBusinessPricesRequest
    <$> arbitraryReduced n -- updateBusinessPricesRequestOffers :: [UpdateBusinessOfferPriceDTO]
  
instance Arbitrary UpdateCampaignOfferDTO where
  arbitrary = sized genUpdateCampaignOfferDTO

genUpdateCampaignOfferDTO :: Int -> Gen UpdateCampaignOfferDTO
genUpdateCampaignOfferDTO n =
  UpdateCampaignOfferDTO
    <$> arbitrary -- updateCampaignOfferDTOOfferId :: Text
    <*> arbitraryReducedMaybe n -- updateCampaignOfferDTOQuantum :: Maybe QuantumDTO
    <*> arbitraryReducedMaybe n -- updateCampaignOfferDTOAvailable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- updateCampaignOfferDTOVat :: Maybe Int
  
instance Arbitrary UpdateCampaignOffersRequest where
  arbitrary = sized genUpdateCampaignOffersRequest

genUpdateCampaignOffersRequest :: Int -> Gen UpdateCampaignOffersRequest
genUpdateCampaignOffersRequest n =
  UpdateCampaignOffersRequest
    <$> arbitraryReduced n -- updateCampaignOffersRequestOffers :: [UpdateCampaignOfferDTO]
  
instance Arbitrary UpdateGoodsFeedbackCommentDTO where
  arbitrary = sized genUpdateGoodsFeedbackCommentDTO

genUpdateGoodsFeedbackCommentDTO :: Int -> Gen UpdateGoodsFeedbackCommentDTO
genUpdateGoodsFeedbackCommentDTO n =
  UpdateGoodsFeedbackCommentDTO
    <$> arbitraryReducedMaybe n -- updateGoodsFeedbackCommentDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- updateGoodsFeedbackCommentDTOParentId :: Maybe Integer
    <*> arbitrary -- updateGoodsFeedbackCommentDTOText :: Text
  
instance Arbitrary UpdateGoodsFeedbackCommentRequest where
  arbitrary = sized genUpdateGoodsFeedbackCommentRequest

genUpdateGoodsFeedbackCommentRequest :: Int -> Gen UpdateGoodsFeedbackCommentRequest
genUpdateGoodsFeedbackCommentRequest n =
  UpdateGoodsFeedbackCommentRequest
    <$> arbitrary -- updateGoodsFeedbackCommentRequestFeedbackId :: Integer
    <*> arbitraryReduced n -- updateGoodsFeedbackCommentRequestComment :: UpdateGoodsFeedbackCommentDTO
  
instance Arbitrary UpdateGoodsFeedbackCommentResponse where
  arbitrary = sized genUpdateGoodsFeedbackCommentResponse

genUpdateGoodsFeedbackCommentResponse :: Int -> Gen UpdateGoodsFeedbackCommentResponse
genUpdateGoodsFeedbackCommentResponse n =
  UpdateGoodsFeedbackCommentResponse
    <$> arbitraryReducedMaybe n -- updateGoodsFeedbackCommentResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- updateGoodsFeedbackCommentResponseResult :: Maybe GoodsFeedbackCommentDTO
  
instance Arbitrary UpdateMappingDTO where
  arbitrary = sized genUpdateMappingDTO

genUpdateMappingDTO :: Int -> Gen UpdateMappingDTO
genUpdateMappingDTO n =
  UpdateMappingDTO
    <$> arbitraryReducedMaybe n -- updateMappingDTOMarketSku :: Maybe Integer
  
instance Arbitrary UpdateMappingsOfferDTO where
  arbitrary = sized genUpdateMappingsOfferDTO

genUpdateMappingsOfferDTO :: Int -> Gen UpdateMappingsOfferDTO
genUpdateMappingsOfferDTO n =
  UpdateMappingsOfferDTO
    <$> arbitraryReducedMaybe n -- updateMappingsOfferDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOShopSku :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOVendor :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOVendorCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTODescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOId :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOFeedId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOBarcodes :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOUrls :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOPictures :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOManufacturer :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOManufacturerCountries :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOMinShipment :: Maybe Int
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOTransportUnitSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOQuantumOfSupply :: Maybe Int
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTODeliveryDurationDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOBoxCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOCustomsCommodityCodes :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOWeightDimensions :: Maybe OfferWeightDimensionsDTO
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOSupplyScheduleDays :: Maybe [DayOfWeekType]
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOShelfLifeDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOLifeTimeDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOGuaranteePeriodDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOProcessingState :: Maybe OfferProcessingStateDTO
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOAvailability :: Maybe OfferAvailabilityStatusType
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOShelfLife :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOLifeTime :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOGuaranteePeriod :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- updateMappingsOfferDTOCertificate :: Maybe Text
  
instance Arbitrary UpdateOfferContentRequest where
  arbitrary = sized genUpdateOfferContentRequest

genUpdateOfferContentRequest :: Int -> Gen UpdateOfferContentRequest
genUpdateOfferContentRequest n =
  UpdateOfferContentRequest
    <$> arbitraryReduced n -- updateOfferContentRequestOffersContent :: [OfferContentDTO]
  
instance Arbitrary UpdateOfferContentResponse where
  arbitrary = sized genUpdateOfferContentResponse

genUpdateOfferContentResponse :: Int -> Gen UpdateOfferContentResponse
genUpdateOfferContentResponse n =
  UpdateOfferContentResponse
    <$> arbitraryReducedMaybe n -- updateOfferContentResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- updateOfferContentResponseResults :: Maybe [UpdateOfferContentResultDTO]
  
instance Arbitrary UpdateOfferContentResultDTO where
  arbitrary = sized genUpdateOfferContentResultDTO

genUpdateOfferContentResultDTO :: Int -> Gen UpdateOfferContentResultDTO
genUpdateOfferContentResultDTO n =
  UpdateOfferContentResultDTO
    <$> arbitrary -- updateOfferContentResultDTOOfferId :: Text
    <*> arbitraryReducedMaybe n -- updateOfferContentResultDTOErrors :: Maybe [OfferContentErrorDTO]
    <*> arbitraryReducedMaybe n -- updateOfferContentResultDTOWarnings :: Maybe [OfferContentErrorDTO]
  
instance Arbitrary UpdateOfferDTO where
  arbitrary = sized genUpdateOfferDTO

genUpdateOfferDTO :: Int -> Gen UpdateOfferDTO
genUpdateOfferDTO n =
  UpdateOfferDTO
    <$> arbitrary -- updateOfferDTOOfferId :: Text
    <*> arbitraryReducedMaybe n -- updateOfferDTOName :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateOfferDTOMarketCategoryId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- updateOfferDTOCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateOfferDTOPictures :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- updateOfferDTOVideos :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- updateOfferDTOManuals :: Maybe [OfferManualDTO]
    <*> arbitraryReducedMaybe n -- updateOfferDTOVendor :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateOfferDTOBarcodes :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- updateOfferDTODescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateOfferDTOManufacturerCountries :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- updateOfferDTOWeightDimensions :: Maybe OfferWeightDimensionsDTO
    <*> arbitraryReducedMaybe n -- updateOfferDTOVendorCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateOfferDTOTags :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- updateOfferDTOShelfLife :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- updateOfferDTOLifeTime :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- updateOfferDTOGuaranteePeriod :: Maybe TimePeriodDTO
    <*> arbitraryReducedMaybe n -- updateOfferDTOCustomsCommodityCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- updateOfferDTOCertificates :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- updateOfferDTOBoxCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- updateOfferDTOCondition :: Maybe OfferConditionDTO
    <*> arbitraryReducedMaybe n -- updateOfferDTOType :: Maybe OfferType
    <*> arbitraryReducedMaybe n -- updateOfferDTODownloadable :: Maybe Bool
    <*> arbitraryReducedMaybe n -- updateOfferDTOAdult :: Maybe Bool
    <*> arbitraryReducedMaybe n -- updateOfferDTOAge :: Maybe AgeDTO
    <*> arbitraryReducedMaybe n -- updateOfferDTOParams :: Maybe [OfferParamDTO]
    <*> arbitraryReducedMaybe n -- updateOfferDTOParameterValues :: Maybe [ParameterValueDTO]
    <*> arbitraryReducedMaybe n -- updateOfferDTOBasicPrice :: Maybe UpdatePriceWithDiscountDTO
    <*> arbitraryReducedMaybe n -- updateOfferDTOPurchasePrice :: Maybe BasePriceDTO
    <*> arbitraryReducedMaybe n -- updateOfferDTOAdditionalExpenses :: Maybe BasePriceDTO
    <*> arbitraryReducedMaybe n -- updateOfferDTOCofinancePrice :: Maybe BasePriceDTO
  
instance Arbitrary UpdateOfferMappingDTO where
  arbitrary = sized genUpdateOfferMappingDTO

genUpdateOfferMappingDTO :: Int -> Gen UpdateOfferMappingDTO
genUpdateOfferMappingDTO n =
  UpdateOfferMappingDTO
    <$> arbitraryReduced n -- updateOfferMappingDTOOffer :: UpdateOfferDTO
    <*> arbitraryReducedMaybe n -- updateOfferMappingDTOMapping :: Maybe UpdateMappingDTO
  
instance Arbitrary UpdateOfferMappingEntryDTO where
  arbitrary = sized genUpdateOfferMappingEntryDTO

genUpdateOfferMappingEntryDTO :: Int -> Gen UpdateOfferMappingEntryDTO
genUpdateOfferMappingEntryDTO n =
  UpdateOfferMappingEntryDTO
    <$> arbitraryReducedMaybe n -- updateOfferMappingEntryDTOMapping :: Maybe OfferMappingDTO
    <*> arbitraryReducedMaybe n -- updateOfferMappingEntryDTOAwaitingModerationMapping :: Maybe OfferMappingDTO
    <*> arbitraryReducedMaybe n -- updateOfferMappingEntryDTORejectedMapping :: Maybe OfferMappingDTO
    <*> arbitraryReducedMaybe n -- updateOfferMappingEntryDTOOffer :: Maybe UpdateMappingsOfferDTO
  
instance Arbitrary UpdateOfferMappingEntryRequest where
  arbitrary = sized genUpdateOfferMappingEntryRequest

genUpdateOfferMappingEntryRequest :: Int -> Gen UpdateOfferMappingEntryRequest
genUpdateOfferMappingEntryRequest n =
  UpdateOfferMappingEntryRequest
    <$> arbitraryReduced n -- updateOfferMappingEntryRequestOfferMappingEntries :: [UpdateOfferMappingEntryDTO]
  
instance Arbitrary UpdateOfferMappingResultDTO where
  arbitrary = sized genUpdateOfferMappingResultDTO

genUpdateOfferMappingResultDTO :: Int -> Gen UpdateOfferMappingResultDTO
genUpdateOfferMappingResultDTO n =
  UpdateOfferMappingResultDTO
    <$> arbitrary -- updateOfferMappingResultDTOOfferId :: Text
    <*> arbitraryReducedMaybe n -- updateOfferMappingResultDTOErrors :: Maybe [OfferMappingErrorDTO]
    <*> arbitraryReducedMaybe n -- updateOfferMappingResultDTOWarnings :: Maybe [OfferMappingErrorDTO]
  
instance Arbitrary UpdateOfferMappingsRequest where
  arbitrary = sized genUpdateOfferMappingsRequest

genUpdateOfferMappingsRequest :: Int -> Gen UpdateOfferMappingsRequest
genUpdateOfferMappingsRequest n =
  UpdateOfferMappingsRequest
    <$> arbitraryReduced n -- updateOfferMappingsRequestOfferMappings :: [UpdateOfferMappingDTO]
    <*> arbitraryReducedMaybe n -- updateOfferMappingsRequestOnlyPartnerMediaContent :: Maybe Bool
  
instance Arbitrary UpdateOfferMappingsResponse where
  arbitrary = sized genUpdateOfferMappingsResponse

genUpdateOfferMappingsResponse :: Int -> Gen UpdateOfferMappingsResponse
genUpdateOfferMappingsResponse n =
  UpdateOfferMappingsResponse
    <$> arbitraryReducedMaybe n -- updateOfferMappingsResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- updateOfferMappingsResponseResults :: Maybe [UpdateOfferMappingResultDTO]
  
instance Arbitrary UpdateOrderItemRequest where
  arbitrary = sized genUpdateOrderItemRequest

genUpdateOrderItemRequest :: Int -> Gen UpdateOrderItemRequest
genUpdateOrderItemRequest n =
  UpdateOrderItemRequest
    <$> arbitraryReduced n -- updateOrderItemRequestItems :: [OrderItemModificationDTO]
    <*> arbitraryReducedMaybe n -- updateOrderItemRequestReason :: Maybe OrderItemsModificationRequestReasonType
  
instance Arbitrary UpdateOrderStatusDTO where
  arbitrary = sized genUpdateOrderStatusDTO

genUpdateOrderStatusDTO :: Int -> Gen UpdateOrderStatusDTO
genUpdateOrderStatusDTO n =
  UpdateOrderStatusDTO
    <$> arbitraryReducedMaybe n -- updateOrderStatusDTOId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- updateOrderStatusDTOStatus :: Maybe OrderStatusType
    <*> arbitraryReducedMaybe n -- updateOrderStatusDTOSubstatus :: Maybe OrderSubstatusType
    <*> arbitraryReducedMaybe n -- updateOrderStatusDTOUpdateStatus :: Maybe OrderUpdateStatusType
    <*> arbitraryReducedMaybe n -- updateOrderStatusDTOErrorDetails :: Maybe Text
  
instance Arbitrary UpdateOrderStatusRequest where
  arbitrary = sized genUpdateOrderStatusRequest

genUpdateOrderStatusRequest :: Int -> Gen UpdateOrderStatusRequest
genUpdateOrderStatusRequest n =
  UpdateOrderStatusRequest
    <$> arbitraryReduced n -- updateOrderStatusRequestOrder :: OrderStatusChangeDTO
  
instance Arbitrary UpdateOrderStatusResponse where
  arbitrary = sized genUpdateOrderStatusResponse

genUpdateOrderStatusResponse :: Int -> Gen UpdateOrderStatusResponse
genUpdateOrderStatusResponse n =
  UpdateOrderStatusResponse
    <$> arbitraryReducedMaybe n -- updateOrderStatusResponseOrder :: Maybe OrderDTO
  
instance Arbitrary UpdateOrderStatusesDTO where
  arbitrary = sized genUpdateOrderStatusesDTO

genUpdateOrderStatusesDTO :: Int -> Gen UpdateOrderStatusesDTO
genUpdateOrderStatusesDTO n =
  UpdateOrderStatusesDTO
    <$> arbitraryReduced n -- updateOrderStatusesDTOOrders :: [UpdateOrderStatusDTO]
  
instance Arbitrary UpdateOrderStatusesRequest where
  arbitrary = sized genUpdateOrderStatusesRequest

genUpdateOrderStatusesRequest :: Int -> Gen UpdateOrderStatusesRequest
genUpdateOrderStatusesRequest n =
  UpdateOrderStatusesRequest
    <$> arbitraryReduced n -- updateOrderStatusesRequestOrders :: [OrderStateDTO]
  
instance Arbitrary UpdateOrderStatusesResponse where
  arbitrary = sized genUpdateOrderStatusesResponse

genUpdateOrderStatusesResponse :: Int -> Gen UpdateOrderStatusesResponse
genUpdateOrderStatusesResponse n =
  UpdateOrderStatusesResponse
    <$> arbitraryReducedMaybe n -- updateOrderStatusesResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- updateOrderStatusesResponseResult :: Maybe UpdateOrderStatusesDTO
  
instance Arbitrary UpdateOrderStorageLimitRequest where
  arbitrary = sized genUpdateOrderStorageLimitRequest

genUpdateOrderStorageLimitRequest :: Int -> Gen UpdateOrderStorageLimitRequest
genUpdateOrderStorageLimitRequest n =
  UpdateOrderStorageLimitRequest
    <$> arbitraryReduced n -- updateOrderStorageLimitRequestNewDate :: Date
  
instance Arbitrary UpdateOutletLicenseRequest where
  arbitrary = sized genUpdateOutletLicenseRequest

genUpdateOutletLicenseRequest :: Int -> Gen UpdateOutletLicenseRequest
genUpdateOutletLicenseRequest n =
  UpdateOutletLicenseRequest
    <$> arbitraryReduced n -- updateOutletLicenseRequestLicenses :: [OutletLicenseDTO]
  
instance Arbitrary UpdatePriceWithDiscountDTO where
  arbitrary = sized genUpdatePriceWithDiscountDTO

genUpdatePriceWithDiscountDTO :: Int -> Gen UpdatePriceWithDiscountDTO
genUpdatePriceWithDiscountDTO n =
  UpdatePriceWithDiscountDTO
    <$> arbitrary -- updatePriceWithDiscountDTOValue :: Double
    <*> arbitraryReduced n -- updatePriceWithDiscountDTOCurrencyId :: CurrencyType
    <*> arbitraryReducedMaybe n -- updatePriceWithDiscountDTODiscountBase :: Maybe Double
  
instance Arbitrary UpdatePricesRequest where
  arbitrary = sized genUpdatePricesRequest

genUpdatePricesRequest :: Int -> Gen UpdatePricesRequest
genUpdatePricesRequest n =
  UpdatePricesRequest
    <$> arbitraryReduced n -- updatePricesRequestOffers :: [OfferPriceDTO]
  
instance Arbitrary UpdatePromoOfferDTO where
  arbitrary = sized genUpdatePromoOfferDTO

genUpdatePromoOfferDTO :: Int -> Gen UpdatePromoOfferDTO
genUpdatePromoOfferDTO n =
  UpdatePromoOfferDTO
    <$> arbitrary -- updatePromoOfferDTOOfferId :: Text
    <*> arbitraryReducedMaybe n -- updatePromoOfferDTOParams :: Maybe UpdatePromoOfferParamsDTO
  
instance Arbitrary UpdatePromoOfferDiscountParamsDTO where
  arbitrary = sized genUpdatePromoOfferDiscountParamsDTO

genUpdatePromoOfferDiscountParamsDTO :: Int -> Gen UpdatePromoOfferDiscountParamsDTO
genUpdatePromoOfferDiscountParamsDTO n =
  UpdatePromoOfferDiscountParamsDTO
    <$> arbitraryReducedMaybe n -- updatePromoOfferDiscountParamsDTOPrice :: Maybe Integer
    <*> arbitraryReducedMaybe n -- updatePromoOfferDiscountParamsDTOPromoPrice :: Maybe Integer
  
instance Arbitrary UpdatePromoOfferParamsDTO where
  arbitrary = sized genUpdatePromoOfferParamsDTO

genUpdatePromoOfferParamsDTO :: Int -> Gen UpdatePromoOfferParamsDTO
genUpdatePromoOfferParamsDTO n =
  UpdatePromoOfferParamsDTO
    <$> arbitraryReducedMaybe n -- updatePromoOfferParamsDTODiscountParams :: Maybe UpdatePromoOfferDiscountParamsDTO
  
instance Arbitrary UpdatePromoOffersRequest where
  arbitrary = sized genUpdatePromoOffersRequest

genUpdatePromoOffersRequest :: Int -> Gen UpdatePromoOffersRequest
genUpdatePromoOffersRequest n =
  UpdatePromoOffersRequest
    <$> arbitrary -- updatePromoOffersRequestPromoId :: Text
    <*> arbitraryReduced n -- updatePromoOffersRequestOffers :: [UpdatePromoOfferDTO]
  
instance Arbitrary UpdatePromoOffersResponse where
  arbitrary = sized genUpdatePromoOffersResponse

genUpdatePromoOffersResponse :: Int -> Gen UpdatePromoOffersResponse
genUpdatePromoOffersResponse n =
  UpdatePromoOffersResponse
    <$> arbitraryReducedMaybe n -- updatePromoOffersResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- updatePromoOffersResponseResult :: Maybe UpdatePromoOffersResultDTO
  
instance Arbitrary UpdatePromoOffersResultDTO where
  arbitrary = sized genUpdatePromoOffersResultDTO

genUpdatePromoOffersResultDTO :: Int -> Gen UpdatePromoOffersResultDTO
genUpdatePromoOffersResultDTO n =
  UpdatePromoOffersResultDTO
    <$> arbitraryReducedMaybe n -- updatePromoOffersResultDTORejectedOffers :: Maybe [RejectedPromoOfferUpdateDTO]
    <*> arbitraryReducedMaybe n -- updatePromoOffersResultDTOWarningOffers :: Maybe [WarningPromoOfferUpdateDTO]
  
instance Arbitrary UpdateStockDTO where
  arbitrary = sized genUpdateStockDTO

genUpdateStockDTO :: Int -> Gen UpdateStockDTO
genUpdateStockDTO n =
  UpdateStockDTO
    <$> arbitrary -- updateStockDTOSku :: Text
    <*> arbitraryReduced n -- updateStockDTOItems :: [UpdateStockItemDTO]
  
instance Arbitrary UpdateStockItemDTO where
  arbitrary = sized genUpdateStockItemDTO

genUpdateStockItemDTO :: Int -> Gen UpdateStockItemDTO
genUpdateStockItemDTO n =
  UpdateStockItemDTO
    <$> arbitrary -- updateStockItemDTOCount :: Integer
    <*> arbitraryReducedMaybe n -- updateStockItemDTOUpdatedAt :: Maybe DateTime
  
instance Arbitrary UpdateStocksRequest where
  arbitrary = sized genUpdateStocksRequest

genUpdateStocksRequest :: Int -> Gen UpdateStocksRequest
genUpdateStocksRequest n =
  UpdateStocksRequest
    <$> arbitraryReduced n -- updateStocksRequestSkus :: [UpdateStockDTO]
  
instance Arbitrary UpdateTimeDTO where
  arbitrary = sized genUpdateTimeDTO

genUpdateTimeDTO :: Int -> Gen UpdateTimeDTO
genUpdateTimeDTO n =
  UpdateTimeDTO
    <$> arbitraryReduced n -- updateTimeDTOUpdatedAt :: DateTime
  
instance Arbitrary ValueRestrictionDTO where
  arbitrary = sized genValueRestrictionDTO

genValueRestrictionDTO :: Int -> Gen ValueRestrictionDTO
genValueRestrictionDTO n =
  ValueRestrictionDTO
    <$> arbitrary -- valueRestrictionDTOLimitingParameterId :: Integer
    <*> arbitraryReduced n -- valueRestrictionDTOLimitedValues :: [OptionValuesLimitedDTO]
  
instance Arbitrary VerifyOrderEacRequest where
  arbitrary = sized genVerifyOrderEacRequest

genVerifyOrderEacRequest :: Int -> Gen VerifyOrderEacRequest
genVerifyOrderEacRequest n =
  VerifyOrderEacRequest
    <$> arbitraryReducedMaybe n -- verifyOrderEacRequestCode :: Maybe Text
  
instance Arbitrary VerifyOrderEacResponse where
  arbitrary = sized genVerifyOrderEacResponse

genVerifyOrderEacResponse :: Int -> Gen VerifyOrderEacResponse
genVerifyOrderEacResponse n =
  VerifyOrderEacResponse
    <$> arbitraryReducedMaybe n -- verifyOrderEacResponseStatus :: Maybe ApiResponseStatusType
    <*> arbitraryReducedMaybe n -- verifyOrderEacResponseResult :: Maybe EacVerificationResultDTO
  
instance Arbitrary WarehouseAddressDTO where
  arbitrary = sized genWarehouseAddressDTO

genWarehouseAddressDTO :: Int -> Gen WarehouseAddressDTO
genWarehouseAddressDTO n =
  WarehouseAddressDTO
    <$> arbitrary -- warehouseAddressDTOCity :: Text
    <*> arbitraryReducedMaybe n -- warehouseAddressDTOStreet :: Maybe Text
    <*> arbitraryReducedMaybe n -- warehouseAddressDTONumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- warehouseAddressDTOBuilding :: Maybe Text
    <*> arbitraryReducedMaybe n -- warehouseAddressDTOBlock :: Maybe Text
    <*> arbitraryReduced n -- warehouseAddressDTOGps :: GpsDTO
  
instance Arbitrary WarehouseDTO where
  arbitrary = sized genWarehouseDTO

genWarehouseDTO :: Int -> Gen WarehouseDTO
genWarehouseDTO n =
  WarehouseDTO
    <$> arbitrary -- warehouseDTOId :: Integer
    <*> arbitrary -- warehouseDTOName :: Text
    <*> arbitrary -- warehouseDTOCampaignId :: Integer
    <*> arbitrary -- warehouseDTOExpress :: Bool
    <*> arbitraryReducedMaybe n -- warehouseDTOAddress :: Maybe WarehouseAddressDTO
  
instance Arbitrary WarehouseGroupDTO where
  arbitrary = sized genWarehouseGroupDTO

genWarehouseGroupDTO :: Int -> Gen WarehouseGroupDTO
genWarehouseGroupDTO n =
  WarehouseGroupDTO
    <$> arbitrary -- warehouseGroupDTOName :: Text
    <*> arbitraryReduced n -- warehouseGroupDTOMainWarehouse :: WarehouseDTO
    <*> arbitraryReduced n -- warehouseGroupDTOWarehouses :: [WarehouseDTO]
  
instance Arbitrary WarehouseOfferDTO where
  arbitrary = sized genWarehouseOfferDTO

genWarehouseOfferDTO :: Int -> Gen WarehouseOfferDTO
genWarehouseOfferDTO n =
  WarehouseOfferDTO
    <$> arbitrary -- warehouseOfferDTOOfferId :: Text
    <*> arbitraryReducedMaybe n -- warehouseOfferDTOTurnoverSummary :: Maybe TurnoverDTO
    <*> arbitraryReduced n -- warehouseOfferDTOStocks :: [WarehouseStockDTO]
    <*> arbitraryReducedMaybe n -- warehouseOfferDTOUpdatedAt :: Maybe DateTime
  
instance Arbitrary WarehouseOffersDTO where
  arbitrary = sized genWarehouseOffersDTO

genWarehouseOffersDTO :: Int -> Gen WarehouseOffersDTO
genWarehouseOffersDTO n =
  WarehouseOffersDTO
    <$> arbitrary -- warehouseOffersDTOWarehouseId :: Integer
    <*> arbitraryReduced n -- warehouseOffersDTOOffers :: [WarehouseOfferDTO]
  
instance Arbitrary WarehouseStockDTO where
  arbitrary = sized genWarehouseStockDTO

genWarehouseStockDTO :: Int -> Gen WarehouseStockDTO
genWarehouseStockDTO n =
  WarehouseStockDTO
    <$> arbitraryReduced n -- warehouseStockDTOType :: WarehouseStockType
    <*> arbitrary -- warehouseStockDTOCount :: Integer
  
instance Arbitrary WarehousesDTO where
  arbitrary = sized genWarehousesDTO

genWarehousesDTO :: Int -> Gen WarehousesDTO
genWarehousesDTO n =
  WarehousesDTO
    <$> arbitraryReduced n -- warehousesDTOWarehouses :: [WarehouseDTO]
    <*> arbitraryReduced n -- warehousesDTOWarehouseGroups :: [WarehouseGroupDTO]
  
instance Arbitrary WarningPromoOfferUpdateDTO where
  arbitrary = sized genWarningPromoOfferUpdateDTO

genWarningPromoOfferUpdateDTO :: Int -> Gen WarningPromoOfferUpdateDTO
genWarningPromoOfferUpdateDTO n =
  WarningPromoOfferUpdateDTO
    <$> arbitrary -- warningPromoOfferUpdateDTOOfferId :: Text
    <*> arbitraryReduced n -- warningPromoOfferUpdateDTOWarnings :: [PromoOfferUpdateWarningDTO]
  



instance Arbitrary AddOffersToArchiveErrorType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AffectedOrderQualityRatingComponentType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary AgeUnitType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ApiResponseStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CalculatedTariffType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CampaignSettingsScheduleSourceType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CategoryErrorType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ChatMessageSenderType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ChatStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ChatType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary CurrencyType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary DayOfWeekType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'ChannelType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary EacVerificationStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary FeedContentErrorType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary FeedDownloadErrorType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary FeedIndexLogsErrorType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary FeedIndexLogsIndexType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary FeedIndexLogsStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary FeedStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary FeedbackCommentAuthorType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary FeedbackDeliveryType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary FeedbackReactionStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary FeedbackStateType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary FieldStateType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary GoodsFeedbackCommentAuthorType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary GoodsFeedbackCommentStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary LanguageType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary LicenseCheckStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary LicenseType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary LogisticPointType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary MechanicsType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OfferAvailabilityStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OfferCampaignStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OfferCardRecommendationType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OfferCardStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OfferConditionQualityType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OfferConditionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OfferContentErrorType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OfferMappingErrorType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OfferMappingKindType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OfferProcessingNoteType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OfferProcessingStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OfferSellingProgramStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OfferType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderBuyerType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderCancellationReasonType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderDeliveryDateReasonType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderDeliveryDispatchType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderDeliveryEacType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderDeliveryPartnerType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderDeliveryType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderDocumentStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderItemInstanceType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderItemStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderItemSubsidyType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderItemsModificationRequestReasonType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderLiftType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderPaymentMethodType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderPaymentType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderPromoType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderStatsStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderSubsidyType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderSubstatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderTaxSystemType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderUpdateStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrderVatType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrdersStatsCommissionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrdersStatsItemStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrdersStatsOrderPaymentType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrdersStatsPaymentSourceType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrdersStatsPaymentType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrdersStatsPriceType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OrdersStatsStockType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OutletStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OutletType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary OutletVisibilityType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PageFormatType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ParameterType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PaymentFrequencyType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PlacementType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PriceCompetitivenessType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PriceQuarantineVerdictParamNameType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PriceQuarantineVerdictType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PriceSuggestType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PromoOfferParticipationStatusFilterType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PromoOfferParticipationStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PromoOfferUpdateWarningCodeType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PromoParticipationType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary QualityRatingComponentType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary RecipientType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary RefundStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary RegionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary RejectedPromoOfferDeleteReasonType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary RejectedPromoOfferUpdateReasonType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReportFormatType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReportStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReportSubStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReturnDecisionReasonType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReturnDecisionSubreasonType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReturnDecisionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReturnInstanceStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReturnInstanceStockType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReturnRequestDecisionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReturnShipmentStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ReturnType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary SellingProgramType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ShelfsStatisticsAttributionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ShipmentActionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ShipmentPalletLabelPageFormatType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ShipmentStatusType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ShipmentType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary ShowsSalesGroupingType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary SortOrderType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TariffType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TimeUnitType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary TurnoverType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary WarehouseStockType where
  arbitrary = arbitraryBoundedEnum

