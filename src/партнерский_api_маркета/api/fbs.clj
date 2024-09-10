(ns партнерский-api-маркета.api.fbs
  (:require [партнерский-api-маркета.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [партнерский-api-маркета.specs.offer-card-status-type :refer :all]
            [партнерский-api-маркета.specs.update-promo-offer-discount-params-dto :refer :all]
            [партнерский-api-маркета.specs.get-models-response :refer :all]
            [партнерский-api-маркета.specs.generate-report-dto :refer :all]
            [партнерский-api-маркета.specs.offer-mapping-suggestions-list-dto :refer :all]
            [партнерский-api-маркета.specs.search-shipments-response :refer :all]
            [партнерский-api-маркета.specs.promo-offer-update-warning-code-type :refer :all]
            [партнерский-api-маркета.specs.get-prices-response :refer :all]
            [партнерский-api-маркета.specs.update-promo-offers-result-dto :refer :all]
            [партнерский-api-маркета.specs.extension-shipment-dto :refer :all]
            [партнерский-api-маркета.specs.shipment-type :refer :all]
            [партнерский-api-маркета.specs.feed-index-logs-error-dto :refer :all]
            [партнерский-api-маркета.specs.eac-verification-status-type :refer :all]
            [партнерский-api-маркета.specs.get-offer-mappings-response :refer :all]
            [партнерский-api-маркета.specs.get-goods-stats-response :refer :all]
            [партнерский-api-маркета.specs.warehouses-dto :refer :all]
            [партнерский-api-маркета.specs.get-chat-history-request :refer :all]
            [партнерский-api-маркета.specs.paged-returns-dto :refer :all]
            [партнерский-api-маркета.specs.shelfs-statistics-attribution-type :refer :all]
            [партнерский-api-маркета.specs.gps-dto :refer :all]
            [партнерский-api-маркета.specs.partner-market-category-id :refer :all]
            [партнерский-api-маркета.specs.get-promo-offers-result-dto :refer :all]
            [партнерский-api-маркета.specs.license-type :refer :all]
            [партнерский-api-маркета.specs.offer-weight-dimensions-dto :refer :all]
            [партнерский-api-маркета.specs.order-cancellation-reason-type :refer :all]
            [партнерский-api-маркета.specs.order-courier-dto :refer :all]
            [партнерский-api-маркета.specs.get-suggested-offer-mappings-result-dto :refer :all]
            [партнерский-api-маркета.specs.language-type :refer :all]
            [партнерский-api-маркета.specs.order-stats-status-type :refer :all]
            [партнерский-api-маркета.specs.feedback-order-dto :refer :all]
            [партнерский-api-маркета.specs.order-item-detail-dto :refer :all]
            [партнерский-api-маркета.specs.outlet-visibility-type :refer :all]
            [партнерский-api-маркета.specs.currency-type :refer :all]
            [партнерский-api-маркета.specs.return-instance-dto :refer :all]
            [партнерский-api-маркета.specs.get-price-dto :refer :all]
            [партнерский-api-маркета.specs.order-item-dto :refer :all]
            [партнерский-api-маркета.specs.feed-publication-price-and-stock-update-dto :refer :all]
            [партнерский-api-маркета.specs.suggested-offer-dto :refer :all]
            [партнерский-api-маркета.specs.feed-publication-full-dto :refer :all]
            [партнерский-api-маркета.specs.api-unauthorized-error-response :refer :all]
            [партнерский-api-маркета.specs.order-item-instance-modification-dto :refer :all]
            [партнерский-api-маркета.specs.warehouse-stock-type :refer :all]
            [партнерский-api-маркета.specs.get-price-with-vat-dto :refer :all]
            [партнерский-api-маркета.specs.api-forbidden-error-response :refer :all]
            [партнерский-api-маркета.specs.report-format-type :refer :all]
            [партнерский-api-маркета.specs.order-item-subsidy-type :refer :all]
            [партнерский-api-маркета.specs.promo-participation-type :refer :all]
            [партнерский-api-маркета.specs.feed-content-error-dto :refer :all]
            [партнерский-api-маркета.specs.confirm-prices-request :refer :all]
            [партнерский-api-маркета.specs.get-goods-stats-request :refer :all]
            [партнерский-api-маркета.specs.feed-publication-dto :refer :all]
            [партнерский-api-маркета.specs.orders-stats-payment-dto :refer :all]
            [партнерский-api-маркета.specs.offer-mapping-error-type :refer :all]
            [партнерский-api-маркета.specs.return-shipment-status-type :refer :all]
            [партнерский-api-маркета.specs.quarantine-offer-dto :refer :all]
            [партнерский-api-маркета.specs.get-goods-feedback-comments-response :refer :all]
            [партнерский-api-маркета.specs.return-dto :refer :all]
            [партнерский-api-маркета.specs.get-quarantine-offers-result-dto :refer :all]
            [партнерский-api-маркета.specs.logistic-pickup-point-dto :refer :all]
            [партнерский-api-маркета.specs.update-mappings-offer-dto :refer :all]
            [партнерский-api-маркета.specs.get-order-labels-data-response :refer :all]
            [партнерский-api-маркета.specs.offer-vendor-code :refer :all]
            [партнерский-api-маркета.specs.unit-dto :refer :all]
            [партнерский-api-маркета.specs.order-substatus-type :refer :all]
            [партнерский-api-маркета.specs.delete-offers-request :refer :all]
            [партнерский-api-маркета.specs.campaign-settings-schedule-dto :refer :all]
            [партнерский-api-маркета.specs.set-order-box-layout-request :refer :all]
            [партнерский-api-маркета.specs.skip-goods-feedback-reaction-request :refer :all]
            [партнерский-api-маркета.specs.offer-selling-program-dto :refer :all]
            [партнерский-api-маркета.specs.update-stock-item-dto :refer :all]
            [партнерский-api-маркета.specs.get-returns-response :refer :all]
            [партнерский-api-маркета.specs.get-offer-cards-content-status-request :refer :all]
            [партнерский-api-маркета.specs.parameter-value-dto :refer :all]
            [партнерский-api-маркета.specs.feedback-state-type :refer :all]
            [партнерский-api-маркета.specs.rejected-promo-offer-delete-reason-type :refer :all]
            [партнерский-api-маркета.specs.get-fulfillment-warehouses-response :refer :all]
            [партнерский-api-маркета.specs.shows-sales-grouping-type :refer :all]
            [партнерский-api-маркета.specs.get-bids-info-request :refer :all]
            [партнерский-api-маркета.specs.price-suggest-dto :refer :all]
            [партнерский-api-маркета.specs.get-promo-constraints-dto :refer :all]
            [партнерский-api-маркета.specs.tariff-parameter-dto :refer :all]
            [партнерский-api-маркета.specs.set-shipment-pallets-count-request :refer :all]
            [партнерский-api-маркета.specs.order-item-instance-dto :refer :all]
            [партнерский-api-маркета.specs.update-offer-mapping-entry-dto :refer :all]
            [партнерский-api-маркета.specs.order-document-status-type :refer :all]
            [партнерский-api-маркета.specs.orders-stats-item-status-type :refer :all]
            [партнерский-api-маркета.specs.generate-mass-order-labels-request :refer :all]
            [партнерский-api-маркета.specs.mechanics-type :refer :all]
            [партнерский-api-маркета.specs.return-decision-reason-type :refer :all]
            [партнерский-api-маркета.specs.sku-bid-recommendation-item-dto :refer :all]
            [партнерский-api-маркета.specs.quality-rating-affected-order-dto :refer :all]
            [партнерский-api-маркета.specs.base-offer-dto :refer :all]
            [партнерский-api-маркета.specs.get-shipment-response :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-id :refer :all]
            [партнерский-api-маркета.specs.get-categories-max-sale-quantum-response :refer :all]
            [партнерский-api-маркета.specs.pallets-count-dto :refer :all]
            [партнерский-api-маркета.specs.goods-stats-goods-dto :refer :all]
            [партнерский-api-маркета.specs.get-offer-recommendations-request :refer :all]
            [партнерский-api-маркета.specs.delete-campaign-offers-dto :refer :all]
            [партнерский-api-маркета.specs.age-dto :refer :all]
            [партнерский-api-маркета.specs.feedback-comment-author-dto :refer :all]
            [партнерский-api-маркета.specs.get-hidden-offers-response :refer :all]
            [партнерский-api-маркета.specs.order-item-modification-dto :refer :all]
            [партнерский-api-маркета.specs.feedback-shop-dto :refer :all]
            [партнерский-api-маркета.specs.quality-rating-component-type :refer :all]
            [партнерский-api-маркета.specs.base-campaign-offer-dto :refer :all]
            [партнерский-api-маркета.specs.get-quality-rating-details-response :refer :all]
            [партнерский-api-маркета.specs.add-offers-to-archive-dto :refer :all]
            [партнерский-api-маркета.specs.get-campaign-region-response :refer :all]
            [партнерский-api-маркета.specs.order-item-promo-dto :refer :all]
            [партнерский-api-маркета.specs.get-hidden-offers-result-dto :refer :all]
            [партнерский-api-маркета.specs.update-offer-content-request :refer :all]
            [партнерский-api-маркета.specs.return-decision-type :refer :all]
            [партнерский-api-маркета.specs.cis :refer :all]
            [партнерский-api-маркета.specs.confirm-shipment-request :refer :all]
            [партнерский-api-маркета.specs.outlet-response-dto :refer :all]
            [партнерский-api-маркета.specs.turnover-type :refer :all]
            [партнерский-api-маркета.specs.generate-shows-sales-report-request :refer :all]
            [партнерский-api-маркета.specs.update-order-statuses-dto :refer :all]
            [партнерский-api-маркета.specs.mappings-offer-info-dto :refer :all]
            [партнерский-api-маркета.specs.order-tax-system-type :refer :all]
            [партнерский-api-маркета.specs.campaign-settings-time-period-dto :refer :all]
            [партнерский-api-маркета.specs.get-models-offers-response :refer :all]
            [партнерский-api-маркета.specs.feed-index-logs-error-type :refer :all]
            [партнерский-api-маркета.specs.offer-availability-status-type :refer :all]
            [партнерский-api-маркета.specs.create-chat-result-dto :refer :all]
            [партнерский-api-маркета.specs.orders-stats-delivery-region-dto :refer :all]
            [партнерский-api-маркета.specs.order-status-change-delivery-dates-dto :refer :all]
            [партнерский-api-маркета.specs.outlet-licenses-response-dto :refer :all]
            [партнерский-api-маркета.specs.get-promos-response :refer :all]
            [партнерский-api-маркета.specs.sku-bid-item-dto :refer :all]
            [партнерский-api-маркета.specs.update-offer-mappings-response :refer :all]
            [партнерский-api-маркета.specs.return-request-decision-type :refer :all]
            [партнерский-api-маркета.specs.base-price-dto :refer :all]
            [партнерский-api-маркета.specs.offer-price-dto :refer :all]
            [партнерский-api-маркета.specs.feedback-author-dto :refer :all]
            [партнерский-api-маркета.specs.get-region-with-children-response :refer :all]
            [партнерский-api-маркета.specs.get-bids-recommendations-response-dto :refer :all]
            [партнерский-api-маркета.specs.feedback-grades-dto :refer :all]
            [партнерский-api-маркета.specs.delete-promo-offers-request :refer :all]
            [партнерский-api-маркета.specs.delete-campaign-offers-request :refer :all]
            [партнерский-api-маркета.specs.bid :refer :all]
            [партнерский-api-маркета.specs.order-items-modification-request-reason-type :refer :all]
            [партнерский-api-маркета.specs.update-order-status-response :refer :all]
            [партнерский-api-маркета.specs.suggest-prices-request :refer :all]
            [партнерский-api-маркета.specs.promo-offer-discount-params-dto :refer :all]
            [партнерский-api-маркета.specs.delivery-services-dto :refer :all]
            [партнерский-api-маркета.specs.outlet-dto :refer :all]
            [партнерский-api-маркета.specs.orders-shipment-info-dto :refer :all]
            [партнерский-api-маркета.specs.update-business-prices-request :refer :all]
            [партнерский-api-маркета.specs.get-chats-response :refer :all]
            [партнерский-api-маркета.specs.update-promo-offer-params-dto :refer :all]
            [партнерский-api-маркета.specs.delete-hidden-offers-request :refer :all]
            [партнерский-api-маркета.specs.change-outlet-request :refer :all]
            [партнерский-api-маркета.specs.update-stocks-request :refer :all]
            [партнерский-api-маркета.specs.goods-stats-warehouse-dto :refer :all]
            [партнерский-api-маркета.specs.get-chats-request :refer :all]
            [партнерский-api-маркета.specs.get-outlet-licenses-response :refer :all]
            [партнерский-api-маркета.specs.offer-price-response-dto :refer :all]
            [партнерский-api-маркета.specs.update-order-storage-limit-request :refer :all]
            [партнерский-api-маркета.specs.order-update-status-type :refer :all]
            [партнерский-api-маркета.specs.report-sub-status-type :refer :all]
            [партнерский-api-маркета.specs.get-offer-dto :refer :all]
            [партнерский-api-маркета.specs.get-quality-rating-response :refer :all]
            [партнерский-api-маркета.specs.rejected-promo-offer-update-reason-type :refer :all]
            [партнерский-api-маркета.specs.offer-campaign-status-type :refer :all]
            [партнерский-api-маркета.specs.return-type :refer :all]
            [партнерский-api-маркета.specs.update-outlet-license-request :refer :all]
            [партнерский-api-маркета.specs.create-chat-request :refer :all]
            [партнерский-api-маркета.specs.get-order-buyer-info-response :refer :all]
            [партнерский-api-маркета.specs.campaign-settings-delivery-dto :refer :all]
            [партнерский-api-маркета.specs.suggest-prices-result-dto :refer :all]
            [партнерский-api-маркета.specs.return-instance-status-type :refer :all]
            [партнерский-api-маркета.specs.brief-order-item-dto :refer :all]
            [партнерский-api-маркета.specs.model-dto :refer :all]
            [партнерский-api-маркета.specs.delivery-service-dto :refer :all]
            [партнерский-api-маркета.specs.set-order-shipment-boxes-response :refer :all]
            [партнерский-api-маркета.specs.calculate-tariffs-request :refer :all]
            [партнерский-api-маркета.specs.price-recommendation-item-dto :refer :all]
            [партнерский-api-маркета.specs.track-dto :refer :all]
            [партнерский-api-маркета.specs.generate-goods-turnover-request :refer :all]
            [партнерский-api-маркета.specs.feed-content-error-type :refer :all]
            [партнерский-api-маркета.specs.offer-dto :refer :all]
            [партнерский-api-маркета.specs.get-suggested-offer-mapping-entries-response :refer :all]
            [партнерский-api-маркета.specs.get-warehouse-stocks-request :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-statistics-dto :refer :all]
            [партнерский-api-маркета.specs.promo-offer-auto-participating-details-dto :refer :all]
            [партнерский-api-маркета.specs.orders-stats-details-dto :refer :all]
            [партнерский-api-маркета.specs.offer-content-error-type :refer :all]
            [партнерский-api-маркета.specs.provide-order-item-identifiers-response :refer :all]
            [партнерский-api-маркета.specs.bid-recommendation-item-dto :refer :all]
            [партнерский-api-маркета.specs.get-feeds-response :refer :all]
            [партнерский-api-маркета.specs.price-quarantine-verdict-type :refer :all]
            [партнерский-api-маркета.specs.feedback-list-dto :refer :all]
            [партнерский-api-маркета.specs.feed-dto :refer :all]
            [партнерский-api-маркета.specs.update-mapping-dto :refer :all]
            [партнерский-api-маркета.specs.offer-price-list-response-dto :refer :all]
            [партнерский-api-маркета.specs.warehouse-stock-dto :refer :all]
            [партнерский-api-маркета.specs.full-outlet-dto :refer :all]
            [партнерский-api-маркета.specs.business-settings-dto :refer :all]
            [партнерский-api-маркета.specs.get-quality-rating-request :refer :all]
            [партнерский-api-маркета.specs.goods-stats-weight-dimensions-dto :refer :all]
            [партнерский-api-маркета.specs.refund-status-type :refer :all]
            [партнерский-api-маркета.specs.order-delivery-type :refer :all]
            [партнерский-api-маркета.specs.get-delivery-services-response :refer :all]
            [партнерский-api-маркета.specs.price-competitiveness-type :refer :all]
            [партнерский-api-маркета.specs.orders-stats-payment-source-type :refer :all]
            [партнерский-api-маркета.specs.date-dd-mm-yyyy :refer :all]
            [партнерский-api-маркета.specs.page-format-type :refer :all]
            [партнерский-api-маркета.specs.date-dd-mm-yyyy-hh-mm-ss :refer :all]
            [партнерский-api-маркета.specs.parcel-box-label-dto :refer :all]
            [партнерский-api-маркета.specs.chat-type :refer :all]
            [партнерский-api-маркета.specs.offer-mapping-error-dto :refer :all]
            [партнерский-api-маркета.specs.feed-download-error-dto :refer :all]
            [партнерский-api-маркета.specs.offer-processing-status-type :refer :all]
            [партнерский-api-маркета.specs.add-hidden-offers-request :refer :all]
            [партнерский-api-маркета.specs.get-quarantine-offers-request :refer :all]
            [партнерский-api-маркета.specs.feed-download-dto :refer :all]
            [партнерский-api-маркета.specs.provide-order-digital-codes-request :refer :all]
            [партнерский-api-маркета.specs.update-offer-mapping-entry-request :refer :all]
            [партнерский-api-маркета.specs.quantum-dto :refer :all]
            [партнерский-api-маркета.specs.add-offers-to-archive-error-dto :refer :all]
            [партнерский-api-маркета.specs.report-status-type :refer :all]
            [партнерский-api-маркета.specs.update-offer-mappings-request :refer :all]
            [партнерский-api-маркета.specs.order-delivery-dto :refer :all]
            [партнерский-api-маркета.specs.delivery-service-info-dto :refer :all]
            [партнерский-api-маркета.specs.order-vat-type :refer :all]
            [партнерский-api-маркета.specs.offer-campaign-status-dto :refer :all]
            [партнерский-api-маркета.specs.generate-stocks-on-warehouses-report-request :refer :all]
            [партнерский-api-маркета.specs.update-prices-request :refer :all]
            [партнерский-api-маркета.specs.get-chat-info-dto :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-comment-author-dto :refer :all]
            [партнерский-api-маркета.specs.get-warehouses-response :refer :all]
            [партнерский-api-маркета.specs.feed-parameter-dto :refer :all]
            [партнерский-api-маркета.specs.update-offer-content-result-dto :refer :all]
            [партнерский-api-маркета.specs.field-state-type :refer :all]
            [партнерский-api-маркета.specs.calculate-tariffs-offer-dto :refer :all]
            [партнерский-api-маркета.specs.offer-name :refer :all]
            [партнерский-api-маркета.specs.report-info-dto :refer :all]
            [партнерский-api-маркета.specs.business-dto :refer :all]
            [партнерский-api-маркета.specs.category-content-parameters-dto :refer :all]
            [партнерский-api-маркета.specs.models-dto :refer :all]
            [партнерский-api-маркета.specs.create-chat-response :refer :all]
            [партнерский-api-маркета.specs.get-campaign-offers-result-dto :refer :all]
            [партнерский-api-маркета.specs.campaign-quality-rating-dto :refer :all]
            [партнерский-api-маркета.specs.campaign-dto :refer :all]
            [партнерский-api-маркета.specs.price-quarantine-verdict-param-name-type :refer :all]
            [партнерский-api-маркета.specs.get-warehouse-stocks-dto :refer :all]
            [партнерский-api-маркета.specs.generate-shelfs-statistics-request :refer :all]
            [партнерский-api-маркета.specs.delete-promo-offers-response :refer :all]
            [партнерский-api-маркета.specs.order-delivery-eac-type :refer :all]
            [партнерский-api-маркета.specs.offer-content-dto :refer :all]
            [партнерский-api-маркета.specs.promo-offer-participation-status-type :refer :all]
            [партнерский-api-маркета.specs.region-type :refer :all]
            [партнерский-api-маркета.specs.orders-stats-commission-dto :refer :all]
            [партнерский-api-маркета.specs.shipment-pallet-label-page-format-type :refer :all]
            [партнерский-api-маркета.specs.orders-stats-dto :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-description-dto :refer :all]
            [партнерский-api-маркета.specs.parcel-dto :refer :all]
            [партнерский-api-маркета.specs.order-business-buyer-dto :refer :all]
            [партнерский-api-маркета.specs.campaigns-quality-rating-dto :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-dto :refer :all]
            [партнерский-api-маркета.specs.category-parameter-dto :refer :all]
            [партнерский-api-маркета.specs.category-error-dto :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-comment-id :refer :all]
            [партнерский-api-маркета.specs.orders-stats-order-dto :refer :all]
            [партнерский-api-маркета.specs.get-shipment-orders-info-response :refer :all]
            [партнерский-api-маркета.specs.get-goods-feedback-response :refer :all]
            [партнерский-api-маркета.specs.order-shipment-dto :refer :all]
            [партнерский-api-маркета.specs.channel-type :refer :all]
            [партнерский-api-маркета.specs.add-offers-to-archive-request :refer :all]
            [партнерский-api-маркета.specs.outlet-working-schedule-item-dto :refer :all]
            [партнерский-api-маркета.specs.generate-goods-realization-report-request :refer :all]
            [партнерский-api-маркета.specs.placement-type :refer :all]
            [партнерский-api-маркета.specs.generate-report-response :refer :all]
            [партнерский-api-маркета.specs.get-feedback-list-response :refer :all]
            [партнерский-api-маркета.specs.price-quarantine-verdict-parameter-dto :refer :all]
            [партнерский-api-маркета.specs.outlet-address-dto :refer :all]
            [партнерский-api-маркета.specs.order-delivery-partner-type :refer :all]
            [партнерский-api-маркета.specs.campaign-settings-dto :refer :all]
            [партнерский-api-маркета.specs.warehouse-offer-dto :refer :all]
            [партнерский-api-маркета.specs.category-dto :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-comment-status-type :refer :all]
            [партнерский-api-маркета.specs.promo-offer-promocode-params-dto :refer :all]
            [партнерский-api-маркета.specs.update-business-offer-price-dto :refer :all]
            [партнерский-api-маркета.specs.delete-goods-feedback-comment-request :refer :all]
            [партнерский-api-маркета.specs.get-business-buyer-info-response :refer :all]
            [партнерский-api-маркета.specs.order-status-change-dto :refer :all]
            [партнерский-api-маркета.specs.update-goods-feedback-comment-dto :refer :all]
            [партнерский-api-маркета.specs.model-price-dto :refer :all]
            [партнерский-api-маркета.specs.get-campaigns-response :refer :all]
            [партнерский-api-маркета.specs.accept-order-cancellation-request :refer :all]
            [партнерский-api-маркета.specs.update-offer-content-response :refer :all]
            [партнерский-api-маркета.specs.get-all-offers-response :refer :all]
            [партнерский-api-маркета.specs.get-business-settings-info-dto :refer :all]
            [партнерский-api-маркета.specs.update-order-item-request :refer :all]
            [партнерский-api-маркета.specs.search-models-response :refer :all]
            [партнерский-api-маркета.specs.get-offer-recommendations-response :refer :all]
            [партнерский-api-маркета.specs.get-suggested-offer-mappings-response :refer :all]
            [партнерский-api-маркета.specs.get-promo-assortment-info-dto :refer :all]
            [партнерский-api-маркета.specs.calculate-tariffs-response-dto :refer :all]
            [партнерский-api-маркета.specs.pickup-address-dto :refer :all]
            [партнерский-api-маркета.specs.get-promo-offer-dto :refer :all]
            [партнерский-api-маркета.specs.set-order-delivery-track-code-request :refer :all]
            [партнерский-api-маркета.specs.order-item-instance-type :refer :all]
            [партнерский-api-маркета.specs.update-price-with-discount-dto :refer :all]
            [партнерский-api-маркета.specs.order-box-layout-item-dto :refer :all]
            [партнерский-api-маркета.specs.orders-stats-order-payment-type :refer :all]
            [партнерский-api-маркета.specs.feed-parameter-name :refer :all]
            [партнерский-api-маркета.specs.fulfillment-warehouse-dto :refer :all]
            [партнерский-api-маркета.specs.time-unit-type :refer :all]
            [партнерский-api-маркета.specs.mappings-offer-dto :refer :all]
            [партнерский-api-маркета.specs.chat-status-type :refer :all]
            [партнерский-api-маркета.specs.delete-offers-from-archive-response :refer :all]
            [партнерский-api-маркета.specs.api-client-data-error-response :refer :all]
            [партнерский-api-маркета.specs.parameter-type :refer :all]
            [партнерский-api-маркета.specs.enriched-models-dto :refer :all]
            [партнерский-api-маркета.specs.get-quarantine-offers-response :refer :all]
            [партнерский-api-маркета.specs.forward-scrolling-pager-dto :refer :all]
            [партнерский-api-маркета.specs.price-suggest-type :refer :all]
            [партнерский-api-маркета.specs.update-promo-offer-dto :refer :all]
            [партнерский-api-маркета.specs.tariff-dto :refer :all]
            [партнерский-api-маркета.specs.order-payment-type :refer :all]
            [партнерский-api-маркета.specs.get-promo-mechanics-info-dto :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-list-dto :refer :all]
            [партнерский-api-маркета.specs.get-promos-result-dto :refer :all]
            [партнерский-api-маркета.specs.api-server-error-response :refer :all]
            [партнерский-api-маркета.specs.generate-united-marketplace-services-report-request :refer :all]
            [партнерский-api-маркета.specs.get-business-settings-response :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-media-dto :refer :all]
            [партнерский-api-маркета.specs.generate-shipment-list-document-report-request :refer :all]
            [партнерский-api-маркета.specs.orders-stats-item-dto :refer :all]
            [партнерский-api-маркета.specs.eac-verification-result-dto :refer :all]
            [партнерский-api-маркета.specs.document-dto :refer :all]
            [партнерский-api-маркета.specs.outlet-working-schedule-dto :refer :all]
            [партнерский-api-маркета.specs.feed-index-logs-result-dto :refer :all]
            [партнерский-api-маркета.specs.get-regions-response :refer :all]
            [партнерский-api-маркета.specs.offers-dto :refer :all]
            [партнерский-api-маркета.specs.get-prices-by-offer-ids-response :refer :all]
            [партнерский-api-маркета.specs.get-categories-max-sale-quantum-dto :refer :all]
            [партнерский-api-маркета.specs.offer-recommendations-result-dto :refer :all]
            [партнерский-api-маркета.specs.order-item-subsidy-dto :refer :all]
            [партнерский-api-маркета.specs.parameter-value-constraints-dto :refer :all]
            [партнерский-api-маркета.specs.calculated-tariff-type :refer :all]
            [партнерский-api-маркета.specs.warehouse-dto :refer :all]
            [партнерский-api-маркета.specs.warning-promo-offer-update-dto :refer :all]
            [партнерский-api-маркета.specs.day-of-week-type :refer :all]
            [партнерский-api-маркета.specs.orders-stats-price-dto :refer :all]
            [партнерский-api-маркета.specs.add-offers-to-archive-error-type :refer :all]
            [партнерский-api-маркета.specs.shipment-status-type :refer :all]
            [партнерский-api-маркета.specs.feed-index-logs-offers-dto :refer :all]
            [партнерский-api-маркета.specs.set-feed-params-request :refer :all]
            [партнерский-api-маркета.specs.rejected-promo-offer-update-dto :refer :all]
            [партнерский-api-маркета.specs.orders-stats-payment-order-dto :refer :all]
            [партнерский-api-маркета.specs.payment-frequency-type :refer :all]
            [партнерский-api-маркета.specs.order-digital-item-dto :refer :all]
            [партнерский-api-маркета.specs.get-prices-by-offer-ids-request :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-comment-text :refer :all]
            [партнерский-api-маркета.specs.warehouse-group-dto :refer :all]
            [партнерский-api-маркета.specs.calculate-tariffs-parameters-dto :refer :all]
            [партнерский-api-маркета.specs.order-business-documents-dto :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-identifiers-dto :refer :all]
            [партнерский-api-маркета.specs.get-offers-response :refer :all]
            [партнерский-api-маркета.specs.logistic-point-type :refer :all]
            [партнерский-api-маркета.specs.update-offer-mapping-result-dto :refer :all]
            [партнерский-api-маркета.specs.order-item-status-type :refer :all]
            [партнерский-api-маркета.specs.generate-competitors-position-report-request :refer :all]
            [партнерский-api-маркета.specs.generate-goods-feedback-request :refer :all]
            [партнерский-api-маркета.specs.chat-messages-result-dto :refer :all]
            [партнерский-api-маркета.specs.orders-stats-stock-type :refer :all]
            [партнерский-api-маркета.specs.model-offer-dto :refer :all]
            [партнерский-api-маркета.specs.feedback-factor-dto :refer :all]
            [партнерский-api-маркета.specs.price-dto :refer :all]
            [партнерский-api-маркета.specs.calculate-tariffs-offer-info-dto :refer :all]
            [партнерский-api-маркета.specs.get-return-response :refer :all]
            [партнерский-api-маркета.specs.category-error-type :refer :all]
            [партнерский-api-маркета.specs.order-label-dto :refer :all]
            [партнерский-api-маркета.specs.feedback-delivery-type :refer :all]
            [партнерский-api-маркета.specs.generate-united-netting-report-request :refer :all]
            [партнерский-api-маркета.specs.scrolling-pager-dto :refer :all]
            [партнерский-api-маркета.specs.update-promo-offers-response :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-comment-author-type :refer :all]
            [партнерский-api-маркета.specs.update-order-statuses-request :refer :all]
            [партнерский-api-маркета.specs.offer-error-dto :refer :all]
            [партнерский-api-маркета.specs.parameter-value-option-dto :refer :all]
            [партнерский-api-маркета.specs.order-dto :refer :all]
            [партнерский-api-маркета.specs.promo-offer-participation-status-filter-type :refer :all]
            [партнерский-api-маркета.specs.get-campaign-logins-response :refer :all]
            [партнерский-api-маркета.specs.order-lift-type :refer :all]
            [партнерский-api-маркета.specs.get-promo-bestseller-info-dto :refer :all]
            [партнерский-api-маркета.specs.turnover-dto :refer :all]
            [партнерский-api-маркета.specs.option-values-limited-dto :refer :all]
            [партнерский-api-маркета.specs.feedback-comment-dto :refer :all]
            [партнерский-api-маркета.specs.shipment-status-change-dto :refer :all]
            [партнерский-api-маркета.specs.campaign-settings-schedule-source-type :refer :all]
            [партнерский-api-маркета.specs.get-warehouse-stocks-response :refer :all]
            [партнерский-api-маркета.specs.shipment-dto :refer :all]
            [партнерский-api-маркета.specs.get-offer-mappings-request :refer :all]
            [партнерский-api-маркета.specs.delete-campaign-offers-response :refer :all]
            [партнерский-api-маркета.specs.offer-mapping-entry-dto :refer :all]
            [партнерский-api-маркета.specs.feedback-dto :refer :all]
            [партнерский-api-маркета.specs.get-mapping-dto :refer :all]
            [партнерский-api-маркета.specs.feed-content-dto :refer :all]
            [партнерский-api-маркета.specs.market-sku :refer :all]
            [партнерский-api-маркета.specs.order-buyer-type :refer :all]
            [партнерский-api-маркета.specs.delete-offers-from-archive-dto :refer :all]
            [партнерский-api-маркета.specs.offer-condition-type :refer :all]
            [партнерский-api-маркета.specs.full-outlet-license-dto :refer :all]
            [партнерский-api-маркета.specs.feed-placement-dto :refer :all]
            [партнерский-api-маркета.specs.get-orders-stats-response :refer :all]
            [партнерский-api-маркета.specs.offer-mapping-kind-type :refer :all]
            [партнерский-api-маркета.specs.order-buyer-dto :refer :all]
            [партнерский-api-маркета.specs.set-return-decision-request :refer :all]
            [партнерский-api-маркета.specs.offer-vendor :refer :all]
            [партнерский-api-маркета.specs.outlet-delivery-rule-dto :refer :all]
            [партнерский-api-маркета.specs.get-bids-info-response-dto :refer :all]
            [партнерский-api-маркета.specs.chat-message-sender-type :refer :all]
            [партнерский-api-маркета.specs.shop-sku :refer :all]
            [партнерский-api-маркета.specs.offer-param-dto :refer :all]
            [партнерский-api-маркета.specs.hidden-offer-dto :refer :all]
            [партнерский-api-маркета.specs.set-order-box-layout-response :refer :all]
            [партнерский-api-маркета.specs.get-campaign-offers-response :refer :all]
            [партнерский-api-маркета.specs.get-bids-info-response :refer :all]
            [партнерский-api-маркета.specs.order-boxes-layout-dto :refer :all]
            [партнерский-api-маркета.specs.base-shipment-dto :refer :all]
            [партнерский-api-маркета.specs.orders-stats-commission-type :refer :all]
            [партнерский-api-маркета.specs.delete-offers-response :refer :all]
            [партнерский-api-маркета.specs.api-response :refer :all]
            [партнерский-api-маркета.specs.offer-manual-dto :refer :all]
            [партнерский-api-маркета.specs.send-message-to-chat-request :refer :all]
            [партнерский-api-маркета.specs.get-outlets-response :refer :all]
            [партнерский-api-маркета.specs.get-offer-mapping-dto :refer :all]
            [партнерский-api-маркета.specs.feedback-reaction-status-type :refer :all]
            [партнерский-api-маркета.specs.offer-for-recommendation-dto :refer :all]
            [партнерский-api-маркета.specs.order-delivery-date-reason-type :refer :all]
            [партнерский-api-маркета.specs.api-limit-error-response :refer :all]
            [партнерский-api-маркета.specs.license-check-status-type :refer :all]
            [партнерский-api-маркета.specs.feed-download-error-type :refer :all]
            [партнерский-api-маркета.specs.return-decision-subreason-type :refer :all]
            [партнерский-api-маркета.specs.outlet-type :refer :all]
            [партнерский-api-маркета.specs.age-unit-type :refer :all]
            [партнерский-api-маркета.specs.region-dto :refer :all]
            [партнерский-api-маркета.specs.quality-rating-dto :refer :all]
            [партнерский-api-маркета.specs.offer-selling-program-status-type :refer :all]
            [партнерский-api-маркета.specs.quality-rating-component-dto :refer :all]
            [партнерский-api-маркета.specs.suggest-offer-price-dto :refer :all]
            [партнерский-api-маркета.specs.get-offer-mapping-entries-response :refer :all]
            [партнерский-api-маркета.specs.offer-condition-dto :refer :all]
            [партнерский-api-маркета.specs.promo-period-dto :refer :all]
            [партнерский-api-маркета.specs.get-campaign-response :refer :all]
            [партнерский-api-маркета.specs.get-campaign-offer-dto :refer :all]
            [партнерский-api-маркета.specs.order-delivery-address-dto :refer :all]
            [партнерский-api-маркета.specs.rejected-promo-offer-delete-dto :refer :all]
            [партнерский-api-маркета.specs.selling-program-type :refer :all]
            [партнерский-api-маркета.specs.promo-offer-update-warning-dto :refer :all]
            [партнерский-api-маркета.specs.offer-price-by-offer-ids-response-dto :refer :all]
            [партнерский-api-маркета.specs.transfer-orders-from-shipment-request :refer :all]
            [партнерский-api-маркета.specs.offer-recommendation-info-dto :refer :all]
            [партнерский-api-маркета.specs.offer-type :refer :all]
            [партнерский-api-маркета.specs.get-suggested-offer-mapping-entries-request :refer :all]
            [партнерский-api-маркета.specs.provide-order-item-identifiers-request :refer :all]
            [партнерский-api-маркета.specs.get-offer-mappings-result-dto :refer :all]
            [партнерский-api-маркета.specs.partner-shipment-warehouse-dto :refer :all]
            [партнерский-api-маркета.specs.orders-stats-payment-type :refer :all]
            [партнерский-api-маркета.specs.get-suggested-offer-mappings-request :refer :all]
            [партнерский-api-маркета.specs.shipment-action-type :refer :all]
            [партнерский-api-маркета.specs.chat-message-payload-dto :refer :all]
            [партнерский-api-маркета.specs.enriched-model-dto :refer :all]
            [партнерский-api-маркета.specs.update-order-status-request :refer :all]
            [партнерский-api-маркета.specs.generate-boost-consolidated-request :refer :all]
            [партнерский-api-маркета.specs.get-promo-dto :refer :all]
            [партнерский-api-маркета.specs.offer-condition-quality-type :refer :all]
            [партнерский-api-маркета.specs.get-chat-history-response :refer :all]
            [партнерский-api-маркета.specs.get-promos-request :refer :all]
            [партнерский-api-маркета.specs.generate-goods-movement-report-request :refer :all]
            [партнерский-api-маркета.specs.order-parcel-box-dto :refer :all]
            [партнерский-api-маркета.specs.api-error-dto :refer :all]
            [партнерский-api-маркета.specs.price-competitiveness-thresholds-dto :refer :all]
            [партнерский-api-маркета.specs.get-price-with-discount-dto :refer :all]
            [партнерский-api-маркета.specs.get-bids-recommendations-response :refer :all]
            [партнерский-api-маркета.specs.api-not-found-error-response :refer :all]
            [партнерский-api-маркета.specs.feed-index-logs-status-type :refer :all]
            [партнерский-api-маркета.specs.value-restriction-dto :refer :all]
            [партнерский-api-маркета.specs.delete-offers-from-archive-request :refer :all]
            [партнерский-api-маркета.specs.offer-recommendation-dto :refer :all]
            [партнерский-api-маркета.specs.delete-promo-offers-result-dto :refer :all]
            [партнерский-api-маркета.specs.brief-order-item-instance-dto :refer :all]
            [партнерский-api-маркета.specs.offer-processing-note-type :refer :all]
            [партнерский-api-маркета.specs.get-feed-response :refer :all]
            [партнерский-api-маркета.specs.get-categories-max-sale-quantum-request :refer :all]
            [партнерский-api-маркета.specs.get-categories-response :refer :all]
            [партнерский-api-маркета.specs.calculate-tariffs-response :refer :all]
            [партнерский-api-маркета.specs.create-outlet-response :refer :all]
            [партнерский-api-маркета.specs.get-goods-feedback-request :refer :all]
            [партнерский-api-маркета.specs.order-delivery-dispatch-type :refer :all]
            [партнерский-api-маркета.specs.empty-api-response :refer :all]
            [партнерский-api-маркета.specs.api-response-status-type :refer :all]
            [партнерский-api-маркета.specs.update-promo-offers-request :refer :all]
            [партнерский-api-маркета.specs.generate-united-orders-request :refer :all]
            [партнерский-api-маркета.specs.offer-processing-state-dto :refer :all]
            [партнерский-api-маркета.specs.get-report-info-response :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-comment-list-dto :refer :all]
            [партнерский-api-маркета.specs.offer-processing-note-dto :refer :all]
            [партнерский-api-маркета.specs.update-campaign-offers-request :refer :all]
            [партнерский-api-маркета.specs.delete-offers-dto :refer :all]
            [партнерский-api-маркета.specs.chat-message-dto :refer :all]
            [партнерский-api-маркета.specs.get-campaign-offers-request :refer :all]
            [партнерский-api-маркета.specs.feed-status-type :refer :all]
            [партнерский-api-маркета.specs.add-offers-to-archive-response :refer :all]
            [партнерский-api-маркета.specs.get-feed-index-logs-response :refer :all]
            [партнерский-api-маркета.specs.get-outlet-response :refer :all]
            [партнерский-api-маркета.specs.orders-stats-price-type :refer :all]
            [партнерский-api-маркета.specs.update-goods-feedback-comment-request :refer :all]
            [партнерский-api-маркета.specs.order-delivery-date-dto :refer :all]
            [партнерский-api-маркета.specs.goods-feedback-comment-dto :refer :all]
            [партнерский-api-маркета.specs.feed-index-logs-index-type :refer :all]
            [партнерский-api-маркета.specs.set-order-shipment-boxes-request :refer :all]
            [партнерский-api-маркета.specs.goods-stats-dto :refer :all]
            [партнерский-api-маркета.specs.order-box-layout-dto :refer :all]
            [партнерский-api-маркета.specs.order-status-change-delivery-dto :refer :all]
            [партнерский-api-маркета.specs.order-box-layout-partial-count-dto :refer :all]
            [партнерский-api-маркета.specs.get-models-request :refer :all]
            [партнерский-api-маркета.specs.get-offer-cards-content-status-response :refer :all]
            [партнерский-api-маркета.specs.order-items-modification-result-dto :refer :all]
            [партнерский-api-маркета.specs.promo-offer-params-dto :refer :all]
            [партнерский-api-маркета.specs.fulfillment-warehouses-dto :refer :all]
            [партнерский-api-маркета.specs.order-state-dto :refer :all]
            [партнерский-api-маркета.specs.order-payment-method-type :refer :all]
            [партнерский-api-маркета.specs.order-subsidy-dto :refer :all]
            [партнерский-api-маркета.specs.get-goods-feedback-comments-request :refer :all]
            [партнерский-api-маркета.specs.get-promo-promocode-info-dto :refer :all]
            [партнерский-api-маркета.specs.update-order-statuses-response :refer :all]
            [партнерский-api-маркета.specs.feed-index-logs-feed-dto :refer :all]
            [партнерский-api-маркета.specs.get-business-documents-info-response :refer :all]
            [партнерский-api-маркета.specs.get-promo-offers-response :refer :all]
            [партнерский-api-маркета.specs.offer-category :refer :all]
            [партнерский-api-маркета.specs.offer-description :refer :all]
            [партнерский-api-маркета.specs.return-item-dto :refer :all]
            [партнерский-api-маркета.specs.get-bids-recommendations-request :refer :all]
            [партнерский-api-маркета.specs.generate-prices-report-request :refer :all]
            [партнерский-api-маркета.specs.offer-card-dto :refer :all]
            [партнерский-api-маркета.specs.update-offer-dto :refer :all]
            [партнерский-api-маркета.specs.offer-card-recommendation-type :refer :all]
            [партнерский-api-маркета.specs.enriched-order-box-layout-dto :refer :all]
            [партнерский-api-маркета.specs.enriched-mappings-offer-dto :refer :all]
            [партнерский-api-маркета.specs.shipment-info-dto :refer :all]
            [партнерский-api-маркета.specs.tariff-type :refer :all]
            [партнерский-api-маркета.specs.get-category-content-parameters-response :refer :all]
            [партнерский-api-маркета.specs.suggest-prices-response :refer :all]
            [партнерский-api-маркета.specs.return-instance-stock-type :refer :all]
            [партнерский-api-маркета.specs.get-promo-offers-request :refer :all]
            [партнерский-api-маркета.specs.api-locked-error-response :refer :all]
            [партнерский-api-маркета.specs.time-period-dto :refer :all]
            [партнерский-api-маркета.specs.get-campaign-settings-response :refer :all]
            [партнерский-api-маркета.specs.quality-rating-details-dto :refer :all]
            [партнерский-api-маркета.specs.offer-cards-content-status-dto :refer :all]
            [партнерский-api-маркета.specs.offer-card-recommendation-dto :refer :all]
            [партнерский-api-маркета.specs.offer-mapping-entries-dto :refer :all]
            [партнерский-api-маркета.specs.price-suggest-offer-dto :refer :all]
            [партнерский-api-маркета.specs.update-goods-feedback-comment-response :refer :all]
            [партнерский-api-маркета.specs.order-buyer-info-dto :refer :all]
            [партнерский-api-маркета.specs.feed-index-logs-record-dto :refer :all]
            [партнерский-api-маркета.specs.calculated-tariff-dto :refer :all]
            [партнерский-api-маркета.specs.verify-order-eac-response :refer :all]
            [партнерский-api-маркета.specs.feedback-comment-author-type :refer :all]
            [партнерский-api-маркета.specs.order-status-type :refer :all]
            [партнерский-api-маркета.specs.update-stock-dto :refer :all]
            [партнерский-api-маркета.specs.outlet-status-type :refer :all]
            [партнерский-api-маркета.specs.order-buyer-basic-info-dto :refer :all]
            [партнерский-api-маркета.specs.get-orders-stats-request :refer :all]
            [партнерский-api-маркета.specs.shipment-boxes-dto :refer :all]
            [партнерский-api-маркета.specs.warehouse-offers-dto :refer :all]
            [партнерский-api-маркета.specs.warehouse-address-dto :refer :all]
            [партнерский-api-маркета.specs.offer-mapping-dto :refer :all]
            [партнерский-api-маркета.specs.return-decision-dto :refer :all]
            [партнерский-api-маркета.specs.verify-order-eac-request :refer :all]
            [партнерский-api-маркета.specs.get-order-response :refer :all]
            [партнерский-api-маркета.specs.price-quarantine-verdict-dto :refer :all]
            [партнерский-api-маркета.specs.order-track-dto :refer :all]
            [партнерский-api-маркета.specs.get-orders-response :refer :all]
            [партнерский-api-маркета.specs.get-categories-request :refer :all]
            [партнерский-api-маркета.specs.order-delivery-dates-dto :refer :all]
            [партнерский-api-маркета.specs.update-offer-mapping-dto :refer :all]
            [партнерский-api-маркета.specs.campaign-settings-local-region-dto :refer :all]
            [партнерский-api-маркета.specs.update-order-status-dto :refer :all]
            [партнерский-api-маркета.specs.outlet-license-dto :refer :all]
            [партнерский-api-маркета.specs.search-shipments-request :refer :all]
            [партнерский-api-маркета.specs.get-chats-info-dto :refer :all]
            [партнерский-api-маркета.specs.flipping-pager-dto :refer :all]
            [партнерский-api-маркета.specs.suggested-offer-mapping-dto :refer :all]
            [партнерский-api-маркета.specs.order-subsidy-type :refer :all]
            [партнерский-api-маркета.specs.offer-price-by-offer-ids-list-response-dto :refer :all]
            [партнерский-api-маркета.specs.affected-order-quality-rating-component-type :refer :all]
            [партнерский-api-маркета.specs.order-promo-type :refer :all]
            [партнерский-api-маркета.specs.recipient-type :refer :all]
            [партнерский-api-маркета.specs.put-sku-bids-request :refer :all]
            [партнерский-api-маркета.specs.category-parameter-unit-dto :refer :all]
            [партнерский-api-маркета.specs.regional-model-info-dto :refer :all]
            [партнерский-api-маркета.specs.orders-stats-warehouse-dto :refer :all]
            [партнерский-api-маркета.specs.offer-content-error-dto :refer :all]
            [партнерский-api-маркета.specs.set-order-delivery-date-request :refer :all]
            [партнерский-api-маркета.specs.search-shipments-response-dto :refer :all]
            [партнерский-api-маркета.specs.category-id :refer :all]
            [партнерский-api-маркета.specs.max-sale-quantum-dto :refer :all]
            [партнерский-api-маркета.specs.update-time-dto :refer :all]
            [партнерский-api-маркета.specs.sort-order-type :refer :all]
            [партнерский-api-маркета.specs.api-error-response :refer :all]
            [партнерский-api-маркета.specs.update-campaign-offer-dto :refer :all]
            [партнерский-api-маркета.specs.parcel-box-dto :refer :all]
            [партнерский-api-маркета.specs.offer-mapping-info-dto :refer :all]
            )
  (:import (java.io File)))


(defn-spec add-hidden-offers-with-http-info any?
  "Скрытие товаров и настройки скрытия
  Скрывает товары магазина на Маркете.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  [campaignId int?, add-hidden-offers-request add-hidden-offers-request]
  (check-required-params campaignId add-hidden-offers-request)
  (call-api "/campaigns/{campaignId}/hidden-offers" :post
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    add-hidden-offers-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec add-hidden-offers empty-api-response-spec
  "Скрытие товаров и настройки скрытия
  Скрывает товары магазина на Маркете.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  [campaignId int?, add-hidden-offers-request add-hidden-offers-request]
  (let [res (:data (add-hidden-offers-with-http-info campaignId add-hidden-offers-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec add-offers-to-archive-with-http-info any?
  "Добавление товаров в архив
  Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.

{% note warning \"В архив нельзя отправить товар, который хранится на складе Маркета\" %}

Вначале такой товар нужно распродать или вывезти.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|"
  [businessId int?, add-offers-to-archive-request add-offers-to-archive-request]
  (check-required-params businessId add-offers-to-archive-request)
  (call-api "/businesses/{businessId}/offer-mappings/archive" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    add-offers-to-archive-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec add-offers-to-archive add-offers-to-archive-response-spec
  "Добавление товаров в архив
  Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.

{% note warning \"В архив нельзя отправить товар, который хранится на складе Маркета\" %}

Вначале такой товар нужно распродать или вывезти.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|"
  [businessId int?, add-offers-to-archive-request add-offers-to-archive-request]
  (let [res (:data (add-offers-to-archive-with-http-info businessId add-offers-to-archive-request))]
    (if (:decode-models *api-context*)
       (st/decode add-offers-to-archive-response-spec res st/string-transformer)
       res)))


(defn-spec calculate-tariffs-with-http-info any?
  "Калькулятор стоимости услуг
  Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить,
для какого товара рассчитана стоимость услуги.

Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.

В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|"
  [calculate-tariffs-request calculate-tariffs-request]
  (check-required-params calculate-tariffs-request)
  (call-api "/tariffs/calculate" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    calculate-tariffs-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec calculate-tariffs calculate-tariffs-response-spec
  "Калькулятор стоимости услуг
  Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить,
для какого товара рассчитана стоимость услуги.

Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.

В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|"
  [calculate-tariffs-request calculate-tariffs-request]
  (let [res (:data (calculate-tariffs-with-http-info calculate-tariffs-request))]
    (if (:decode-models *api-context*)
       (st/decode calculate-tariffs-response-spec res st/string-transformer)
       res)))


(defn-spec confirm-business-prices-with-http-info any?
  "Удаление товара из карантина по цене в кабинете
  Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.

Основная цена задается в каталоге и действует во всех магазинах кабинета.

Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|"
  [businessId int?, confirm-prices-request confirm-prices-request]
  (check-required-params businessId confirm-prices-request)
  (call-api "/businesses/{businessId}/price-quarantine/confirm" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    confirm-prices-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec confirm-business-prices empty-api-response-spec
  "Удаление товара из карантина по цене в кабинете
  Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.

Основная цена задается в каталоге и действует во всех магазинах кабинета.

Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|"
  [businessId int?, confirm-prices-request confirm-prices-request]
  (let [res (:data (confirm-business-prices-with-http-info businessId confirm-prices-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec confirm-campaign-prices-with-http-info any?
  "Удаление товара из карантина по цене в магазине
  Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.

Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  [campaignId int?, confirm-prices-request confirm-prices-request]
  (check-required-params campaignId confirm-prices-request)
  (call-api "/campaigns/{campaignId}/price-quarantine/confirm" :post
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    confirm-prices-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec confirm-campaign-prices empty-api-response-spec
  "Удаление товара из карантина по цене в магазине
  Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.

Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  [campaignId int?, confirm-prices-request confirm-prices-request]
  (let [res (:data (confirm-campaign-prices-with-http-info campaignId confirm-prices-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec confirm-shipment-with-http-info any?
  "Подтверждение отгрузки
  Подтверждает отгрузку товаров в сортировочный центр или пункт приема заказов.
|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([campaignId int?, shipmentId int?, ] (confirm-shipment-with-http-info campaignId shipmentId nil))
  ([campaignId int?, shipmentId int?, {:keys [confirm-shipment-request]} (s/map-of keyword? any?)]
   (check-required-params campaignId shipmentId)
   (call-api "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm" :post
             {:path-params   {"campaignId" campaignId "shipmentId" shipmentId }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    confirm-shipment-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec confirm-shipment empty-api-response-spec
  "Подтверждение отгрузки
  Подтверждает отгрузку товаров в сортировочный центр или пункт приема заказов.
|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([campaignId int?, shipmentId int?, ] (confirm-shipment campaignId shipmentId nil))
  ([campaignId int?, shipmentId int?, optional-params any?]
   (let [res (:data (confirm-shipment-with-http-info campaignId shipmentId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode empty-api-response-spec res st/string-transformer)
        res))))


(defn-spec create-chat-with-http-info any?
  "Создание нового чата с покупателем
  Создает новый чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [businessId int?, create-chat-request create-chat-request]
  (check-required-params businessId create-chat-request)
  (call-api "/businesses/{businessId}/chats/new" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    create-chat-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec create-chat create-chat-response-spec
  "Создание нового чата с покупателем
  Создает новый чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [businessId int?, create-chat-request create-chat-request]
  (let [res (:data (create-chat-with-http-info businessId create-chat-request))]
    (if (:decode-models *api-context*)
       (st/decode create-chat-response-spec res st/string-transformer)
       res)))


(defn-spec delete-campaign-offers-with-http-info any?
  "Удаление товаров из ассортимента магазина
  Удаляет заданные товары из заданного магазина.

{% note warning \"Запрос удаляет товары именно из конкретного магазина\" %}

На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.

{% endnote %}

Товар не получится удалить, если он хранится на складах Маркета.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  [campaignId int?, delete-campaign-offers-request delete-campaign-offers-request]
  (check-required-params campaignId delete-campaign-offers-request)
  (call-api "/campaigns/{campaignId}/offers/delete" :post
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    delete-campaign-offers-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec delete-campaign-offers delete-campaign-offers-response-spec
  "Удаление товаров из ассортимента магазина
  Удаляет заданные товары из заданного магазина.

{% note warning \"Запрос удаляет товары именно из конкретного магазина\" %}

На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.

{% endnote %}

Товар не получится удалить, если он хранится на складах Маркета.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  [campaignId int?, delete-campaign-offers-request delete-campaign-offers-request]
  (let [res (:data (delete-campaign-offers-with-http-info campaignId delete-campaign-offers-request))]
    (if (:decode-models *api-context*)
       (st/decode delete-campaign-offers-response-spec res st/string-transformer)
       res)))


(defn-spec delete-goods-feedback-comment-with-http-info any?
  "Удаление комментария к отзыву
  Удаляет комментарий магазина.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|"
  [businessId int?, delete-goods-feedback-comment-request delete-goods-feedback-comment-request]
  (check-required-params businessId delete-goods-feedback-comment-request)
  (call-api "/businesses/{businessId}/goods-feedback/comments/delete" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    delete-goods-feedback-comment-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec delete-goods-feedback-comment empty-api-response-spec
  "Удаление комментария к отзыву
  Удаляет комментарий магазина.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|"
  [businessId int?, delete-goods-feedback-comment-request delete-goods-feedback-comment-request]
  (let [res (:data (delete-goods-feedback-comment-with-http-info businessId delete-goods-feedback-comment-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec delete-hidden-offers-with-http-info any?
  "Возобновление показа товаров
  Возобновляет показ скрытых вами товаров магазина на Маркете.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  [campaignId int?, delete-hidden-offers-request delete-hidden-offers-request]
  (check-required-params campaignId delete-hidden-offers-request)
  (call-api "/campaigns/{campaignId}/hidden-offers/delete" :post
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    delete-hidden-offers-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec delete-hidden-offers empty-api-response-spec
  "Возобновление показа товаров
  Возобновляет показ скрытых вами товаров магазина на Маркете.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  [campaignId int?, delete-hidden-offers-request delete-hidden-offers-request]
  (let [res (:data (delete-hidden-offers-with-http-info campaignId delete-hidden-offers-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec delete-offers-with-http-info any?
  "Удаление товаров из каталога
  Удаляет товары из каталога.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|"
  [businessId int?, delete-offers-request delete-offers-request]
  (check-required-params businessId delete-offers-request)
  (call-api "/businesses/{businessId}/offer-mappings/delete" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    delete-offers-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec delete-offers delete-offers-response-spec
  "Удаление товаров из каталога
  Удаляет товары из каталога.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|"
  [businessId int?, delete-offers-request delete-offers-request]
  (let [res (:data (delete-offers-with-http-info businessId delete-offers-request))]
    (if (:decode-models *api-context*)
       (st/decode delete-offers-response-spec res st/string-transformer)
       res)))


(defn-spec delete-offers-from-archive-with-http-info any?
  "Удаление товаров из архива
  Восстанавливает товары из архива.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|"
  [businessId int?, delete-offers-from-archive-request delete-offers-from-archive-request]
  (check-required-params businessId delete-offers-from-archive-request)
  (call-api "/businesses/{businessId}/offer-mappings/unarchive" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    delete-offers-from-archive-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec delete-offers-from-archive delete-offers-from-archive-response-spec
  "Удаление товаров из архива
  Восстанавливает товары из архива.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|"
  [businessId int?, delete-offers-from-archive-request delete-offers-from-archive-request]
  (let [res (:data (delete-offers-from-archive-with-http-info businessId delete-offers-from-archive-request))]
    (if (:decode-models *api-context*)
       (st/decode delete-offers-from-archive-response-spec res st/string-transformer)
       res)))


(defn-spec delete-promo-offers-with-http-info any?
  "Удаление товаров из акции
  Убирает товары из акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|"
  [businessId int?, delete-promo-offers-request delete-promo-offers-request]
  (check-required-params businessId delete-promo-offers-request)
  (call-api "/businesses/{businessId}/promos/offers/delete" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    delete-promo-offers-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec delete-promo-offers delete-promo-offers-response-spec
  "Удаление товаров из акции
  Убирает товары из акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|"
  [businessId int?, delete-promo-offers-request delete-promo-offers-request]
  (let [res (:data (delete-promo-offers-with-http-info businessId delete-promo-offers-request))]
    (if (:decode-models *api-context*)
       (st/decode delete-promo-offers-response-spec res st/string-transformer)
       res)))


(defn-spec download-shipment-act-with-http-info any?
  "Получение акта приема-передачи
  {% note warning \"Экспресс‑доставка\" %}

Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам Яндекс Go, подготавливать акт приема‑передачи не нужно.

{% endnote %}

Запрос формирует акт приема-передачи заказов, входящих в отгрузку, и возвращает акт в формате PDF. В акте содержатся собранные и готовые к отправке заказы.

При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:

{% cut \"Данные, из которых Маркет формирует акт\" %}

| **Данные в акте**                                         | **Описание**                                                                                                                                                                                                                                                         |
| --------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Дата                                                      | Дата запроса.                                                                                                                                                                                                                                                        |
| Отправитель                                               | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         |
| Исполнитель                                               | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                |
| № отправления в системе заказчика                         | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              |
| № отправления в системе исполнителя (субподрядчика)       | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             |
| Объявленная ценность                                      | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       |
| Вес                                                       | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). |
| Количество мест                                           | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |

{% endcut %}

Остальные поля нужно заполнить самостоятельно в распечатанном акте.
|**⚙️ Лимит:** 100 запросов в час|
|-|"
  [campaignId int?, shipmentId int?]
  (check-required-params campaignId shipmentId)
  (call-api "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act" :get
            {:path-params   {"campaignId" campaignId "shipmentId" shipmentId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/pdf" "application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec download-shipment-act any?
  "Получение акта приема-передачи
  {% note warning \"Экспресс‑доставка\" %}

Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам Яндекс Go, подготавливать акт приема‑передачи не нужно.

{% endnote %}

Запрос формирует акт приема-передачи заказов, входящих в отгрузку, и возвращает акт в формате PDF. В акте содержатся собранные и готовые к отправке заказы.

При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:

{% cut \"Данные, из которых Маркет формирует акт\" %}

| **Данные в акте**                                         | **Описание**                                                                                                                                                                                                                                                         |
| --------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Дата                                                      | Дата запроса.                                                                                                                                                                                                                                                        |
| Отправитель                                               | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         |
| Исполнитель                                               | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                |
| № отправления в системе заказчика                         | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              |
| № отправления в системе исполнителя (субподрядчика)       | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             |
| Объявленная ценность                                      | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       |
| Вес                                                       | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). |
| Количество мест                                           | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |

{% endcut %}

Остальные поля нужно заполнить самостоятельно в распечатанном акте.
|**⚙️ Лимит:** 100 запросов в час|
|-|"
  [campaignId int?, shipmentId int?]
  (let [res (:data (download-shipment-act-with-http-info campaignId shipmentId))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec download-shipment-discrepancy-act-with-http-info any?
  "Получение акта расхождений
  Возвращает акт расхождений для заданной отгрузки.
|**⚙️ Лимит:** 200 запросов в час|
|-|"
  [campaignId int?, shipmentId int?]
  (check-required-params campaignId shipmentId)
  (call-api "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act" :get
            {:path-params   {"campaignId" campaignId "shipmentId" shipmentId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.ms-excel" "application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec download-shipment-discrepancy-act any?
  "Получение акта расхождений
  Возвращает акт расхождений для заданной отгрузки.
|**⚙️ Лимит:** 200 запросов в час|
|-|"
  [campaignId int?, shipmentId int?]
  (let [res (:data (download-shipment-discrepancy-act-with-http-info campaignId shipmentId))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec download-shipment-inbound-act-with-http-info any?
  "Получение фактического акта приема-передачи
  Возвращает фактический акт приема-передачи для заданной отгрузки.

Такой акт становится доступен спустя несколько часов после завершения отгрузки. Он может понадобиться, если после отгрузки обнаружатся расхождения.

|**⚙️ Лимит:** 200 запросов в час|
|-|"
  [campaignId int?, shipmentId int?]
  (check-required-params campaignId shipmentId)
  (call-api "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act" :get
            {:path-params   {"campaignId" campaignId "shipmentId" shipmentId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/pdf" "application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec download-shipment-inbound-act any?
  "Получение фактического акта приема-передачи
  Возвращает фактический акт приема-передачи для заданной отгрузки.

Такой акт становится доступен спустя несколько часов после завершения отгрузки. Он может понадобиться, если после отгрузки обнаружатся расхождения.

|**⚙️ Лимит:** 200 запросов в час|
|-|"
  [campaignId int?, shipmentId int?]
  (let [res (:data (download-shipment-inbound-act-with-http-info campaignId shipmentId))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec download-shipment-pallet-labels-with-http-info any?
  "Ярлыки для доверительной приемки (FBS)
  PDF-файл с ярлыками на каждый короб или палету в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).

Распечатайте по несколько копий каждого ярлыка: на одну тару нужно наклеить минимум 2 ярлыка с разных сторон.

Количество упаковок в отгрузке задается в запросе [PUT campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets](../../reference/shipments/setShipmentPalletsCount.md).
|**⚙️ Лимит:** 200 запросов в час|
|-|"
  ([campaignId int?, shipmentId int?, ] (download-shipment-pallet-labels-with-http-info campaignId shipmentId nil))
  ([campaignId int?, shipmentId int?, {:keys [format]} (s/map-of keyword? any?)]
   (check-required-params campaignId shipmentId)
   (call-api "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels" :get
             {:path-params   {"campaignId" campaignId "shipmentId" shipmentId }
              :header-params {}
              :query-params  {"format" format }
              :form-params   {}
              :content-types []
              :accepts       ["application/pdf" "application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec download-shipment-pallet-labels any?
  "Ярлыки для доверительной приемки (FBS)
  PDF-файл с ярлыками на каждый короб или палету в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).

Распечатайте по несколько копий каждого ярлыка: на одну тару нужно наклеить минимум 2 ярлыка с разных сторон.

Количество упаковок в отгрузке задается в запросе [PUT campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets](../../reference/shipments/setShipmentPalletsCount.md).
|**⚙️ Лимит:** 200 запросов в час|
|-|"
  ([campaignId int?, shipmentId int?, ] (download-shipment-pallet-labels campaignId shipmentId nil))
  ([campaignId int?, shipmentId int?, optional-params any?]
   (let [res (:data (download-shipment-pallet-labels-with-http-info campaignId shipmentId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec download-shipment-reception-transfer-act-with-http-info any?
  "Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
  Запрос подтверждает ближайшую отгрузку и возвращает акт приема-передачи в формате PDF.

{% note warning \"Экспресс‑доставка\" %}

Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам [Яндекс Go](https://go.yandex/), подготавливать акт приема‑передачи не нужно.

{% endnote %}

В акт входят собранные и готовые к отправке заказы, которые отгружаются в сортировочный центр или пункт приема или курьерам Маркета.

При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:

{% cut \"Данные, из которых Маркет формирует акт\" %}

| **Данные в акте**	                                  | **Описание**                                                                                                                                                                                                                                                         |
| --------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Отправитель	                                        | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         |
| Исполнитель                                         | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                |
| № отправления в системе заказчика                   | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              |
| № отправления в системе исполнителя (субподрядчика) | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             |
| Объявленная ценность                                | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       |
| Стоимость всех товаров в заказе                     | Стоимость всех заказанных товаров.                                                                                                                                                                                                                                   |
| Вес                                                 | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). |
| Количество мест                                     | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |

{% endcut %}

Остальные поля нужно заполнить самостоятельно в распечатанном акте.
|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([campaignId int?, ] (download-shipment-reception-transfer-act-with-http-info campaignId nil))
  ([campaignId int?, {:keys [warehouse_id]} (s/map-of keyword? any?)]
   (check-required-params campaignId)
   (call-api "/campaigns/{campaignId}/shipments/reception-transfer-act" :get
             {:path-params   {"campaignId" campaignId }
              :header-params {}
              :query-params  {"warehouse_id" warehouse_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/pdf" "application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec download-shipment-reception-transfer-act any?
  "Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
  Запрос подтверждает ближайшую отгрузку и возвращает акт приема-передачи в формате PDF.

{% note warning \"Экспресс‑доставка\" %}

Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам [Яндекс Go](https://go.yandex/), подготавливать акт приема‑передачи не нужно.

{% endnote %}

В акт входят собранные и готовые к отправке заказы, которые отгружаются в сортировочный центр или пункт приема или курьерам Маркета.

При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:

{% cut \"Данные, из которых Маркет формирует акт\" %}

| **Данные в акте**	                                  | **Описание**                                                                                                                                                                                                                                                         |
| --------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Отправитель	                                        | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         |
| Исполнитель                                         | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                |
| № отправления в системе заказчика                   | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              |
| № отправления в системе исполнителя (субподрядчика) | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             |
| Объявленная ценность                                | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       |
| Стоимость всех товаров в заказе                     | Стоимость всех заказанных товаров.                                                                                                                                                                                                                                   |
| Вес                                                 | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). |
| Количество мест                                     | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |

{% endcut %}

Остальные поля нужно заполнить самостоятельно в распечатанном акте.
|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([campaignId int?, ] (download-shipment-reception-transfer-act campaignId nil))
  ([campaignId int?, optional-params any?]
   (let [res (:data (download-shipment-reception-transfer-act-with-http-info campaignId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec download-shipment-transportation-waybill-with-http-info any?
  "Получение транспортной накладной
  Возвращает транспортную накладную для заданной отгрузки.

Транспортная накладная понадобится, если вы отгружаете товары непосредственно со своего склада. [Подробно об этом способе отгрузки](https://yandex.ru/support/marketplace/orders/fbs/settings/shipment.html#at-your-warehouse)

|**⚙️ Лимит:** 200 запросов в час|
|-|"
  [campaignId int?, shipmentId int?]
  (check-required-params campaignId shipmentId)
  (call-api "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill" :get
            {:path-params   {"campaignId" campaignId "shipmentId" shipmentId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/vnd.ms-excel" "application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec download-shipment-transportation-waybill any?
  "Получение транспортной накладной
  Возвращает транспортную накладную для заданной отгрузки.

Транспортная накладная понадобится, если вы отгружаете товары непосредственно со своего склада. [Подробно об этом способе отгрузки](https://yandex.ru/support/marketplace/orders/fbs/settings/shipment.html#at-your-warehouse)

|**⚙️ Лимит:** 200 запросов в час|
|-|"
  [campaignId int?, shipmentId int?]
  (let [res (:data (download-shipment-transportation-waybill-with-http-info campaignId shipmentId))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec generate-boost-consolidated-report-with-http-info any?
  "Отчет по бусту продаж
  Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-boost-consolidated-request generate-boost-consolidated-request, ] (generate-boost-consolidated-report-with-http-info generate-boost-consolidated-request nil))
  ([generate-boost-consolidated-request generate-boost-consolidated-request, {:keys [format]} (s/map-of keyword? any?)]
   (check-required-params generate-boost-consolidated-request)
   (call-api "/reports/boost-consolidated/generate" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"format" format }
              :form-params   {}
              :body-param    generate-boost-consolidated-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec generate-boost-consolidated-report generate-report-response-spec
  "Отчет по бусту продаж
  Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-boost-consolidated-request generate-boost-consolidated-request, ] (generate-boost-consolidated-report generate-boost-consolidated-request nil))
  ([generate-boost-consolidated-request generate-boost-consolidated-request, optional-params any?]
   (let [res (:data (generate-boost-consolidated-report-with-http-info generate-boost-consolidated-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode generate-report-response-spec res st/string-transformer)
        res))))


(defn-spec generate-competitors-position-report-with-http-info any?
  "Отчет «Конкурентная позиция»
  Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

{% note info \"Значение -1 в отчете\" %}

Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.

{% endnote %}

|**⚙️ Лимит:** 10 запросов в час|
|-|"
  ([generate-competitors-position-report-request generate-competitors-position-report-request, ] (generate-competitors-position-report-with-http-info generate-competitors-position-report-request nil))
  ([generate-competitors-position-report-request generate-competitors-position-report-request, {:keys [format]} (s/map-of keyword? any?)]
   (check-required-params generate-competitors-position-report-request)
   (call-api "/reports/competitors-position/generate" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"format" format }
              :form-params   {}
              :body-param    generate-competitors-position-report-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec generate-competitors-position-report generate-report-response-spec
  "Отчет «Конкурентная позиция»
  Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

{% note info \"Значение -1 в отчете\" %}

Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.

{% endnote %}

|**⚙️ Лимит:** 10 запросов в час|
|-|"
  ([generate-competitors-position-report-request generate-competitors-position-report-request, ] (generate-competitors-position-report generate-competitors-position-report-request nil))
  ([generate-competitors-position-report-request generate-competitors-position-report-request, optional-params any?]
   (let [res (:data (generate-competitors-position-report-with-http-info generate-competitors-position-report-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode generate-report-response-spec res st/string-transformer)
        res))))


(defn-spec generate-goods-feedback-report-with-http-info any?
  "Отчет по отзывам о товарах
  Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-goods-feedback-request generate-goods-feedback-request, ] (generate-goods-feedback-report-with-http-info generate-goods-feedback-request nil))
  ([generate-goods-feedback-request generate-goods-feedback-request, {:keys [format]} (s/map-of keyword? any?)]
   (check-required-params generate-goods-feedback-request)
   (call-api "/reports/goods-feedback/generate" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"format" format }
              :form-params   {}
              :body-param    generate-goods-feedback-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec generate-goods-feedback-report generate-report-response-spec
  "Отчет по отзывам о товарах
  Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-goods-feedback-request generate-goods-feedback-request, ] (generate-goods-feedback-report generate-goods-feedback-request nil))
  ([generate-goods-feedback-request generate-goods-feedback-request, optional-params any?]
   (let [res (:data (generate-goods-feedback-report-with-http-info generate-goods-feedback-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode generate-report-response-spec res st/string-transformer)
        res))))


(defn-spec generate-goods-realization-report-with-http-info any?
  "Отчет по реализации
  Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-goods-realization-report-request generate-goods-realization-report-request, ] (generate-goods-realization-report-with-http-info generate-goods-realization-report-request nil))
  ([generate-goods-realization-report-request generate-goods-realization-report-request, {:keys [format]} (s/map-of keyword? any?)]
   (check-required-params generate-goods-realization-report-request)
   (call-api "/reports/goods-realization/generate" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"format" format }
              :form-params   {}
              :body-param    generate-goods-realization-report-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec generate-goods-realization-report generate-report-response-spec
  "Отчет по реализации
  Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-goods-realization-report-request generate-goods-realization-report-request, ] (generate-goods-realization-report generate-goods-realization-report-request nil))
  ([generate-goods-realization-report-request generate-goods-realization-report-request, optional-params any?]
   (let [res (:data (generate-goods-realization-report-with-http-info generate-goods-realization-report-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode generate-report-response-spec res st/string-transformer)
        res))))


(defn-spec generate-mass-order-labels-report-with-http-info any?
  "Готовые ярлыки‑наклейки на все коробки в нескольких заказах
  Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).

Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  ([generate-mass-order-labels-request generate-mass-order-labels-request, ] (generate-mass-order-labels-report-with-http-info generate-mass-order-labels-request nil))
  ([generate-mass-order-labels-request generate-mass-order-labels-request, {:keys [format]} (s/map-of keyword? any?)]
   (check-required-params generate-mass-order-labels-request)
   (call-api "/reports/documents/labels/generate" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"format" format }
              :form-params   {}
              :body-param    generate-mass-order-labels-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec generate-mass-order-labels-report generate-report-response-spec
  "Готовые ярлыки‑наклейки на все коробки в нескольких заказах
  Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).

Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  ([generate-mass-order-labels-request generate-mass-order-labels-request, ] (generate-mass-order-labels-report generate-mass-order-labels-request nil))
  ([generate-mass-order-labels-request generate-mass-order-labels-request, optional-params any?]
   (let [res (:data (generate-mass-order-labels-report-with-http-info generate-mass-order-labels-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode generate-report-response-spec res st/string-transformer)
        res))))


(defn-spec generate-order-label-with-http-info any?
  "Готовый ярлык‑наклейка для коробки в заказе
  Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  ([campaignId int?, orderId int?, shipmentId int?, boxId int?, ] (generate-order-label-with-http-info campaignId orderId shipmentId boxId nil))
  ([campaignId int?, orderId int?, shipmentId int?, boxId int?, {:keys [format]} (s/map-of keyword? any?)]
   (check-required-params campaignId orderId shipmentId boxId)
   (call-api "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label" :get
             {:path-params   {"campaignId" campaignId "orderId" orderId "shipmentId" shipmentId "boxId" boxId }
              :header-params {}
              :query-params  {"format" format }
              :form-params   {}
              :content-types []
              :accepts       ["application/pdf" "application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec generate-order-label any?
  "Готовый ярлык‑наклейка для коробки в заказе
  Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  ([campaignId int?, orderId int?, shipmentId int?, boxId int?, ] (generate-order-label campaignId orderId shipmentId boxId nil))
  ([campaignId int?, orderId int?, shipmentId int?, boxId int?, optional-params any?]
   (let [res (:data (generate-order-label-with-http-info campaignId orderId shipmentId boxId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec generate-order-labels-with-http-info any?
  "Готовые ярлыки‑наклейки на все коробки в одном заказе
  Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).

На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  ([campaignId int?, orderId int?, ] (generate-order-labels-with-http-info campaignId orderId nil))
  ([campaignId int?, orderId int?, {:keys [format]} (s/map-of keyword? any?)]
   (check-required-params campaignId orderId)
   (call-api "/campaigns/{campaignId}/orders/{orderId}/delivery/labels" :get
             {:path-params   {"campaignId" campaignId "orderId" orderId }
              :header-params {}
              :query-params  {"format" format }
              :form-params   {}
              :content-types []
              :accepts       ["application/pdf" "application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec generate-order-labels any?
  "Готовые ярлыки‑наклейки на все коробки в одном заказе
  Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).

На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  ([campaignId int?, orderId int?, ] (generate-order-labels campaignId orderId nil))
  ([campaignId int?, orderId int?, optional-params any?]
   (let [res (:data (generate-order-labels-with-http-info campaignId orderId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec generate-prices-report-with-http-info any?
  "Отчет «Цены на рынке»
  Запускает генерацию **отчета «Цены на рынке»**.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-prices-report-request generate-prices-report-request, ] (generate-prices-report-with-http-info generate-prices-report-request nil))
  ([generate-prices-report-request generate-prices-report-request, {:keys [format]} (s/map-of keyword? any?)]
   (check-required-params generate-prices-report-request)
   (call-api "/reports/prices/generate" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"format" format }
              :form-params   {}
              :body-param    generate-prices-report-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec generate-prices-report generate-report-response-spec
  "Отчет «Цены на рынке»
  Запускает генерацию **отчета «Цены на рынке»**.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-prices-report-request generate-prices-report-request, ] (generate-prices-report generate-prices-report-request nil))
  ([generate-prices-report-request generate-prices-report-request, optional-params any?]
   (let [res (:data (generate-prices-report-with-http-info generate-prices-report-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode generate-report-response-spec res st/string-transformer)
        res))))


(defn-spec generate-shelfs-statistics-report-with-http-info any?
  "Отчет по полкам
  Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-shelfs-statistics-request generate-shelfs-statistics-request, ] (generate-shelfs-statistics-report-with-http-info generate-shelfs-statistics-request nil))
  ([generate-shelfs-statistics-request generate-shelfs-statistics-request, {:keys [format]} (s/map-of keyword? any?)]
   (check-required-params generate-shelfs-statistics-request)
   (call-api "/reports/shelf-statistics/generate" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"format" format }
              :form-params   {}
              :body-param    generate-shelfs-statistics-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec generate-shelfs-statistics-report generate-report-response-spec
  "Отчет по полкам
  Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-shelfs-statistics-request generate-shelfs-statistics-request, ] (generate-shelfs-statistics-report generate-shelfs-statistics-request nil))
  ([generate-shelfs-statistics-request generate-shelfs-statistics-request, optional-params any?]
   (let [res (:data (generate-shelfs-statistics-report-with-http-info generate-shelfs-statistics-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode generate-report-response-spec res st/string-transformer)
        res))))


(defn-spec generate-shipment-list-document-report-with-http-info any?
  "Получение листа сборки
  Запускает генерацию **листа сборки** для отгрузки.

Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  [generate-shipment-list-document-report-request generate-shipment-list-document-report-request]
  (check-required-params generate-shipment-list-document-report-request)
  (call-api "/reports/documents/shipment-list/generate" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    generate-shipment-list-document-report-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec generate-shipment-list-document-report generate-report-response-spec
  "Получение листа сборки
  Запускает генерацию **листа сборки** для отгрузки.

Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  [generate-shipment-list-document-report-request generate-shipment-list-document-report-request]
  (let [res (:data (generate-shipment-list-document-report-with-http-info generate-shipment-list-document-report-request))]
    (if (:decode-models *api-context*)
       (st/decode generate-report-response-spec res st/string-transformer)
       res)))


(defn-spec generate-shows-sales-report-with-http-info any?
  "Отчет «Аналитика продаж»
  Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 10 запросов в час|
|-|"
  ([generate-shows-sales-report-request generate-shows-sales-report-request, ] (generate-shows-sales-report-with-http-info generate-shows-sales-report-request nil))
  ([generate-shows-sales-report-request generate-shows-sales-report-request, {:keys [format]} (s/map-of keyword? any?)]
   (check-required-params generate-shows-sales-report-request)
   (call-api "/reports/shows-sales/generate" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"format" format }
              :form-params   {}
              :body-param    generate-shows-sales-report-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec generate-shows-sales-report generate-report-response-spec
  "Отчет «Аналитика продаж»
  Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 10 запросов в час|
|-|"
  ([generate-shows-sales-report-request generate-shows-sales-report-request, ] (generate-shows-sales-report generate-shows-sales-report-request nil))
  ([generate-shows-sales-report-request generate-shows-sales-report-request, optional-params any?]
   (let [res (:data (generate-shows-sales-report-with-http-info generate-shows-sales-report-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode generate-report-response-spec res st/string-transformer)
        res))))


(defn-spec generate-stocks-on-warehouses-report-with-http-info any?
  "Отчет по остаткам на складах
  Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:

* Для модели FBY — об остатках на складах Маркета.
* Для остальных моделей — об остатках на соответствующем складе магазина.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-stocks-on-warehouses-report-request generate-stocks-on-warehouses-report-request, ] (generate-stocks-on-warehouses-report-with-http-info generate-stocks-on-warehouses-report-request nil))
  ([generate-stocks-on-warehouses-report-request generate-stocks-on-warehouses-report-request, {:keys [format]} (s/map-of keyword? any?)]
   (check-required-params generate-stocks-on-warehouses-report-request)
   (call-api "/reports/stocks-on-warehouses/generate" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"format" format }
              :form-params   {}
              :body-param    generate-stocks-on-warehouses-report-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec generate-stocks-on-warehouses-report generate-report-response-spec
  "Отчет по остаткам на складах
  Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:

* Для модели FBY — об остатках на складах Маркета.
* Для остальных моделей — об остатках на соответствующем складе магазина.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-stocks-on-warehouses-report-request generate-stocks-on-warehouses-report-request, ] (generate-stocks-on-warehouses-report generate-stocks-on-warehouses-report-request nil))
  ([generate-stocks-on-warehouses-report-request generate-stocks-on-warehouses-report-request, optional-params any?]
   (let [res (:data (generate-stocks-on-warehouses-report-with-http-info generate-stocks-on-warehouses-report-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode generate-report-response-spec res st/string-transformer)
        res))))


(defn-spec generate-united-marketplace-services-report-with-http-info any?
  "Отчет по стоимости услуг
  Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**               |**Какие поля нужны**             |
|-----------------------------|---------------------------------|
|По дате начисления услуги    |`dateFrom` и `dateTo`            |
|По дате формирования акта    |`year` и `month`                 |

Заказать отчеты обоих типов одним запросом нельзя.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-united-marketplace-services-report-request generate-united-marketplace-services-report-request, ] (generate-united-marketplace-services-report-with-http-info generate-united-marketplace-services-report-request nil))
  ([generate-united-marketplace-services-report-request generate-united-marketplace-services-report-request, {:keys [format]} (s/map-of keyword? any?)]
   (check-required-params generate-united-marketplace-services-report-request)
   (call-api "/reports/united-marketplace-services/generate" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"format" format }
              :form-params   {}
              :body-param    generate-united-marketplace-services-report-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec generate-united-marketplace-services-report generate-report-response-spec
  "Отчет по стоимости услуг
  Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**               |**Какие поля нужны**             |
|-----------------------------|---------------------------------|
|По дате начисления услуги    |`dateFrom` и `dateTo`            |
|По дате формирования акта    |`year` и `month`                 |

Заказать отчеты обоих типов одним запросом нельзя.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-united-marketplace-services-report-request generate-united-marketplace-services-report-request, ] (generate-united-marketplace-services-report generate-united-marketplace-services-report-request nil))
  ([generate-united-marketplace-services-report-request generate-united-marketplace-services-report-request, optional-params any?]
   (let [res (:data (generate-united-marketplace-services-report-with-http-info generate-united-marketplace-services-report-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode generate-report-response-spec res st/string-transformer)
        res))))


(defn-spec generate-united-netting-report-with-http-info any?
  "Отчет по платежам
  Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**           |**Какие поля нужны**                   |
|-------------------------|---------------------------------------|
|О платежах за период     |`dateFrom` и `dateTo`                  |
|О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |

Заказать отчеты обоих типов одним запросом нельзя.

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-united-netting-report-request generate-united-netting-report-request, ] (generate-united-netting-report-with-http-info generate-united-netting-report-request nil))
  ([generate-united-netting-report-request generate-united-netting-report-request, {:keys [format]} (s/map-of keyword? any?)]
   (check-required-params generate-united-netting-report-request)
   (call-api "/reports/united-netting/generate" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"format" format }
              :form-params   {}
              :body-param    generate-united-netting-report-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec generate-united-netting-report generate-report-response-spec
  "Отчет по платежам
  Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**           |**Какие поля нужны**                   |
|-------------------------|---------------------------------------|
|О платежах за период     |`dateFrom` и `dateTo`                  |
|О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |

Заказать отчеты обоих типов одним запросом нельзя.

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-united-netting-report-request generate-united-netting-report-request, ] (generate-united-netting-report generate-united-netting-report-request nil))
  ([generate-united-netting-report-request generate-united-netting-report-request, optional-params any?]
   (let [res (:data (generate-united-netting-report-with-http-info generate-united-netting-report-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode generate-report-response-spec res st/string-transformer)
        res))))


(defn-spec generate-united-orders-report-with-http-info any?
  "Отчет по заказам
  Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)

{% note info \"\" %}

Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)

{% endnote %}

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-united-orders-request generate-united-orders-request, ] (generate-united-orders-report-with-http-info generate-united-orders-request nil))
  ([generate-united-orders-request generate-united-orders-request, {:keys [format]} (s/map-of keyword? any?)]
   (check-required-params generate-united-orders-request)
   (call-api "/reports/united-orders/generate" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"format" format }
              :form-params   {}
              :body-param    generate-united-orders-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec generate-united-orders-report generate-report-response-spec
  "Отчет по заказам
  Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)

{% note info \"\" %}

Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)

{% endnote %}

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([generate-united-orders-request generate-united-orders-request, ] (generate-united-orders-report generate-united-orders-request nil))
  ([generate-united-orders-request generate-united-orders-request, optional-params any?]
   (let [res (:data (generate-united-orders-report-with-http-info generate-united-orders-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode generate-report-response-spec res st/string-transformer)
        res))))


(defn-spec get-all-offers-with-http-info any?
  "Все предложения магазина
  {% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.

В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.

{% note info %}

Количество предложений считается по данным за последние семь дней (не включая сегодня).

Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.

{% endnote %}

|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|
|-|

[//]: <> (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25)"
  ([campaignId int?, ] (get-all-offers-with-http-info campaignId nil))
  ([campaignId int?, {:keys [feedId chunk]} (s/map-of keyword? any?)]
   (check-required-params campaignId)
   (call-api "/campaigns/{campaignId}/offers/all" :get
             {:path-params   {"campaignId" campaignId }
              :header-params {}
              :query-params  {"feedId" feedId "chunk" chunk }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-all-offers get-all-offers-response-spec
  "Все предложения магазина
  {% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.

В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.

{% note info %}

Количество предложений считается по данным за последние семь дней (не включая сегодня).

Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.

{% endnote %}

|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|
|-|

[//]: <> (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25)"
  ([campaignId int?, ] (get-all-offers campaignId nil))
  ([campaignId int?, optional-params any?]
   (let [res (:data (get-all-offers-with-http-info campaignId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-all-offers-response-spec res st/string-transformer)
        res))))


(defn-spec get-bids-info-for-business-with-http-info any?
  "Информация об установленных ставках
  Возвращает значения ставок для заданных товаров.

{% note warning \"\" %}

В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|"
  ([businessId int?, ] (get-bids-info-for-business-with-http-info businessId nil))
  ([businessId int?, {:keys [page_token limit get-bids-info-request]} (s/map-of keyword? any?)]
   (check-required-params businessId)
   (call-api "/businesses/{businessId}/bids/info" :post
             {:path-params   {"businessId" businessId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit }
              :form-params   {}
              :body-param    get-bids-info-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-bids-info-for-business get-bids-info-response-spec
  "Информация об установленных ставках
  Возвращает значения ставок для заданных товаров.

{% note warning \"\" %}

В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|"
  ([businessId int?, ] (get-bids-info-for-business businessId nil))
  ([businessId int?, optional-params any?]
   (let [res (:data (get-bids-info-for-business-with-http-info businessId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-bids-info-response-spec res st/string-transformer)
        res))))


(defn-spec get-bids-recommendations-with-http-info any?
  "Рекомендованные ставки для заданных товаров
  Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.

Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.

Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|"
  [businessId int?, get-bids-recommendations-request get-bids-recommendations-request]
  (check-required-params businessId get-bids-recommendations-request)
  (call-api "/businesses/{businessId}/bids/recommendations" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    get-bids-recommendations-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-bids-recommendations get-bids-recommendations-response-spec
  "Рекомендованные ставки для заданных товаров
  Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.

Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.

Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|"
  [businessId int?, get-bids-recommendations-request get-bids-recommendations-request]
  (let [res (:data (get-bids-recommendations-with-http-info businessId get-bids-recommendations-request))]
    (if (:decode-models *api-context*)
       (st/decode get-bids-recommendations-response-spec res st/string-transformer)
       res)))


(defn-spec get-business-quarantine-offers-with-http-info any?
  "Список товаров, находящихся в карантине по цене в кабинете
  Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.

Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).

{% note info \"𝓠 Что такое карантин?\" %}

𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

{% endnote %}

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|"
  ([businessId int?, get-quarantine-offers-request get-quarantine-offers-request, ] (get-business-quarantine-offers-with-http-info businessId get-quarantine-offers-request nil))
  ([businessId int?, get-quarantine-offers-request get-quarantine-offers-request, {:keys [page_token limit]} (s/map-of keyword? any?)]
   (check-required-params businessId get-quarantine-offers-request)
   (call-api "/businesses/{businessId}/price-quarantine" :post
             {:path-params   {"businessId" businessId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit }
              :form-params   {}
              :body-param    get-quarantine-offers-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-business-quarantine-offers get-quarantine-offers-response-spec
  "Список товаров, находящихся в карантине по цене в кабинете
  Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.

Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).

{% note info \"𝓠 Что такое карантин?\" %}

𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

{% endnote %}

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|"
  ([businessId int?, get-quarantine-offers-request get-quarantine-offers-request, ] (get-business-quarantine-offers businessId get-quarantine-offers-request nil))
  ([businessId int?, get-quarantine-offers-request get-quarantine-offers-request, optional-params any?]
   (let [res (:data (get-business-quarantine-offers-with-http-info businessId get-quarantine-offers-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-quarantine-offers-response-spec res st/string-transformer)
        res))))


(defn-spec get-business-settings-with-http-info any?
  "Настройки кабинета
  Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе.
|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [businessId int?]
  (check-required-params businessId)
  (call-api "/businesses/{businessId}/settings" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-business-settings get-business-settings-response-spec
  "Настройки кабинета
  Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе.
|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [businessId int?]
  (let [res (:data (get-business-settings-with-http-info businessId))]
    (if (:decode-models *api-context*)
       (st/decode get-business-settings-response-spec res st/string-transformer)
       res)))


(defn-spec get-campaign-with-http-info any?
  "Информация о магазине
  Возвращает информацию о магазине.
|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [campaignId int?]
  (check-required-params campaignId)
  (call-api "/campaigns/{campaignId}" :get
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-campaign get-campaign-response-spec
  "Информация о магазине
  Возвращает информацию о магазине.
|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [campaignId int?]
  (let [res (:data (get-campaign-with-http-info campaignId))]
    (if (:decode-models *api-context*)
       (st/decode get-campaign-response-spec res st/string-transformer)
       res)))


(defn-spec get-campaign-logins-with-http-info any?
  "Логины, связанные с магазином
  Возвращает список логинов, у которых есть доступ к магазину.
|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [campaignId int?]
  (check-required-params campaignId)
  (call-api "/campaigns/{campaignId}/logins" :get
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-campaign-logins get-campaign-logins-response-spec
  "Логины, связанные с магазином
  Возвращает список логинов, у которых есть доступ к магазину.
|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [campaignId int?]
  (let [res (:data (get-campaign-logins-with-http-info campaignId))]
    (if (:decode-models *api-context*)
       (st/decode get-campaign-logins-response-spec res st/string-transformer)
       res)))


(defn-spec get-campaign-offers-with-http-info any?
  "Информация о товарах, которые размещены в заданном магазине
  Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  ([campaignId int?, get-campaign-offers-request get-campaign-offers-request, ] (get-campaign-offers-with-http-info campaignId get-campaign-offers-request nil))
  ([campaignId int?, get-campaign-offers-request get-campaign-offers-request, {:keys [page_token limit]} (s/map-of keyword? any?)]
   (check-required-params campaignId get-campaign-offers-request)
   (call-api "/campaigns/{campaignId}/offers" :post
             {:path-params   {"campaignId" campaignId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit }
              :form-params   {}
              :body-param    get-campaign-offers-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-campaign-offers get-campaign-offers-response-spec
  "Информация о товарах, которые размещены в заданном магазине
  Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  ([campaignId int?, get-campaign-offers-request get-campaign-offers-request, ] (get-campaign-offers campaignId get-campaign-offers-request nil))
  ([campaignId int?, get-campaign-offers-request get-campaign-offers-request, optional-params any?]
   (let [res (:data (get-campaign-offers-with-http-info campaignId get-campaign-offers-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-campaign-offers-response-spec res st/string-transformer)
        res))))


(defn-spec get-campaign-quarantine-offers-with-http-info any?
  "Список товаров, находящихся в карантине по цене в магазине
  Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.

Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).

{% note info \"𝓠 Что такое карантин?\" %}

𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

{% endnote %}

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  ([campaignId int?, get-quarantine-offers-request get-quarantine-offers-request, ] (get-campaign-quarantine-offers-with-http-info campaignId get-quarantine-offers-request nil))
  ([campaignId int?, get-quarantine-offers-request get-quarantine-offers-request, {:keys [page_token limit]} (s/map-of keyword? any?)]
   (check-required-params campaignId get-quarantine-offers-request)
   (call-api "/campaigns/{campaignId}/price-quarantine" :post
             {:path-params   {"campaignId" campaignId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit }
              :form-params   {}
              :body-param    get-quarantine-offers-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-campaign-quarantine-offers get-quarantine-offers-response-spec
  "Список товаров, находящихся в карантине по цене в магазине
  Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.

Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).

{% note info \"𝓠 Что такое карантин?\" %}

𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

{% endnote %}

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  ([campaignId int?, get-quarantine-offers-request get-quarantine-offers-request, ] (get-campaign-quarantine-offers campaignId get-quarantine-offers-request nil))
  ([campaignId int?, get-quarantine-offers-request get-quarantine-offers-request, optional-params any?]
   (let [res (:data (get-campaign-quarantine-offers-with-http-info campaignId get-quarantine-offers-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-quarantine-offers-response-spec res st/string-transformer)
        res))))


(defn-spec get-campaign-region-with-http-info any?
  "Регион магазина
  {% note warning \"\" %}

Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).

{% endnote %}

Возвращает регион, в котором находится магазин.
|**⚙️ Лимит:** 5 000 запросов в час|
|-|"
  [campaignId int?]
  (check-required-params campaignId)
  (call-api "/campaigns/{campaignId}/region" :get
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-campaign-region get-campaign-region-response-spec
  "Регион магазина
  {% note warning \"\" %}

Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).

{% endnote %}

Возвращает регион, в котором находится магазин.
|**⚙️ Лимит:** 5 000 запросов в час|
|-|"
  [campaignId int?]
  (let [res (:data (get-campaign-region-with-http-info campaignId))]
    (if (:decode-models *api-context*)
       (st/decode get-campaign-region-response-spec res st/string-transformer)
       res)))


(defn-spec get-campaign-settings-with-http-info any?
  "Настройки магазина
  Возвращает информацию о настройках магазина, идентификатор которого указан в запросе.
|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [campaignId int?]
  (check-required-params campaignId)
  (call-api "/campaigns/{campaignId}/settings" :get
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-campaign-settings get-campaign-settings-response-spec
  "Настройки магазина
  Возвращает информацию о настройках магазина, идентификатор которого указан в запросе.
|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [campaignId int?]
  (let [res (:data (get-campaign-settings-with-http-info campaignId))]
    (if (:decode-models *api-context*)
       (st/decode get-campaign-settings-response-spec res st/string-transformer)
       res)))


(defn-spec get-campaigns-with-http-info any?
  "Список магазинов пользователя
  Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов.
|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  ([] (get-campaigns-with-http-info nil))
  ([{:keys [page pageSize]} (s/map-of keyword? any?)]
   (call-api "/campaigns" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "pageSize" pageSize }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-campaigns get-campaigns-response-spec
  "Список магазинов пользователя
  Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов.
|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  ([] (get-campaigns nil))
  ([optional-params any?]
   (let [res (:data (get-campaigns-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-campaigns-response-spec res st/string-transformer)
        res))))


(defn-spec get-campaigns-by-login-with-http-info any?
  "Магазины, доступные логину
  Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ.
|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([login string?, ] (get-campaigns-by-login-with-http-info login nil))
  ([login string?, {:keys [page pageSize]} (s/map-of keyword? any?)]
   (check-required-params login)
   (call-api "/campaigns/by_login/{login}" :get
             {:path-params   {"login" login }
              :header-params {}
              :query-params  {"page" page "pageSize" pageSize }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-campaigns-by-login get-campaigns-response-spec
  "Магазины, доступные логину
  Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ.
|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([login string?, ] (get-campaigns-by-login login nil))
  ([login string?, optional-params any?]
   (let [res (:data (get-campaigns-by-login-with-http-info login optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-campaigns-response-spec res st/string-transformer)
        res))))


(defn-spec get-categories-max-sale-quantum-with-http-info any?
  "Лимит на установку кванта продажи и минимального количества товаров в заказе
  Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.

Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.

Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).

|**⚙️ Лимит:** 1 000 запросов в час|
|-|"
  [get-categories-max-sale-quantum-request get-categories-max-sale-quantum-request]
  (check-required-params get-categories-max-sale-quantum-request)
  (call-api "/categories/max-sale-quantum" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    get-categories-max-sale-quantum-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-categories-max-sale-quantum get-categories-max-sale-quantum-response-spec
  "Лимит на установку кванта продажи и минимального количества товаров в заказе
  Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.

Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.

Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).

|**⚙️ Лимит:** 1 000 запросов в час|
|-|"
  [get-categories-max-sale-quantum-request get-categories-max-sale-quantum-request]
  (let [res (:data (get-categories-max-sale-quantum-with-http-info get-categories-max-sale-quantum-request))]
    (if (:decode-models *api-context*)
       (st/decode get-categories-max-sale-quantum-response-spec res st/string-transformer)
       res)))


(defn-spec get-categories-tree-with-http-info any?
  "Дерево категорий
  Возвращает дерево категорий Маркета.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|"
  ([] (get-categories-tree-with-http-info nil))
  ([{:keys [get-categories-request]} (s/map-of keyword? any?)]
   (call-api "/categories/tree" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    get-categories-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-categories-tree get-categories-response-spec
  "Дерево категорий
  Возвращает дерево категорий Маркета.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|"
  ([] (get-categories-tree nil))
  ([optional-params any?]
   (let [res (:data (get-categories-tree-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-categories-response-spec res st/string-transformer)
        res))))


(defn-spec get-category-content-parameters-with-http-info any?
  "Списки характеристик товаров по категориям
  Возвращает список характеристик с допустимыми значениями для заданной категории.

|**⚙️ Лимит:** 50 категорий в минуту |
|-|"
  [categoryId int?]
  (check-required-params categoryId)
  (call-api "/category/{categoryId}/parameters" :post
            {:path-params   {"categoryId" categoryId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-category-content-parameters get-category-content-parameters-response-spec
  "Списки характеристик товаров по категориям
  Возвращает список характеристик с допустимыми значениями для заданной категории.

|**⚙️ Лимит:** 50 категорий в минуту |
|-|"
  [categoryId int?]
  (let [res (:data (get-category-content-parameters-with-http-info categoryId))]
    (if (:decode-models *api-context*)
       (st/decode get-category-content-parameters-response-spec res st/string-transformer)
       res)))


(defn-spec get-chat-history-with-http-info any?
  "Получение истории сообщений в чате
  Возвращает историю сообщений в чате с покупателем.

|**⚙️ Лимит:** 10000 запросов в час|
|-|"
  ([businessId int?, chatId int?, get-chat-history-request get-chat-history-request, ] (get-chat-history-with-http-info businessId chatId get-chat-history-request nil))
  ([businessId int?, chatId int?, get-chat-history-request get-chat-history-request, {:keys [page_token limit]} (s/map-of keyword? any?)]
   (check-required-params businessId chatId get-chat-history-request)
   (call-api "/businesses/{businessId}/chats/history" :post
             {:path-params   {"businessId" businessId }
              :header-params {}
              :query-params  {"chatId" chatId "page_token" page_token "limit" limit }
              :form-params   {}
              :body-param    get-chat-history-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-chat-history get-chat-history-response-spec
  "Получение истории сообщений в чате
  Возвращает историю сообщений в чате с покупателем.

|**⚙️ Лимит:** 10000 запросов в час|
|-|"
  ([businessId int?, chatId int?, get-chat-history-request get-chat-history-request, ] (get-chat-history businessId chatId get-chat-history-request nil))
  ([businessId int?, chatId int?, get-chat-history-request get-chat-history-request, optional-params any?]
   (let [res (:data (get-chat-history-with-http-info businessId chatId get-chat-history-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-chat-history-response-spec res st/string-transformer)
        res))))


(defn-spec get-chats-with-http-info any?
  "Получение доступных чатов
  Возвращает ваши чаты с покупателями.

|**⚙️ Лимит:** 10000 запросов в час|
|-|"
  ([businessId int?, get-chats-request get-chats-request, ] (get-chats-with-http-info businessId get-chats-request nil))
  ([businessId int?, get-chats-request get-chats-request, {:keys [page_token limit]} (s/map-of keyword? any?)]
   (check-required-params businessId get-chats-request)
   (call-api "/businesses/{businessId}/chats" :post
             {:path-params   {"businessId" businessId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit }
              :form-params   {}
              :body-param    get-chats-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-chats get-chats-response-spec
  "Получение доступных чатов
  Возвращает ваши чаты с покупателями.

|**⚙️ Лимит:** 10000 запросов в час|
|-|"
  ([businessId int?, get-chats-request get-chats-request, ] (get-chats businessId get-chats-request nil))
  ([businessId int?, get-chats-request get-chats-request, optional-params any?]
   (let [res (:data (get-chats-with-http-info businessId get-chats-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-chats-response-spec res st/string-transformer)
        res))))


(defn-spec get-delivery-services-with-http-info any?
  "Справочник служб доставки
  Возвращает справочник служб доставки: идентификаторы и наименования.
|**⚙️ Лимит:** 5 000 запросов в час|
|-|"
  []
  (call-api "/delivery/services" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-delivery-services get-delivery-services-response-spec
  "Справочник служб доставки
  Возвращает справочник служб доставки: идентификаторы и наименования.
|**⚙️ Лимит:** 5 000 запросов в час|
|-|"
  []
  (let [res (:data (get-delivery-services-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode get-delivery-services-response-spec res st/string-transformer)
       res)))


(defn-spec get-feed-with-http-info any?
  "Информация о прайс-листе
  {% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа.
|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [campaignId int?, feedId int?]
  (check-required-params campaignId feedId)
  (call-api "/campaigns/{campaignId}/feeds/{feedId}" :get
            {:path-params   {"campaignId" campaignId "feedId" feedId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-feed get-feed-response-spec
  "Информация о прайс-листе
  {% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа.
|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [campaignId int?, feedId int?]
  (let [res (:data (get-feed-with-http-info campaignId feedId))]
    (if (:decode-models *api-context*)
       (st/decode get-feed-response-spec res st/string-transformer)
       res)))


(defn-spec get-feed-index-logs-with-http-info any?
  "Отчет по индексации прайс-листа
  {% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.

Данные в отчете возвращаются в порядке убывания значений параметра `generationId`.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|"
  ([campaignId int?, feedId int?, ] (get-feed-index-logs-with-http-info campaignId feedId nil))
  ([campaignId int?, feedId int?, {:keys [limit published_time_from published_time_to status]} (s/map-of keyword? any?)]
   (check-required-params campaignId feedId)
   (call-api "/campaigns/{campaignId}/feeds/{feedId}/index-logs" :get
             {:path-params   {"campaignId" campaignId "feedId" feedId }
              :header-params {}
              :query-params  {"limit" limit "published_time_from" published_time_from "published_time_to" published_time_to "status" status }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-feed-index-logs get-feed-index-logs-response-spec
  "Отчет по индексации прайс-листа
  {% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.

Данные в отчете возвращаются в порядке убывания значений параметра `generationId`.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|"
  ([campaignId int?, feedId int?, ] (get-feed-index-logs campaignId feedId nil))
  ([campaignId int?, feedId int?, optional-params any?]
   (let [res (:data (get-feed-index-logs-with-http-info campaignId feedId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-feed-index-logs-response-spec res st/string-transformer)
        res))))


(defn-spec get-feedback-and-comment-updates-with-http-info any?
  "Новые и обновленные отзывы о магазине
  {% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Возвращает новые и обновленные отзывы о магазине на Маркете.

Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([campaignId int?, ] (get-feedback-and-comment-updates-with-http-info campaignId nil))
  ([campaignId int?, {:keys [page_token limit from_date]} (s/map-of keyword? any?)]
   (check-required-params campaignId)
   (call-api "/campaigns/{campaignId}/feedback/updates" :get
             {:path-params   {"campaignId" campaignId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit "from_date" from_date }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-feedback-and-comment-updates get-feedback-list-response-spec
  "Новые и обновленные отзывы о магазине
  {% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Возвращает новые и обновленные отзывы о магазине на Маркете.

Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.

|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([campaignId int?, ] (get-feedback-and-comment-updates campaignId nil))
  ([campaignId int?, optional-params any?]
   (let [res (:data (get-feedback-and-comment-updates-with-http-info campaignId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-feedback-list-response-spec res st/string-transformer)
        res))))


(defn-spec get-feeds-with-http-info any?
  "Список прайс-листов магазина
  {% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов.
|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [campaignId int?]
  (check-required-params campaignId)
  (call-api "/campaigns/{campaignId}/feeds" :get
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-feeds get-feeds-response-spec
  "Список прайс-листов магазина
  {% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов.
|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [campaignId int?]
  (let [res (:data (get-feeds-with-http-info campaignId))]
    (if (:decode-models *api-context*)
       (st/decode get-feeds-response-spec res st/string-transformer)
       res)))


(defn-spec get-goods-feedback-comments-with-http-info any?
  "Получение комментариев к отзыву
  Возвращает комментарии к отзыву.

Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.

Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|"
  ([businessId int?, get-goods-feedback-comments-request get-goods-feedback-comments-request, ] (get-goods-feedback-comments-with-http-info businessId get-goods-feedback-comments-request nil))
  ([businessId int?, get-goods-feedback-comments-request get-goods-feedback-comments-request, {:keys [page_token limit]} (s/map-of keyword? any?)]
   (check-required-params businessId get-goods-feedback-comments-request)
   (call-api "/businesses/{businessId}/goods-feedback/comments" :post
             {:path-params   {"businessId" businessId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit }
              :form-params   {}
              :body-param    get-goods-feedback-comments-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-goods-feedback-comments get-goods-feedback-comments-response-spec
  "Получение комментариев к отзыву
  Возвращает комментарии к отзыву.

Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.

Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|"
  ([businessId int?, get-goods-feedback-comments-request get-goods-feedback-comments-request, ] (get-goods-feedback-comments businessId get-goods-feedback-comments-request nil))
  ([businessId int?, get-goods-feedback-comments-request get-goods-feedback-comments-request, optional-params any?]
   (let [res (:data (get-goods-feedback-comments-with-http-info businessId get-goods-feedback-comments-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-goods-feedback-comments-response-spec res st/string-transformer)
        res))))


(defn-spec get-goods-feedbacks-with-http-info any?
  "Получение отзывов о товарах продавца
  Возвращает все отзывы о товарах продавца по указанным фильтрам.

Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.

Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|"
  ([businessId int?, ] (get-goods-feedbacks-with-http-info businessId nil))
  ([businessId int?, {:keys [page_token limit get-goods-feedback-request]} (s/map-of keyword? any?)]
   (check-required-params businessId)
   (call-api "/businesses/{businessId}/goods-feedback" :post
             {:path-params   {"businessId" businessId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit }
              :form-params   {}
              :body-param    get-goods-feedback-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-goods-feedbacks get-goods-feedback-response-spec
  "Получение отзывов о товарах продавца
  Возвращает все отзывы о товарах продавца по указанным фильтрам.

Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.

Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|"
  ([businessId int?, ] (get-goods-feedbacks businessId nil))
  ([businessId int?, optional-params any?]
   (let [res (:data (get-goods-feedbacks-with-http-info businessId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-goods-feedback-response-spec res st/string-transformer)
        res))))


(defn-spec get-goods-stats-with-http-info any?
  "Отчет по товарам
  Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  [campaignId int?, get-goods-stats-request get-goods-stats-request]
  (check-required-params campaignId get-goods-stats-request)
  (call-api "/campaigns/{campaignId}/stats/skus" :post
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    get-goods-stats-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-goods-stats get-goods-stats-response-spec
  "Отчет по товарам
  Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  [campaignId int?, get-goods-stats-request get-goods-stats-request]
  (let [res (:data (get-goods-stats-with-http-info campaignId get-goods-stats-request))]
    (if (:decode-models *api-context*)
       (st/decode get-goods-stats-response-spec res st/string-transformer)
       res)))


(defn-spec get-hidden-offers-with-http-info any?
  "Информация о скрытых вами товарах
  Возвращает список скрытых вами товаров для заданного магазина.

В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|"
  ([campaignId int?, ] (get-hidden-offers-with-http-info campaignId nil))
  ([campaignId int?, {:keys [offer_id page_token limit offset page pageSize]} (s/map-of keyword? any?)]
   (check-required-params campaignId)
   (call-api "/campaigns/{campaignId}/hidden-offers" :get
             {:path-params   {"campaignId" campaignId }
              :header-params {}
              :query-params  {"offer_id" (with-collection-format offer_id :csv) "page_token" page_token "limit" limit "offset" offset "page" page "pageSize" pageSize }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-hidden-offers get-hidden-offers-response-spec
  "Информация о скрытых вами товарах
  Возвращает список скрытых вами товаров для заданного магазина.

В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|"
  ([campaignId int?, ] (get-hidden-offers campaignId nil))
  ([campaignId int?, optional-params any?]
   (let [res (:data (get-hidden-offers-with-http-info campaignId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-hidden-offers-response-spec res st/string-transformer)
        res))))


(defn-spec get-offer-cards-content-status-with-http-info any?
  "Получение информации о заполненности карточек магазина
  Возвращает сведения о состоянии контента для заданных товаров:

* создана ли карточка товара и в каком она статусе;
* заполненность карточки в процентах;
* переданные характеристики товаров;
* есть ли ошибки или предупреждения, связанные с контентом;
* рекомендации по заполнению карточки.

|**⚙️ Лимит:** 600 запросов в минуту|
|-|"
  ([businessId int?, ] (get-offer-cards-content-status-with-http-info businessId nil))
  ([businessId int?, {:keys [page_token limit get-offer-cards-content-status-request]} (s/map-of keyword? any?)]
   (check-required-params businessId)
   (call-api "/businesses/{businessId}/offer-cards" :post
             {:path-params   {"businessId" businessId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit }
              :form-params   {}
              :body-param    get-offer-cards-content-status-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-offer-cards-content-status get-offer-cards-content-status-response-spec
  "Получение информации о заполненности карточек магазина
  Возвращает сведения о состоянии контента для заданных товаров:

* создана ли карточка товара и в каком она статусе;
* заполненность карточки в процентах;
* переданные характеристики товаров;
* есть ли ошибки или предупреждения, связанные с контентом;
* рекомендации по заполнению карточки.

|**⚙️ Лимит:** 600 запросов в минуту|
|-|"
  ([businessId int?, ] (get-offer-cards-content-status businessId nil))
  ([businessId int?, optional-params any?]
   (let [res (:data (get-offer-cards-content-status-with-http-info businessId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-offer-cards-content-status-response-spec res st/string-transformer)
        res))))


(defn-spec get-offer-mapping-entries-with-http-info any?
  "Список товаров в каталоге
  {% note warning \"\" %}

Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).

{% endnote %}

Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:

* Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки.
* Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.

Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.

{% note info %}

Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).

{% endnote %}

|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|
|-|

[//]: <> (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25)"
  ([campaignId int?, ] (get-offer-mapping-entries-with-http-info campaignId nil))
  ([campaignId int?, {:keys [offer_id shop_sku mapping_kind status availability category_id vendor page_token limit]} (s/map-of keyword? any?)]
   (check-required-params campaignId)
   (call-api "/campaigns/{campaignId}/offer-mapping-entries" :get
             {:path-params   {"campaignId" campaignId }
              :header-params {}
              :query-params  {"offer_id" (with-collection-format offer_id :csv) "shop_sku" (with-collection-format shop_sku :csv) "mapping_kind" mapping_kind "status" (with-collection-format status :csv) "availability" (with-collection-format availability :csv) "category_id" (with-collection-format category_id :csv) "vendor" (with-collection-format vendor :csv) "page_token" page_token "limit" limit }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-offer-mapping-entries get-offer-mapping-entries-response-spec
  "Список товаров в каталоге
  {% note warning \"\" %}

Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).

{% endnote %}

Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:

* Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки.
* Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.

Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.

{% note info %}

Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).

{% endnote %}

|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|
|-|

[//]: <> (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25)"
  ([campaignId int?, ] (get-offer-mapping-entries campaignId nil))
  ([campaignId int?, optional-params any?]
   (let [res (:data (get-offer-mapping-entries-with-http-info campaignId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-offer-mapping-entries-response-spec res st/string-transformer)
        res))))


(defn-spec get-offer-mappings-with-http-info any?
  "Информация о товарах в каталоге
  Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.

Можно использовать тремя способами:
* задать список интересующих SKU;
* задать фильтр — в этом случае результаты возвращаются постранично;
* не передавать тело запроса, чтобы получить список всех товаров в каталоге.

|**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе|
|-|"
  ([businessId int?, ] (get-offer-mappings-with-http-info businessId nil))
  ([businessId int?, {:keys [page_token limit get-offer-mappings-request]} (s/map-of keyword? any?)]
   (check-required-params businessId)
   (call-api "/businesses/{businessId}/offer-mappings" :post
             {:path-params   {"businessId" businessId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit }
              :form-params   {}
              :body-param    get-offer-mappings-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-offer-mappings get-offer-mappings-response-spec
  "Информация о товарах в каталоге
  Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.

Можно использовать тремя способами:
* задать список интересующих SKU;
* задать фильтр — в этом случае результаты возвращаются постранично;
* не передавать тело запроса, чтобы получить список всех товаров в каталоге.

|**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе|
|-|"
  ([businessId int?, ] (get-offer-mappings businessId nil))
  ([businessId int?, optional-params any?]
   (let [res (:data (get-offer-mappings-with-http-info businessId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-offer-mappings-response-spec res st/string-transformer)
        res))))


(defn-spec get-offer-recommendations-with-http-info any?
  "Рекомендации Маркета, касающиеся цен
  Метод возвращает рекомендации нескольких типов.

**1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**

Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)

**2. Оценка привлекательности цен на витрине.**

Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|"
  ([businessId int?, get-offer-recommendations-request get-offer-recommendations-request, ] (get-offer-recommendations-with-http-info businessId get-offer-recommendations-request nil))
  ([businessId int?, get-offer-recommendations-request get-offer-recommendations-request, {:keys [page_token limit]} (s/map-of keyword? any?)]
   (check-required-params businessId get-offer-recommendations-request)
   (call-api "/businesses/{businessId}/offers/recommendations" :post
             {:path-params   {"businessId" businessId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit }
              :form-params   {}
              :body-param    get-offer-recommendations-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-offer-recommendations get-offer-recommendations-response-spec
  "Рекомендации Маркета, касающиеся цен
  Метод возвращает рекомендации нескольких типов.

**1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**

Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)

**2. Оценка привлекательности цен на витрине.**

Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|"
  ([businessId int?, get-offer-recommendations-request get-offer-recommendations-request, ] (get-offer-recommendations businessId get-offer-recommendations-request nil))
  ([businessId int?, get-offer-recommendations-request get-offer-recommendations-request, optional-params any?]
   (let [res (:data (get-offer-recommendations-with-http-info businessId get-offer-recommendations-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-offer-recommendations-response-spec res st/string-transformer)
        res))))


(defn-spec get-offers-with-http-info any?
  "Предложения магазина
  {% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.

Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.

В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.

{% note info %}

Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.

В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.

{% endnote %}

{% note info %}

Количество предложений считается по данным за последние семь дней (не включая сегодня).

Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.

{% endnote %}

|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|
|-|

[//]: <> (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25)"
  ([campaignId int?, ] (get-offers-with-http-info campaignId nil))
  ([campaignId int?, {:keys [query feedId shopCategoryId currency matched page pageSize]} (s/map-of keyword? any?)]
   (check-required-params campaignId)
   (call-api "/campaigns/{campaignId}/offers" :get
             {:path-params   {"campaignId" campaignId }
              :header-params {}
              :query-params  {"query" query "feedId" feedId "shopCategoryId" shopCategoryId "currency" currency "matched" matched "page" page "pageSize" pageSize }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-offers get-offers-response-spec
  "Предложения магазина
  {% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.

Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.

В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.

{% note info %}

Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.

В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.

{% endnote %}

{% note info %}

Количество предложений считается по данным за последние семь дней (не включая сегодня).

Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.

{% endnote %}

|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|
|-|

[//]: <> (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25)"
  ([campaignId int?, ] (get-offers campaignId nil))
  ([campaignId int?, optional-params any?]
   (let [res (:data (get-offers-with-http-info campaignId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-offers-response-spec res st/string-transformer)
        res))))


(defn-spec get-order-with-http-info any?
  "Информация об одном заказе
  Возвращает информацию о заказе.

Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, orderId int?]
  (check-required-params campaignId orderId)
  (call-api "/campaigns/{campaignId}/orders/{orderId}" :get
            {:path-params   {"campaignId" campaignId "orderId" orderId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-order get-order-response-spec
  "Информация об одном заказе
  Возвращает информацию о заказе.

Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, orderId int?]
  (let [res (:data (get-order-with-http-info campaignId orderId))]
    (if (:decode-models *api-context*)
       (st/decode get-order-response-spec res st/string-transformer)
       res)))


(defn-spec get-order-business-buyer-info-with-http-info any?
  "Информация о покупателе — юридическом лице
  Возвращает информацию о покупателе по идентификатору заказа.

{% note info \"\" %}

Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).

{% endnote %}

Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY`, `PICKUP` или `DELIVERED`.

Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).

|**⚙️ Лимит:** 3 000 запросов в час|
|-|"
  [campaignId int?, orderId int?]
  (check-required-params campaignId orderId)
  (call-api "/campaigns/{campaignId}/orders/{orderId}/business-buyer" :post
            {:path-params   {"campaignId" campaignId "orderId" orderId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-order-business-buyer-info get-business-buyer-info-response-spec
  "Информация о покупателе — юридическом лице
  Возвращает информацию о покупателе по идентификатору заказа.

{% note info \"\" %}

Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).

{% endnote %}

Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY`, `PICKUP` или `DELIVERED`.

Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).

|**⚙️ Лимит:** 3 000 запросов в час|
|-|"
  [campaignId int?, orderId int?]
  (let [res (:data (get-order-business-buyer-info-with-http-info campaignId orderId))]
    (if (:decode-models *api-context*)
       (st/decode get-business-buyer-info-response-spec res st/string-transformer)
       res)))


(defn-spec get-order-business-documents-info-with-http-info any?
  "Информация о документах
  Возвращает информацию о документах по идентификатору заказа.

Получить данные можно после того, как заказ перейдет в статус `DELIVERED`.

Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).

|**⚙️ Лимит:** 3 000 запросов в час|
|-|"
  [campaignId int?, orderId int?]
  (check-required-params campaignId orderId)
  (call-api "/campaigns/{campaignId}/orders/{orderId}/documents" :post
            {:path-params   {"campaignId" campaignId "orderId" orderId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-order-business-documents-info get-business-documents-info-response-spec
  "Информация о документах
  Возвращает информацию о документах по идентификатору заказа.

Получить данные можно после того, как заказ перейдет в статус `DELIVERED`.

Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).

|**⚙️ Лимит:** 3 000 запросов в час|
|-|"
  [campaignId int?, orderId int?]
  (let [res (:data (get-order-business-documents-info-with-http-info campaignId orderId))]
    (if (:decode-models *api-context*)
       (st/decode get-business-documents-info-response-spec res st/string-transformer)
       res)))


(defn-spec get-order-labels-data-with-http-info any?
  "Данные для самостоятельного изготовления ярлыков
  Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, orderId int?]
  (check-required-params campaignId orderId)
  (call-api "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data" :get
            {:path-params   {"campaignId" campaignId "orderId" orderId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-order-labels-data get-order-labels-data-response-spec
  "Данные для самостоятельного изготовления ярлыков
  Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, orderId int?]
  (let [res (:data (get-order-labels-data-with-http-info campaignId orderId))]
    (if (:decode-models *api-context*)
       (st/decode get-order-labels-data-response-spec res st/string-transformer)
       res)))


(defn-spec get-orders-with-http-info any?
  "Информация о нескольких заказах
  Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.

Доступна фильтрация по нескольким характеристикам заказов:

* дате оформления;

* статусу;

* идентификаторам заказов;

* этапу обработки или причине отмены;

* типу (настоящий или тестовый);

* дате отгрузки в службу доставки;

* дате и времени обновления заказа.

Информация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).

Максимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.

Результаты возвращаются постранично. Для навигации по страницам используйте параметры `page_token` и `limit`.

Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  ([campaignId int?, ] (get-orders-with-http-info campaignId nil))
  ([campaignId int?, {:keys [orderIds status substatus fromDate toDate supplierShipmentDateFrom supplierShipmentDateTo updatedAtFrom updatedAtTo dispatchType fake hasCis onlyWaitingForCancellationApprove onlyEstimatedDelivery buyerType page pageSize page_token limit]} (s/map-of keyword? any?)]
   (check-required-params campaignId)
   (call-api "/campaigns/{campaignId}/orders" :get
             {:path-params   {"campaignId" campaignId }
              :header-params {}
              :query-params  {"orderIds" (with-collection-format orderIds :csv) "status" (with-collection-format status :csv) "substatus" (with-collection-format substatus :csv) "fromDate" fromDate "toDate" toDate "supplierShipmentDateFrom" supplierShipmentDateFrom "supplierShipmentDateTo" supplierShipmentDateTo "updatedAtFrom" updatedAtFrom "updatedAtTo" updatedAtTo "dispatchType" dispatchType "fake" fake "hasCis" hasCis "onlyWaitingForCancellationApprove" onlyWaitingForCancellationApprove "onlyEstimatedDelivery" onlyEstimatedDelivery "buyerType" buyerType "page" page "pageSize" pageSize "page_token" page_token "limit" limit }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-orders get-orders-response-spec
  "Информация о нескольких заказах
  Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.

Доступна фильтрация по нескольким характеристикам заказов:

* дате оформления;

* статусу;

* идентификаторам заказов;

* этапу обработки или причине отмены;

* типу (настоящий или тестовый);

* дате отгрузки в службу доставки;

* дате и времени обновления заказа.

Информация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).

Максимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.

Результаты возвращаются постранично. Для навигации по страницам используйте параметры `page_token` и `limit`.

Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  ([campaignId int?, ] (get-orders campaignId nil))
  ([campaignId int?, optional-params any?]
   (let [res (:data (get-orders-with-http-info campaignId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-orders-response-spec res st/string-transformer)
        res))))


(defn-spec get-orders-stats-with-http-info any?
  "Детальная информация по заказам
  Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.

{% note info \"\" %}

Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)

{% endnote %}

В одном запросе можно получить информацию не более чем по 200 заказам.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  ([campaignId int?, ] (get-orders-stats-with-http-info campaignId nil))
  ([campaignId int?, {:keys [page_token limit get-orders-stats-request]} (s/map-of keyword? any?)]
   (check-required-params campaignId)
   (call-api "/campaigns/{campaignId}/stats/orders" :post
             {:path-params   {"campaignId" campaignId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit }
              :form-params   {}
              :body-param    get-orders-stats-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-orders-stats get-orders-stats-response-spec
  "Детальная информация по заказам
  Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.

{% note info \"\" %}

Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)

{% endnote %}

В одном запросе можно получить информацию не более чем по 200 заказам.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  ([campaignId int?, ] (get-orders-stats campaignId nil))
  ([campaignId int?, optional-params any?]
   (let [res (:data (get-orders-stats-with-http-info campaignId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-orders-stats-response-spec res st/string-transformer)
        res))))


(defn-spec get-prices-with-http-info any?
  "Список цен
  {% note warning \"\" %}

Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).

{% endnote %}

Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.

{% note info %}

Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.

{% endnote %}

Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).

|**⚙️ Лимит:** ```(количество товаров партнера на витрине) * 25``` товаров в сутки|
|-|"
  ([campaignId int?, ] (get-prices-with-http-info campaignId nil))
  ([campaignId int?, {:keys [page_token limit archived]} (s/map-of keyword? any?)]
   (check-required-params campaignId)
   (call-api "/campaigns/{campaignId}/offer-prices" :get
             {:path-params   {"campaignId" campaignId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit "archived" archived }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-prices get-prices-response-spec
  "Список цен
  {% note warning \"\" %}

Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).

{% endnote %}

Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.

{% note info %}

Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.

{% endnote %}

Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).

|**⚙️ Лимит:** ```(количество товаров партнера на витрине) * 25``` товаров в сутки|
|-|"
  ([campaignId int?, ] (get-prices campaignId nil))
  ([campaignId int?, optional-params any?]
   (let [res (:data (get-prices-with-http-info campaignId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-prices-response-spec res st/string-transformer)
        res))))


(defn-spec get-prices-by-offer-ids-with-http-info any?
  "Просмотр цен на указанные товары в магазине
  Возвращает список цен на указанные товары в магазине.

{% note warning \"Метод только для отдельных магазинов\" %}

Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.

Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).

{% endnote %}

|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|
|-|

[//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25)"
  ([campaignId int?, ] (get-prices-by-offer-ids-with-http-info campaignId nil))
  ([campaignId int?, {:keys [page_token limit get-prices-by-offer-ids-request]} (s/map-of keyword? any?)]
   (check-required-params campaignId)
   (call-api "/campaigns/{campaignId}/offer-prices" :post
             {:path-params   {"campaignId" campaignId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit }
              :form-params   {}
              :body-param    get-prices-by-offer-ids-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-prices-by-offer-ids get-prices-by-offer-ids-response-spec
  "Просмотр цен на указанные товары в магазине
  Возвращает список цен на указанные товары в магазине.

{% note warning \"Метод только для отдельных магазинов\" %}

Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.

Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).

{% endnote %}

|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|
|-|

[//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25)"
  ([campaignId int?, ] (get-prices-by-offer-ids campaignId nil))
  ([campaignId int?, optional-params any?]
   (let [res (:data (get-prices-by-offer-ids-with-http-info campaignId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-prices-by-offer-ids-response-spec res st/string-transformer)
        res))))


(defn-spec get-promo-offers-with-http-info any?
  "Получение списка товаров, которые участвуют или могут участвовать в акции
  Возвращает список товаров, которые участвуют или могут участвовать в акции.

{% note warning %}

В параметре `limit` не передавайте значение больше 500.

{% endnote %}

|**⚙️ Лимит:** 10000 запросов в час|
|-|"
  ([businessId int?, get-promo-offers-request get-promo-offers-request, ] (get-promo-offers-with-http-info businessId get-promo-offers-request nil))
  ([businessId int?, get-promo-offers-request get-promo-offers-request, {:keys [page_token limit]} (s/map-of keyword? any?)]
   (check-required-params businessId get-promo-offers-request)
   (call-api "/businesses/{businessId}/promos/offers" :post
             {:path-params   {"businessId" businessId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit }
              :form-params   {}
              :body-param    get-promo-offers-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-promo-offers get-promo-offers-response-spec
  "Получение списка товаров, которые участвуют или могут участвовать в акции
  Возвращает список товаров, которые участвуют или могут участвовать в акции.

{% note warning %}

В параметре `limit` не передавайте значение больше 500.

{% endnote %}

|**⚙️ Лимит:** 10000 запросов в час|
|-|"
  ([businessId int?, get-promo-offers-request get-promo-offers-request, ] (get-promo-offers businessId get-promo-offers-request nil))
  ([businessId int?, get-promo-offers-request get-promo-offers-request, optional-params any?]
   (let [res (:data (get-promo-offers-with-http-info businessId get-promo-offers-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-promo-offers-response-spec res st/string-transformer)
        res))))


(defn-spec get-promos-with-http-info any?
  "Получение списка акций
  Возвращает информацию об акциях Маркета.

По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.

Чтобы получить текущие или завершенные акции, передайте параметр `participation`.

Типы акций, которые возвращаются в ответе:

* прямая скидка;
* флеш-акция;
* скидка по промокоду.

|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  ([businessId int?, ] (get-promos-with-http-info businessId nil))
  ([businessId int?, {:keys [get-promos-request]} (s/map-of keyword? any?)]
   (check-required-params businessId)
   (call-api "/businesses/{businessId}/promos" :post
             {:path-params   {"businessId" businessId }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    get-promos-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-promos get-promos-response-spec
  "Получение списка акций
  Возвращает информацию об акциях Маркета.

По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.

Чтобы получить текущие или завершенные акции, передайте параметр `participation`.

Типы акций, которые возвращаются в ответе:

* прямая скидка;
* флеш-акция;
* скидка по промокоду.

|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  ([businessId int?, ] (get-promos businessId nil))
  ([businessId int?, optional-params any?]
   (let [res (:data (get-promos-with-http-info businessId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-promos-response-spec res st/string-transformer)
        res))))


(defn-spec get-quality-rating-details-with-http-info any?
  "Заказы, которые повлияли на индекс качества
  Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).

|**⚙️ Лимит:** 100000 запросов в час|
|-|"
  [campaignId int?]
  (check-required-params campaignId)
  (call-api "/campaigns/{campaignId}/ratings/quality/details" :post
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-quality-rating-details get-quality-rating-details-response-spec
  "Заказы, которые повлияли на индекс качества
  Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).

|**⚙️ Лимит:** 100000 запросов в час|
|-|"
  [campaignId int?]
  (let [res (:data (get-quality-rating-details-with-http-info campaignId))]
    (if (:decode-models *api-context*)
       (st/decode get-quality-rating-details-response-spec res st/string-transformer)
       res)))


(defn-spec get-quality-ratings-with-http-info any?
  "Индекс качества магазинов
  Возвращает значение индекса качества магазинов и его составляющие.

Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).

|**⚙️ Лимит:** 10000 запросов в час|
|-|"
  [businessId int?, get-quality-rating-request get-quality-rating-request]
  (check-required-params businessId get-quality-rating-request)
  (call-api "/businesses/{businessId}/ratings/quality" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    get-quality-rating-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-quality-ratings get-quality-rating-response-spec
  "Индекс качества магазинов
  Возвращает значение индекса качества магазинов и его составляющие.

Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).

|**⚙️ Лимит:** 10000 запросов в час|
|-|"
  [businessId int?, get-quality-rating-request get-quality-rating-request]
  (let [res (:data (get-quality-ratings-with-http-info businessId get-quality-rating-request))]
    (if (:decode-models *api-context*)
       (st/decode get-quality-rating-response-spec res st/string-transformer)
       res)))


(defn-spec get-report-info-with-http-info any?
  "Получение заданного отчета
  Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.

Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)

|**⚙️ Лимит:** 100 запросов в минуту|
|-|"
  [reportId string?]
  (check-required-params reportId)
  (call-api "/reports/info/{reportId}" :get
            {:path-params   {"reportId" reportId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-report-info get-report-info-response-spec
  "Получение заданного отчета
  Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.

Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)

|**⚙️ Лимит:** 100 запросов в минуту|
|-|"
  [reportId string?]
  (let [res (:data (get-report-info-with-http-info reportId))]
    (if (:decode-models *api-context*)
       (st/decode get-report-info-response-spec res st/string-transformer)
       res)))


(defn-spec get-return-with-http-info any?
  "Информация о невыкупе или возврате
  Получает информацию по одному невыкупу или возврату.

|**⚙️ Лимит:** 10 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, returnId int?]
  (check-required-params campaignId orderId returnId)
  (call-api "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}" :get
            {:path-params   {"campaignId" campaignId "orderId" orderId "returnId" returnId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-return get-return-response-spec
  "Информация о невыкупе или возврате
  Получает информацию по одному невыкупу или возврату.

|**⚙️ Лимит:** 10 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, returnId int?]
  (let [res (:data (get-return-with-http-info campaignId orderId returnId))]
    (if (:decode-models *api-context*)
       (st/decode get-return-response-spec res st/string-transformer)
       res)))


(defn-spec get-return-application-with-http-info any?
  "Получение заявления на возврат
  Загружает заявление покупателя на возврат товара.

|**⚙️ Лимит:** 10 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, returnId int?]
  (check-required-params campaignId orderId returnId)
  (call-api "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application" :get
            {:path-params   {"campaignId" campaignId "orderId" orderId "returnId" returnId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/octet-stream" "application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-return-application any?
  "Получение заявления на возврат
  Загружает заявление покупателя на возврат товара.

|**⚙️ Лимит:** 10 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, returnId int?]
  (let [res (:data (get-return-application-with-http-info campaignId orderId returnId))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec get-return-photo-with-http-info any?
  "Получение фотографии возврата
  Получает фотографии, которые покупатель приложил к заявлению на возврат товара.

|**⚙️ Лимит:** 10 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, returnId int?, itemId int?, imageHash string?]
  (check-required-params campaignId orderId returnId itemId imageHash)
  (call-api "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}" :get
            {:path-params   {"campaignId" campaignId "orderId" orderId "returnId" returnId "itemId" itemId "imageHash" imageHash }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/octet-stream" "application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-return-photo any?
  "Получение фотографии возврата
  Получает фотографии, которые покупатель приложил к заявлению на возврат товара.

|**⚙️ Лимит:** 10 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, returnId int?, itemId int?, imageHash string?]
  (let [res (:data (get-return-photo-with-http-info campaignId orderId returnId itemId imageHash))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec get-returns-with-http-info any?
  "Список невыкупов и возвратов
  Получает список невыкупов и возвратов.

Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).

|**⚙️ Лимит:** 10 000 запросов в час|
|-|"
  ([campaignId int?, ] (get-returns-with-http-info campaignId nil))
  ([campaignId int?, {:keys [page_token limit orderIds statuses type fromDate toDate from_date to_date]} (s/map-of keyword? any?)]
   (check-required-params campaignId)
   (call-api "/campaigns/{campaignId}/returns" :get
             {:path-params   {"campaignId" campaignId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit "orderIds" (with-collection-format orderIds :csv) "statuses" (with-collection-format statuses :csv) "type" type "fromDate" fromDate "toDate" toDate "from_date" from_date "to_date" to_date }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-returns get-returns-response-spec
  "Список невыкупов и возвратов
  Получает список невыкупов и возвратов.

Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).

|**⚙️ Лимит:** 10 000 запросов в час|
|-|"
  ([campaignId int?, ] (get-returns campaignId nil))
  ([campaignId int?, optional-params any?]
   (let [res (:data (get-returns-with-http-info campaignId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-returns-response-spec res st/string-transformer)
        res))))


(defn-spec get-shipment-with-http-info any?
  "Получение информации об одной отгрузке
  Возвращает информацию об отгрузке по ее идентификатору.
|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([campaignId int?, shipmentId int?, ] (get-shipment-with-http-info campaignId shipmentId nil))
  ([campaignId int?, shipmentId int?, {:keys [cancelledOrders]} (s/map-of keyword? any?)]
   (check-required-params campaignId shipmentId)
   (call-api "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}" :get
             {:path-params   {"campaignId" campaignId "shipmentId" shipmentId }
              :header-params {}
              :query-params  {"cancelledOrders" cancelledOrders }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-shipment get-shipment-response-spec
  "Получение информации об одной отгрузке
  Возвращает информацию об отгрузке по ее идентификатору.
|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([campaignId int?, shipmentId int?, ] (get-shipment campaignId shipmentId nil))
  ([campaignId int?, shipmentId int?, optional-params any?]
   (let [res (:data (get-shipment-with-http-info campaignId shipmentId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-shipment-response-spec res st/string-transformer)
        res))))


(defn-spec get-shipment-orders-info-with-http-info any?
  "Получение информации о возможности печати ярлыков (FBS)
  Возвращает информацию о возможности печати ярлыков-наклеек для заказов в отгрузке.
|**⚙️ Лимит:** 100 запросов в час|
|-|"
  [campaignId int?, shipmentId int?]
  (check-required-params campaignId shipmentId)
  (call-api "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info" :get
            {:path-params   {"campaignId" campaignId "shipmentId" shipmentId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-shipment-orders-info get-shipment-orders-info-response-spec
  "Получение информации о возможности печати ярлыков (FBS)
  Возвращает информацию о возможности печати ярлыков-наклеек для заказов в отгрузке.
|**⚙️ Лимит:** 100 запросов в час|
|-|"
  [campaignId int?, shipmentId int?]
  (let [res (:data (get-shipment-orders-info-with-http-info campaignId shipmentId))]
    (if (:decode-models *api-context*)
       (st/decode get-shipment-orders-info-response-spec res st/string-transformer)
       res)))


(defn-spec get-stocks-with-http-info any?
  "Информация об остатках и оборачиваемости
  Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).

{% note info \"По умолчанию данные по оборачивамости не возращаются\" %}

Чтобы они были в ответе, передавайте `true` в поле `withTurnover`.

{% endnote %}

|**⚙️ Лимит:** 100 000 товаров в минуту|
|-|

[//]: <> (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.)"
  ([campaignId int?, ] (get-stocks-with-http-info campaignId nil))
  ([campaignId int?, {:keys [page_token limit get-warehouse-stocks-request]} (s/map-of keyword? any?)]
   (check-required-params campaignId)
   (call-api "/campaigns/{campaignId}/offers/stocks" :post
             {:path-params   {"campaignId" campaignId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit }
              :form-params   {}
              :body-param    get-warehouse-stocks-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-stocks get-warehouse-stocks-response-spec
  "Информация об остатках и оборачиваемости
  Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).

{% note info \"По умолчанию данные по оборачивамости не возращаются\" %}

Чтобы они были в ответе, передавайте `true` в поле `withTurnover`.

{% endnote %}

|**⚙️ Лимит:** 100 000 товаров в минуту|
|-|

[//]: <> (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.)"
  ([campaignId int?, ] (get-stocks campaignId nil))
  ([campaignId int?, optional-params any?]
   (let [res (:data (get-stocks-with-http-info campaignId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-warehouse-stocks-response-spec res st/string-transformer)
        res))))


(defn-spec get-suggested-offer-mapping-entries-with-http-info any?
  "Рекомендованные карточки для товаров
  {% note warning \"\" %}

Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).

{% endnote %}

Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.

Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku=», например:

##https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016…##

Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.

Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).

В одном запросе можно получить не более 500 рекомендаций.

|**⚙️ Лимит:** 100 000 рекомендаций в час|
|-|"
  [campaignId int?, get-suggested-offer-mapping-entries-request get-suggested-offer-mapping-entries-request]
  (check-required-params campaignId get-suggested-offer-mapping-entries-request)
  (call-api "/campaigns/{campaignId}/offer-mapping-entries/suggestions" :post
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    get-suggested-offer-mapping-entries-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-suggested-offer-mapping-entries get-suggested-offer-mapping-entries-response-spec
  "Рекомендованные карточки для товаров
  {% note warning \"\" %}

Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).

{% endnote %}

Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.

Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku=», например:

##https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016…##

Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.

Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).

В одном запросе можно получить не более 500 рекомендаций.

|**⚙️ Лимит:** 100 000 рекомендаций в час|
|-|"
  [campaignId int?, get-suggested-offer-mapping-entries-request get-suggested-offer-mapping-entries-request]
  (let [res (:data (get-suggested-offer-mapping-entries-with-http-info campaignId get-suggested-offer-mapping-entries-request))]
    (if (:decode-models *api-context*)
       (st/decode get-suggested-offer-mapping-entries-response-spec res st/string-transformer)
       res)))


(defn-spec get-suggested-offer-mappings-with-http-info any?
  "Просмотр карточек на Маркете, которые подходят вашим товарам
  Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.

Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.

**Как пользоваться запросом**

1. Передайте Маркету список товаров, которые нужно проверить.
2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией.
3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`.
4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.

{% note info \"𝓠 Как определить `marketSku` товара, найденного на Маркете?\" %}

𝓐 Он есть в адресе страницы товара — расположен после `sku=`.

Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`

{% endnote %}

|**⚙️ Лимит:** 100 000 товаров в час|
|-|"
  ([businessId int?, ] (get-suggested-offer-mappings-with-http-info businessId nil))
  ([businessId int?, {:keys [get-suggested-offer-mappings-request]} (s/map-of keyword? any?)]
   (check-required-params businessId)
   (call-api "/businesses/{businessId}/offer-mappings/suggestions" :post
             {:path-params   {"businessId" businessId }
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    get-suggested-offer-mappings-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec get-suggested-offer-mappings get-suggested-offer-mappings-response-spec
  "Просмотр карточек на Маркете, которые подходят вашим товарам
  Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.

Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.

**Как пользоваться запросом**

1. Передайте Маркету список товаров, которые нужно проверить.
2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией.
3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`.
4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.

{% note info \"𝓠 Как определить `marketSku` товара, найденного на Маркете?\" %}

𝓐 Он есть в адресе страницы товара — расположен после `sku=`.

Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`

{% endnote %}

|**⚙️ Лимит:** 100 000 товаров в час|
|-|"
  ([businessId int?, ] (get-suggested-offer-mappings businessId nil))
  ([businessId int?, optional-params any?]
   (let [res (:data (get-suggested-offer-mappings-with-http-info businessId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-suggested-offer-mappings-response-spec res st/string-transformer)
        res))))


(defn-spec get-suggested-prices-with-http-info any?
  "Цены для продвижения товаров
  {% note warning \"\" %}

Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).

{% endnote %}

{% note warning \"\" %}

Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.

{% endnote %}

Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.

Товары, для которых нужно получить цены, передаются в теле POST-запроса.

Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.

Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.

Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.

Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).

|**⚙️ Лимит:** 100 000 товаров в час|
|-|"
  [campaignId int?, suggest-prices-request suggest-prices-request]
  (check-required-params campaignId suggest-prices-request)
  (call-api "/campaigns/{campaignId}/offer-prices/suggestions" :post
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    suggest-prices-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-suggested-prices suggest-prices-response-spec
  "Цены для продвижения товаров
  {% note warning \"\" %}

Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).

{% endnote %}

{% note warning \"\" %}

Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.

{% endnote %}

Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.

Товары, для которых нужно получить цены, передаются в теле POST-запроса.

Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.

Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.

Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.

Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).

|**⚙️ Лимит:** 100 000 товаров в час|
|-|"
  [campaignId int?, suggest-prices-request suggest-prices-request]
  (let [res (:data (get-suggested-prices-with-http-info campaignId suggest-prices-request))]
    (if (:decode-models *api-context*)
       (st/decode suggest-prices-response-spec res st/string-transformer)
       res)))


(defn-spec get-warehouses-with-http-info any?
  "Список складов и групп складов
  Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)

Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|"
  [businessId int?]
  (check-required-params businessId)
  (call-api "/businesses/{businessId}/warehouses" :get
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec get-warehouses get-warehouses-response-spec
  "Список складов и групп складов
  Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)

Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|"
  [businessId int?]
  (let [res (:data (get-warehouses-with-http-info businessId))]
    (if (:decode-models *api-context*)
       (st/decode get-warehouses-response-spec res st/string-transformer)
       res)))


(defn-spec provide-order-item-identifiers-with-http-info any?
  "Передача кодов маркировки единиц товара
  {% note warning \"Этот запрос только для DBS\" %}

Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).

{% endnote %}

Передает Маркету коды маркировки для единиц товара в указанном заказе.

Принимаются коды следующих типов:

* Коды «Честного знака».
* УИН для ювелирных изделий.
* РНПТ и ГТД для импортных прослеживаемых товаров.

{% note warning %}

Прежде чем работать с этим методом, обязательно прочтите [статью о работе с маркируемыми товарами](https://yandex.ru/support/marketplace/orders/cz.html).

{% endnote %}

Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, provide-order-item-identifiers-request provide-order-item-identifiers-request]
  (check-required-params campaignId orderId provide-order-item-identifiers-request)
  (call-api "/campaigns/{campaignId}/orders/{orderId}/identifiers" :put
            {:path-params   {"campaignId" campaignId "orderId" orderId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    provide-order-item-identifiers-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec provide-order-item-identifiers provide-order-item-identifiers-response-spec
  "Передача кодов маркировки единиц товара
  {% note warning \"Этот запрос только для DBS\" %}

Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).

{% endnote %}

Передает Маркету коды маркировки для единиц товара в указанном заказе.

Принимаются коды следующих типов:

* Коды «Честного знака».
* УИН для ювелирных изделий.
* РНПТ и ГТД для импортных прослеживаемых товаров.

{% note warning %}

Прежде чем работать с этим методом, обязательно прочтите [статью о работе с маркируемыми товарами](https://yandex.ru/support/marketplace/orders/cz.html).

{% endnote %}

Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, provide-order-item-identifiers-request provide-order-item-identifiers-request]
  (let [res (:data (provide-order-item-identifiers-with-http-info campaignId orderId provide-order-item-identifiers-request))]
    (if (:decode-models *api-context*)
       (st/decode provide-order-item-identifiers-response-spec res st/string-transformer)
       res)))


(defn-spec put-bids-for-business-with-http-info any?
  "Включение буста продаж и установка ставок
  Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.

{% cut \"Как в кабинете выглядит кампания, созданная через API\" %}

![](../../_images/api-boost.png)

{% endcut %}

При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).

Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.

Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.

Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.

Внести другие изменения в созданную через API кампанию можно в кабинете:

* выключить или включить кампанию;
* изменить ее название;
* выключить или включить ценовую стратегию.

Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.

Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).

{% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}

𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|"
  [businessId int?, put-sku-bids-request put-sku-bids-request]
  (check-required-params businessId put-sku-bids-request)
  (call-api "/businesses/{businessId}/bids" :put
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    put-sku-bids-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec put-bids-for-business empty-api-response-spec
  "Включение буста продаж и установка ставок
  Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.

{% cut \"Как в кабинете выглядит кампания, созданная через API\" %}

![](../../_images/api-boost.png)

{% endcut %}

При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).

Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.

Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.

Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.

Внести другие изменения в созданную через API кампанию можно в кабинете:

* выключить или включить кампанию;
* изменить ее название;
* выключить или включить ценовую стратегию.

Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.

Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).

{% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}

𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|"
  [businessId int?, put-sku-bids-request put-sku-bids-request]
  (let [res (:data (put-bids-for-business-with-http-info businessId put-sku-bids-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec put-bids-for-campaign-with-http-info any?
  "Включение буста продаж и установка ставок для магазина
  Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.

При первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).

Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.

Запрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.

Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.

Внести другие изменения в созданную через API кампанию можно в кабинете:

* выключить или включить кампанию;
* изменить ее название;
* выключить или включить ценовую стратегию.

Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.

Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).

{% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}

𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|"
  [campaignId int?, put-sku-bids-request put-sku-bids-request]
  (check-required-params campaignId put-sku-bids-request)
  (call-api "/campaigns/{campaignId}/bids" :put
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    put-sku-bids-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec put-bids-for-campaign empty-api-response-spec
  "Включение буста продаж и установка ставок для магазина
  Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.

При первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).

Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.

Запрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.

Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.

Внести другие изменения в созданную через API кампанию можно в кабинете:

* выключить или включить кампанию;
* изменить ее название;
* выключить или включить ценовую стратегию.

Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.

Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).

{% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}

𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|"
  [campaignId int?, put-sku-bids-request put-sku-bids-request]
  (let [res (:data (put-bids-for-campaign-with-http-info campaignId put-sku-bids-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec refresh-feed-with-http-info any?
  "Сообщить, что прайс-лист обновился
  {% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе.
1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете.
2. Магазин отправляет Маркету запрос методом `POST campaigns/{campaignId}/feeds/{feedId}/refresh`.
3. Маркет начинает обновление данных магазина на сервисе.

{% note alert %}

Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — `200 OK`. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.

{% endnote %}

|**⚙️ Лимит:** 3 запроса в час для одного прайс-листа|
|-|"
  [campaignId int?, feedId int?]
  (check-required-params campaignId feedId)
  (call-api "/campaigns/{campaignId}/feeds/{feedId}/refresh" :post
            {:path-params   {"campaignId" campaignId "feedId" feedId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec refresh-feed empty-api-response-spec
  "Сообщить, что прайс-лист обновился
  {% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе.
1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете.
2. Магазин отправляет Маркету запрос методом `POST campaigns/{campaignId}/feeds/{feedId}/refresh`.
3. Маркет начинает обновление данных магазина на сервисе.

{% note alert %}

Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — `200 OK`. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.

{% endnote %}

|**⚙️ Лимит:** 3 запроса в час для одного прайс-листа|
|-|"
  [campaignId int?, feedId int?]
  (let [res (:data (refresh-feed-with-http-info campaignId feedId))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec search-region-children-with-http-info any?
  "Информация о дочерних регионах
  Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|"
  ([regionId int?, ] (search-region-children-with-http-info regionId nil))
  ([regionId int?, {:keys [page pageSize]} (s/map-of keyword? any?)]
   (check-required-params regionId)
   (call-api "/regions/{regionId}/children" :get
             {:path-params   {"regionId" regionId }
              :header-params {}
              :query-params  {"page" page "pageSize" pageSize }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec search-region-children get-region-with-children-response-spec
  "Информация о дочерних регионах
  Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|"
  ([regionId int?, ] (search-region-children regionId nil))
  ([regionId int?, optional-params any?]
   (let [res (:data (search-region-children-with-http-info regionId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-region-with-children-response-spec res st/string-transformer)
        res))))


(defn-spec search-regions-by-id-with-http-info any?
  "Информация о регионе
  Возвращает информацию о регионе.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|"
  [regionId int?]
  (check-required-params regionId)
  (call-api "/regions/{regionId}" :get
            {:path-params   {"regionId" regionId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec search-regions-by-id get-regions-response-spec
  "Информация о регионе
  Возвращает информацию о регионе.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|"
  [regionId int?]
  (let [res (:data (search-regions-by-id-with-http-info regionId))]
    (if (:decode-models *api-context*)
       (st/decode get-regions-response-spec res st/string-transformer)
       res)))


(defn-spec search-regions-by-name-with-http-info any?
  "Поиск регионов по их имени
  Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.

Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|"
  ([name string?, ] (search-regions-by-name-with-http-info name nil))
  ([name string?, {:keys [page_token limit]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/regions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"name" name "page_token" page_token "limit" limit }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec search-regions-by-name get-regions-response-spec
  "Поиск регионов по их имени
  Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.

Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|"
  ([name string?, ] (search-regions-by-name name nil))
  ([name string?, optional-params any?]
   (let [res (:data (search-regions-by-name-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode get-regions-response-spec res st/string-transformer)
        res))))


(defn-spec search-shipments-with-http-info any?
  "Получение информации о нескольких отгрузках
  Возвращает информацию об отгрузках по заданным параметрам:

* дате;
* статусу;
* идентификаторам заказов.

Результаты возвращаются постранично.
|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([campaignId int?, search-shipments-request search-shipments-request, ] (search-shipments-with-http-info campaignId search-shipments-request nil))
  ([campaignId int?, search-shipments-request search-shipments-request, {:keys [page_token limit]} (s/map-of keyword? any?)]
   (check-required-params campaignId search-shipments-request)
   (call-api "/campaigns/{campaignId}/first-mile/shipments" :put
             {:path-params   {"campaignId" campaignId }
              :header-params {}
              :query-params  {"page_token" page_token "limit" limit }
              :form-params   {}
              :body-param    search-shipments-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["OAuth"]})))

(defn-spec search-shipments search-shipments-response-spec
  "Получение информации о нескольких отгрузках
  Возвращает информацию об отгрузках по заданным параметрам:

* дате;
* статусу;
* идентификаторам заказов.

Результаты возвращаются постранично.
|**⚙️ Лимит:** 100 запросов в час|
|-|"
  ([campaignId int?, search-shipments-request search-shipments-request, ] (search-shipments campaignId search-shipments-request nil))
  ([campaignId int?, search-shipments-request search-shipments-request, optional-params any?]
   (let [res (:data (search-shipments-with-http-info campaignId search-shipments-request optional-params))]
     (if (:decode-models *api-context*)
        (st/decode search-shipments-response-spec res st/string-transformer)
        res))))


(defn-spec send-file-to-chat-with-http-info any?
  "Отправка файла в чат
  Отправляет файл в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [businessId int?, chatId int?, ^File file any?]
  (check-required-params businessId chatId file)
  (call-api "/businesses/{businessId}/chats/file/send" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {"chatId" chatId }
             :form-params   {"file" file }
             :content-types ["multipart/form-data"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec send-file-to-chat empty-api-response-spec
  "Отправка файла в чат
  Отправляет файл в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [businessId int?, chatId int?, ^File file any?]
  (let [res (:data (send-file-to-chat-with-http-info businessId chatId file))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec send-message-to-chat-with-http-info any?
  "Отправка сообщения в чат
  Отправляет сообщение в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [businessId int?, chatId int?, send-message-to-chat-request send-message-to-chat-request]
  (check-required-params businessId chatId send-message-to-chat-request)
  (call-api "/businesses/{businessId}/chats/message" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {"chatId" chatId }
             :form-params   {}
             :body-param    send-message-to-chat-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec send-message-to-chat empty-api-response-spec
  "Отправка сообщения в чат
  Отправляет сообщение в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|"
  [businessId int?, chatId int?, send-message-to-chat-request send-message-to-chat-request]
  (let [res (:data (send-message-to-chat-with-http-info businessId chatId send-message-to-chat-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec set-feed-params-with-http-info any?
  "Изменение параметров прайс-листа
  {% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Позволяет магазину изменить параметры прайс-листа.

Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: `name` (название параметра) и `value` (значение параметра).

Чтобы отменить установленное значение, передайте в теле запроса: `name` (название параметра) и `delete=true` (удалить значение).

|**⚙️ Лимит:** 3 запроса в час для одного прайс-листа|
|-|"
  [campaignId int?, feedId int?, set-feed-params-request set-feed-params-request]
  (check-required-params campaignId feedId set-feed-params-request)
  (call-api "/campaigns/{campaignId}/feeds/{feedId}/params" :post
            {:path-params   {"campaignId" campaignId "feedId" feedId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    set-feed-params-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec set-feed-params empty-api-response-spec
  "Изменение параметров прайс-листа
  {% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Позволяет магазину изменить параметры прайс-листа.

Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: `name` (название параметра) и `value` (значение параметра).

Чтобы отменить установленное значение, передайте в теле запроса: `name` (название параметра) и `delete=true` (удалить значение).

|**⚙️ Лимит:** 3 запроса в час для одного прайс-листа|
|-|"
  [campaignId int?, feedId int?, set-feed-params-request set-feed-params-request]
  (let [res (:data (set-feed-params-with-http-info campaignId feedId set-feed-params-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec set-order-box-layout-with-http-info any?
  "Подготовка заказа
  {% note tip \"Подходит и для DBS\" %}

Запрос предназначен для работы с FBS-заказами, но вы можете использовать его для обработки DBS-заказов, если это удобно.

{% endnote %}

Позволяет выполнить три операции:

* передать Маркету информацию о распределении товаров по коробкам;
* передать Маркету коды маркировки для товаров;
* удалить товар из заказа, если его не оказалось на складе.

Если нужно что-то поправить в переданных данных, просто повторите запрос — это можно делать сколько угодно раз до перевода заказа в статус **Готов к отгрузке**. ⚠️ Если вы меняете раскладку уже после печати и расклейки ярлыков, не забудье перепечатать их и наклеить заново.

## Как передать информацию о распределении товаров

В этом запросе вам нужно передать Маркету список коробок и указать, какие именно товары лежат в каждой из них. Коробки могут быть двух типов:

* **Содержащие товары целиком.** Такая коробка может содержать сколько угодно единиц любых товаров.

* **Содержащие часть товара.** Такие коробки содержат по одной части одного товара. Например, одна содержит внешний блок кондиционера, а другая — внутренний блок.

⚠️ Одна коробка не может содержать и товары целиком, и части товаров.

## Как передавать коды маркировки

Если в заказе есть товары, подлежащие маркировке, в запросе нужно передать соответствующие уникальные коды. [Что такое маркировка?](https://yandex.ru/support/marketplace/orders/cz.html)

Принимаются коды следующих типов:

* Коды «Честного знака».
* УИН для ювелирных изделий.
* РНПТ и ГТД для импортных прослеживаемых товаров.

Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.

Если товар едет в нескольких коробках, код маркировки нужно передать для каждой из них.

## Как удалить товар из заказа

Чтобы удалить товар из заказа:

1. Добавьте в запрос `allowRemove: true`.
2. Передайте распределение по коробкам без товара, который нужно удалить.

{% note warning \"Удаление нельзя отменить\" %}

Эта операция необратима: покупатель сразу получит уведомление, а состав заказа изменится.

{% endnote %}

Чтобы удалить позицию целиком, не передавайте соответствующий `OrderBoxLayoutItemDTO`. Чтобы уменьшить количество товара, передайте уменьшенное значение в поле `fullCount`.

Нельзя удалить или уменьшить количество товара, если он:

* добавлен по акции;
* составляет 99% стоимости заказа;
* единственный товар в заказе.

Если вы не можете отгрузить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа `CANCELLED` с причиной отмены `SHOP_FAILED`.

{% note info \"Увеличить заказ нельзя\" %}

С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.

{% endnote %}

## Примеры

{% cut \"Товар умещается в коробку\" %}

Вот как будет выглядеть запрос, если в одной коробке едут:

  * три единицы одного товара, требующего маркировки;
  * одна единица другого товара, не требущего маркировки.

  ```json
  {
      \"boxes\": [
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"fullCount\": 3,
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          },
                          {
                              \"cis\": \"010304109478gftJ14545762!\\u001dhGt264\"
                          },
                          {
                              \"cis\": \"010304109478fRs28323ks23!\\u001dhet201\"
                          }
                      ]
                  },
                  {
                      \"id\": 654321,
                      \"fullCount\": 1
                  }
              ]
          }
      ]
  }
  ```

{% endcut %}

{% cut \"Товар едет в разных коробках\" %}

Вот как будет выглядеть запрос, если товар едет в двух коробках:

  ```json
  {
      \"boxes\": [
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 1,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          },
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 2,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          }
      ]
  }
  ```

{% endcut %}

{% cut \"Одинаковые товары, где каждый едет в нескольких коробках\" %}

Вот как будет выглядеть запрос, если каждый из двух одинаковых товаров едет в двух коробках:

  ```json
  {
      \"boxes\": [
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 1,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          },
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 2,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          },
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 1,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          },
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 2,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          }
      ]
  }
  ```

{% endcut %}

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, set-order-box-layout-request set-order-box-layout-request]
  (check-required-params campaignId orderId set-order-box-layout-request)
  (call-api "/campaigns/{campaignId}/orders/{orderId}/boxes" :put
            {:path-params   {"campaignId" campaignId "orderId" orderId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    set-order-box-layout-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec set-order-box-layout set-order-box-layout-response-spec
  "Подготовка заказа
  {% note tip \"Подходит и для DBS\" %}

Запрос предназначен для работы с FBS-заказами, но вы можете использовать его для обработки DBS-заказов, если это удобно.

{% endnote %}

Позволяет выполнить три операции:

* передать Маркету информацию о распределении товаров по коробкам;
* передать Маркету коды маркировки для товаров;
* удалить товар из заказа, если его не оказалось на складе.

Если нужно что-то поправить в переданных данных, просто повторите запрос — это можно делать сколько угодно раз до перевода заказа в статус **Готов к отгрузке**. ⚠️ Если вы меняете раскладку уже после печати и расклейки ярлыков, не забудье перепечатать их и наклеить заново.

## Как передать информацию о распределении товаров

В этом запросе вам нужно передать Маркету список коробок и указать, какие именно товары лежат в каждой из них. Коробки могут быть двух типов:

* **Содержащие товары целиком.** Такая коробка может содержать сколько угодно единиц любых товаров.

* **Содержащие часть товара.** Такие коробки содержат по одной части одного товара. Например, одна содержит внешний блок кондиционера, а другая — внутренний блок.

⚠️ Одна коробка не может содержать и товары целиком, и части товаров.

## Как передавать коды маркировки

Если в заказе есть товары, подлежащие маркировке, в запросе нужно передать соответствующие уникальные коды. [Что такое маркировка?](https://yandex.ru/support/marketplace/orders/cz.html)

Принимаются коды следующих типов:

* Коды «Честного знака».
* УИН для ювелирных изделий.
* РНПТ и ГТД для импортных прослеживаемых товаров.

Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.

Если товар едет в нескольких коробках, код маркировки нужно передать для каждой из них.

## Как удалить товар из заказа

Чтобы удалить товар из заказа:

1. Добавьте в запрос `allowRemove: true`.
2. Передайте распределение по коробкам без товара, который нужно удалить.

{% note warning \"Удаление нельзя отменить\" %}

Эта операция необратима: покупатель сразу получит уведомление, а состав заказа изменится.

{% endnote %}

Чтобы удалить позицию целиком, не передавайте соответствующий `OrderBoxLayoutItemDTO`. Чтобы уменьшить количество товара, передайте уменьшенное значение в поле `fullCount`.

Нельзя удалить или уменьшить количество товара, если он:

* добавлен по акции;
* составляет 99% стоимости заказа;
* единственный товар в заказе.

Если вы не можете отгрузить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа `CANCELLED` с причиной отмены `SHOP_FAILED`.

{% note info \"Увеличить заказ нельзя\" %}

С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.

{% endnote %}

## Примеры

{% cut \"Товар умещается в коробку\" %}

Вот как будет выглядеть запрос, если в одной коробке едут:

  * три единицы одного товара, требующего маркировки;
  * одна единица другого товара, не требущего маркировки.

  ```json
  {
      \"boxes\": [
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"fullCount\": 3,
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          },
                          {
                              \"cis\": \"010304109478gftJ14545762!\\u001dhGt264\"
                          },
                          {
                              \"cis\": \"010304109478fRs28323ks23!\\u001dhet201\"
                          }
                      ]
                  },
                  {
                      \"id\": 654321,
                      \"fullCount\": 1
                  }
              ]
          }
      ]
  }
  ```

{% endcut %}

{% cut \"Товар едет в разных коробках\" %}

Вот как будет выглядеть запрос, если товар едет в двух коробках:

  ```json
  {
      \"boxes\": [
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 1,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          },
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 2,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          }
      ]
  }
  ```

{% endcut %}

{% cut \"Одинаковые товары, где каждый едет в нескольких коробках\" %}

Вот как будет выглядеть запрос, если каждый из двух одинаковых товаров едет в двух коробках:

  ```json
  {
      \"boxes\": [
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 1,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          },
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 2,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          },
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 1,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          },
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 2,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          }
      ]
  }
  ```

{% endcut %}

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, set-order-box-layout-request set-order-box-layout-request]
  (let [res (:data (set-order-box-layout-with-http-info campaignId orderId set-order-box-layout-request))]
    (if (:decode-models *api-context*)
       (st/decode set-order-box-layout-response-spec res st/string-transformer)
       res)))


(defn-spec set-order-shipment-boxes-with-http-info any?
  "Передача количества грузовых мест в заказе
  {% note warning \"Этот запрос только для DBS\" %}

Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).

{% endnote %}

Отгружаемый Маркету заказ может не влезть в одну коробку или упаковку — в этом случае получается, что он занимает несколько грузовых мест.

Количество грузовых мест нужно обязательно передавать Маркету, если оно не равно 1. Это делается перед переводом его в статус **Готов к отгрузке**. Подробно о том, что в какой момент нужно передавать, рассказано в [пошаговой инструкции](../../step-by-step/fbs.md).

Метод устроен немного нестандартно: количество задается длиной массива пустых объектов.

Раньше метод требовал передачи большего количества данных. Запросы, оформленные по старому образцу, работают, но лучше делать по-новому.

{% cut \"Как было раньше\" %}

Структура тела PUT-запроса:

```
{
  \"boxes\":
  [
    {
      \"fulfilmentId\": \"{string}\",
      \"weight\": {int64},
      \"width\": {int64},
      \"height\": {int64},
      \"depth\": {int64},
      \"items\":
      [
        {
          \"id\": {int64},
          \"count\": {int32}
        },
        ...
      ]
    },
    ...
  ]
}
```
| **Параметр**  | **Тип**  | **Значение**  |
| ----------- | ----------- | ----------- |
| `boxes`       |           | Список грузовых мест.       |

**Параметры, вложенные в `boxes`**
| **Параметр**  | **Тип**  | **Значение**  |
| ----------- | ----------- | ----------- |
| `fulfilmentId`       |  String   | Идентификатор грузового места в информационной системе магазина. Сформируйте идентификатор по шаблону: `номер заказа на Маркете-номер грузового места`. Например, `7206821‑1, 7206821‑2` и т. д. |
| `weight`       | Int64        | Масса брутто грузового места (суммарная масса упаковки и содержимого) в граммах. |
| `width`       | Int64   | Ширина грузового места в сантиметрах.       |
| `height`       | Int64   | Высота грузового места в сантиметрах.       |
| `depth`       | Int64   | Глубина грузового места в сантиметрах.        |
| `items`       | Int64   | Список товаров в грузовом месте.       |

**Параметры, вложенные в `items`**
| **Параметр**  | **Тип**  | **Значение**  |
| ----------- | ----------- | ----------- |
| `id`       | Int64     | Идентификатор товара в рамках заказа.   |
| `count`    | Int32     | Количество единиц товара в грузовом месте.       |

{% endcut %}

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, shipmentId int?, set-order-shipment-boxes-request set-order-shipment-boxes-request]
  (check-required-params campaignId orderId shipmentId set-order-shipment-boxes-request)
  (call-api "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes" :put
            {:path-params   {"campaignId" campaignId "orderId" orderId "shipmentId" shipmentId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    set-order-shipment-boxes-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec set-order-shipment-boxes set-order-shipment-boxes-response-spec
  "Передача количества грузовых мест в заказе
  {% note warning \"Этот запрос только для DBS\" %}

Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).

{% endnote %}

Отгружаемый Маркету заказ может не влезть в одну коробку или упаковку — в этом случае получается, что он занимает несколько грузовых мест.

Количество грузовых мест нужно обязательно передавать Маркету, если оно не равно 1. Это делается перед переводом его в статус **Готов к отгрузке**. Подробно о том, что в какой момент нужно передавать, рассказано в [пошаговой инструкции](../../step-by-step/fbs.md).

Метод устроен немного нестандартно: количество задается длиной массива пустых объектов.

Раньше метод требовал передачи большего количества данных. Запросы, оформленные по старому образцу, работают, но лучше делать по-новому.

{% cut \"Как было раньше\" %}

Структура тела PUT-запроса:

```
{
  \"boxes\":
  [
    {
      \"fulfilmentId\": \"{string}\",
      \"weight\": {int64},
      \"width\": {int64},
      \"height\": {int64},
      \"depth\": {int64},
      \"items\":
      [
        {
          \"id\": {int64},
          \"count\": {int32}
        },
        ...
      ]
    },
    ...
  ]
}
```
| **Параметр**  | **Тип**  | **Значение**  |
| ----------- | ----------- | ----------- |
| `boxes`       |           | Список грузовых мест.       |

**Параметры, вложенные в `boxes`**
| **Параметр**  | **Тип**  | **Значение**  |
| ----------- | ----------- | ----------- |
| `fulfilmentId`       |  String   | Идентификатор грузового места в информационной системе магазина. Сформируйте идентификатор по шаблону: `номер заказа на Маркете-номер грузового места`. Например, `7206821‑1, 7206821‑2` и т. д. |
| `weight`       | Int64        | Масса брутто грузового места (суммарная масса упаковки и содержимого) в граммах. |
| `width`       | Int64   | Ширина грузового места в сантиметрах.       |
| `height`       | Int64   | Высота грузового места в сантиметрах.       |
| `depth`       | Int64   | Глубина грузового места в сантиметрах.        |
| `items`       | Int64   | Список товаров в грузовом месте.       |

**Параметры, вложенные в `items`**
| **Параметр**  | **Тип**  | **Значение**  |
| ----------- | ----------- | ----------- |
| `id`       | Int64     | Идентификатор товара в рамках заказа.   |
| `count`    | Int32     | Количество единиц товара в грузовом месте.       |

{% endcut %}

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, shipmentId int?, set-order-shipment-boxes-request set-order-shipment-boxes-request]
  (let [res (:data (set-order-shipment-boxes-with-http-info campaignId orderId shipmentId set-order-shipment-boxes-request))]
    (if (:decode-models *api-context*)
       (st/decode set-order-shipment-boxes-response-spec res st/string-transformer)
       res)))


(defn-spec set-shipment-pallets-count-with-http-info any?
  "Передача количества упаковок в отгрузке
  Передает Маркету количество коробов или палет в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).

Получить PDF-файл с ярлыками для упаковок можно с помощью запроса [GET campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels](../../reference/shipments/downloadShipmentPalletLabels.md).
|**⚙️ Лимит:** 200 запросов в час|
|-|"
  [campaignId int?, shipmentId int?, set-shipment-pallets-count-request set-shipment-pallets-count-request]
  (check-required-params campaignId shipmentId set-shipment-pallets-count-request)
  (call-api "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets" :put
            {:path-params   {"campaignId" campaignId "shipmentId" shipmentId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    set-shipment-pallets-count-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec set-shipment-pallets-count empty-api-response-spec
  "Передача количества упаковок в отгрузке
  Передает Маркету количество коробов или палет в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).

Получить PDF-файл с ярлыками для упаковок можно с помощью запроса [GET campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels](../../reference/shipments/downloadShipmentPalletLabels.md).
|**⚙️ Лимит:** 200 запросов в час|
|-|"
  [campaignId int?, shipmentId int?, set-shipment-pallets-count-request set-shipment-pallets-count-request]
  (let [res (:data (set-shipment-pallets-count-with-http-info campaignId shipmentId set-shipment-pallets-count-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec skip-goods-feedbacks-reaction-with-http-info any?
  "Отказ от ответа на отзывы
  Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).

|**⚙️ Лимит:** 1 000 запросов в час|
|-|"
  [businessId int?, skip-goods-feedback-reaction-request skip-goods-feedback-reaction-request]
  (check-required-params businessId skip-goods-feedback-reaction-request)
  (call-api "/businesses/{businessId}/goods-feedback/skip-reaction" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    skip-goods-feedback-reaction-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec skip-goods-feedbacks-reaction empty-api-response-spec
  "Отказ от ответа на отзывы
  Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).

|**⚙️ Лимит:** 1 000 запросов в час|
|-|"
  [businessId int?, skip-goods-feedback-reaction-request skip-goods-feedback-reaction-request]
  (let [res (:data (skip-goods-feedbacks-reaction-with-http-info businessId skip-goods-feedback-reaction-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec transfer-orders-from-shipment-with-http-info any?
  "Перенос заказов в следующую отгрузку
  Переносит указанные заказы из указанной отгрузки в следующую отгрузку. [Что такое отгрузка?](https://yandex.ru/support/marketplace/orders/fbs/process.html#ship)

Используйте этот запрос, если не успеваете собрать и упаковать заказы вовремя.

{% note warning \"Такие переносы снижают индекс качества магазина\" %}

Этот запрос предназначен для исключительных случаев. Если вы будете переносить заказы слишком часто, магазин столкнется с ограничениями. [Что за ограничения?](https://yandex.ru/support/marketplace/quality/score/fbs.html)

{% endnote %}

Переносить заказы можно, если до формирования отгрузки осталось больше получаса.

Перенос происходит не мгновенно, а занимает несколько минут.

|**⚙️ Лимит:** 200 запросов в час|
|-|"
  [campaignId int?, shipmentId int?, transfer-orders-from-shipment-request transfer-orders-from-shipment-request]
  (check-required-params campaignId shipmentId transfer-orders-from-shipment-request)
  (call-api "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer" :post
            {:path-params   {"campaignId" campaignId "shipmentId" shipmentId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    transfer-orders-from-shipment-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec transfer-orders-from-shipment empty-api-response-spec
  "Перенос заказов в следующую отгрузку
  Переносит указанные заказы из указанной отгрузки в следующую отгрузку. [Что такое отгрузка?](https://yandex.ru/support/marketplace/orders/fbs/process.html#ship)

Используйте этот запрос, если не успеваете собрать и упаковать заказы вовремя.

{% note warning \"Такие переносы снижают индекс качества магазина\" %}

Этот запрос предназначен для исключительных случаев. Если вы будете переносить заказы слишком часто, магазин столкнется с ограничениями. [Что за ограничения?](https://yandex.ru/support/marketplace/quality/score/fbs.html)

{% endnote %}

Переносить заказы можно, если до формирования отгрузки осталось больше получаса.

Перенос происходит не мгновенно, а занимает несколько минут.

|**⚙️ Лимит:** 200 запросов в час|
|-|"
  [campaignId int?, shipmentId int?, transfer-orders-from-shipment-request transfer-orders-from-shipment-request]
  (let [res (:data (transfer-orders-from-shipment-with-http-info campaignId shipmentId transfer-orders-from-shipment-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec update-business-prices-with-http-info any?
  "Установка цен на товары во всех магазинах
  Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|"
  [businessId int?, update-business-prices-request update-business-prices-request]
  (check-required-params businessId update-business-prices-request)
  (call-api "/businesses/{businessId}/offer-prices/updates" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update-business-prices-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec update-business-prices empty-api-response-spec
  "Установка цен на товары во всех магазинах
  Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|"
  [businessId int?, update-business-prices-request update-business-prices-request]
  (let [res (:data (update-business-prices-with-http-info businessId update-business-prices-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec update-campaign-offers-with-http-info any?
  "Изменение условий продажи товаров в магазине
  Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  [campaignId int?, update-campaign-offers-request update-campaign-offers-request]
  (check-required-params campaignId update-campaign-offers-request)
  (call-api "/campaigns/{campaignId}/offers/update" :post
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update-campaign-offers-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec update-campaign-offers empty-api-response-spec
  "Изменение условий продажи товаров в магазине
  Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  [campaignId int?, update-campaign-offers-request update-campaign-offers-request]
  (let [res (:data (update-campaign-offers-with-http-info campaignId update-campaign-offers-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec update-goods-feedback-comment-with-http-info any?
  "Добавление нового или изменение созданного комментария
  Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.

Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.

Чтобы добавить комментарий к другому комментарию, передайте:

* `feedbackId` — идентификатор отзыва;
* `comment.parentId` — идентификатор родительского комментария.

Чтобы изменить комментарий, передайте:

* `feedbackId`— идентификатор отзыва;
* `comment.id` — идентификатор комментария, который нужно изменить.

Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|"
  [businessId int?, update-goods-feedback-comment-request update-goods-feedback-comment-request]
  (check-required-params businessId update-goods-feedback-comment-request)
  (call-api "/businesses/{businessId}/goods-feedback/comments/update" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update-goods-feedback-comment-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec update-goods-feedback-comment update-goods-feedback-comment-response-spec
  "Добавление нового или изменение созданного комментария
  Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.

Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.

Чтобы добавить комментарий к другому комментарию, передайте:

* `feedbackId` — идентификатор отзыва;
* `comment.parentId` — идентификатор родительского комментария.

Чтобы изменить комментарий, передайте:

* `feedbackId`— идентификатор отзыва;
* `comment.id` — идентификатор комментария, который нужно изменить.

Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|"
  [businessId int?, update-goods-feedback-comment-request update-goods-feedback-comment-request]
  (let [res (:data (update-goods-feedback-comment-with-http-info businessId update-goods-feedback-comment-request))]
    (if (:decode-models *api-context*)
       (st/decode update-goods-feedback-comment-response-spec res st/string-transformer)
       res)))


(defn-spec update-offer-content-with-http-info any?
  "Редактирование категорийных характеристик товара
  Редактирует характеристики товара, которые специфичны для категории, к которой он относится.

{% note warning \"Здесь только то, что относится к конкретной категории\" %}

Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).

{% endnote %}

Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  [businessId int?, update-offer-content-request update-offer-content-request]
  (check-required-params businessId update-offer-content-request)
  (call-api "/businesses/{businessId}/offer-cards/update" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update-offer-content-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec update-offer-content update-offer-content-response-spec
  "Редактирование категорийных характеристик товара
  Редактирует характеристики товара, которые специфичны для категории, к которой он относится.

{% note warning \"Здесь только то, что относится к конкретной категории\" %}

Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).

{% endnote %}

Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  [businessId int?, update-offer-content-request update-offer-content-request]
  (let [res (:data (update-offer-content-with-http-info businessId update-offer-content-request))]
    (if (:decode-models *api-context*)
       (st/decode update-offer-content-response-spec res st/string-transformer)
       res)))


(defn-spec update-offer-mapping-entries-with-http-info any?
  "Добавление и редактирование товаров в каталоге
  {% note warning \"\" %}

Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).

{% endnote %}

Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.

Информацию о товарах нужно передать в теле POST-запроса.

У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:

* Чтобы добавить в каталог новый товар, укажите в параметре `shopSku` ваш SKU, которого еще нет в каталоге.
* Чтобы отредактировать товар из каталога, укажите в параметре `shopSku` ваш SKU этого товара в каталоге.

В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.

Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус `NEED_CONTENT` (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).

Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус `NEED_INFO` (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).

В одном запросе можно добавить не более 500 товаров.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5 000 товаров в минуту|
|-|"
  [campaignId int?, update-offer-mapping-entry-request update-offer-mapping-entry-request]
  (check-required-params campaignId update-offer-mapping-entry-request)
  (call-api "/campaigns/{campaignId}/offer-mapping-entries/updates" :post
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update-offer-mapping-entry-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec update-offer-mapping-entries empty-api-response-spec
  "Добавление и редактирование товаров в каталоге
  {% note warning \"\" %}

Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).

{% endnote %}

Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.

Информацию о товарах нужно передать в теле POST-запроса.

У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:

* Чтобы добавить в каталог новый товар, укажите в параметре `shopSku` ваш SKU, которого еще нет в каталоге.
* Чтобы отредактировать товар из каталога, укажите в параметре `shopSku` ваш SKU этого товара в каталоге.

В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.

Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус `NEED_CONTENT` (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).

Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус `NEED_INFO` (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).

В одном запросе можно добавить не более 500 товаров.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5 000 товаров в минуту|
|-|"
  [campaignId int?, update-offer-mapping-entry-request update-offer-mapping-entry-request]
  (let [res (:data (update-offer-mapping-entries-with-http-info campaignId update-offer-mapping-entry-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec update-offer-mappings-with-http-info any?
  "Добавление товаров в каталог и изменение информации о них
  Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.

Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).

Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.

Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.

Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.

Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.

Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.

{% note warning \"Правила использования SKU\" %}

* У каждого товара SKU должен быть свой.

* SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.

* Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.

{% endnote %}

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|"
  [businessId int?, update-offer-mappings-request update-offer-mappings-request]
  (check-required-params businessId update-offer-mappings-request)
  (call-api "/businesses/{businessId}/offer-mappings/update" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update-offer-mappings-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec update-offer-mappings update-offer-mappings-response-spec
  "Добавление товаров в каталог и изменение информации о них
  Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.

Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).

Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.

Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.

Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.

Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.

Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.

{% note warning \"Правила использования SKU\" %}

* У каждого товара SKU должен быть свой.

* SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.

* Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.

{% endnote %}

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|"
  [businessId int?, update-offer-mappings-request update-offer-mappings-request]
  (let [res (:data (update-offer-mappings-with-http-info businessId update-offer-mappings-request))]
    (if (:decode-models *api-context*)
       (st/decode update-offer-mappings-response-spec res st/string-transformer)
       res)))


(defn-spec update-order-items-with-http-info any?
  "Удаление товара из заказа или уменьшение числа единиц
  {% note warning \"Этот запрос только для DBS\" %}

Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).

{% endnote %}

Изменяет состав заказа, если позволяет выбранная служба доставки, в случаях:

* покупатель уменьшил количество товара;
* магазин не может поставить все товары в заказе.

Для этого заказ должен находится в статусе `\"status\": \"PROCESSING\"` этапа обработки `\"substatus\": \"STARTED\"`. После передачи статуса `\"substatus\": \"READY_TO_SHIP\"` изменить состав невозможно.

Если одинаковых товаров несколько, для уменьшения количества передайте обновленное значение в атрибуте `count` параметра `item`.

Чтобы полностью удалить товар из заказа:

* передайте значение `0`; или
* не передавайте параметр `item`.

Нельзя удалить или уменьшить количество товара, если он:

* добавлен по акции;
* составляет 99% стоимости заказа;
* единственный товар в заказе.

Если необходимо удалить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа `CANCELLED` с причиной отмены `SHOP_FAILED`.

{% note info \"Увеличить заказ нельзя\" %}

С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.

{% endnote %}

**Возврат денег покупателю**

Если покупатель оплатил товар при оформлении, Маркет вернет ему деньги за удаленные из заказа товары в течение двух дней:

* при оплате банковской картой — с момента, когда магазин переведет заказ в статус `SHIPPED`;

* при оплате через Apple Pay или Google Pay — с момента, когда магазин удалит товар из заказа.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, update-order-item-request update-order-item-request]
  (check-required-params campaignId orderId update-order-item-request)
  (call-api "/campaigns/{campaignId}/orders/{orderId}/items" :put
            {:path-params   {"campaignId" campaignId "orderId" orderId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update-order-item-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec update-order-items any?
  "Удаление товара из заказа или уменьшение числа единиц
  {% note warning \"Этот запрос только для DBS\" %}

Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).

{% endnote %}

Изменяет состав заказа, если позволяет выбранная служба доставки, в случаях:

* покупатель уменьшил количество товара;
* магазин не может поставить все товары в заказе.

Для этого заказ должен находится в статусе `\"status\": \"PROCESSING\"` этапа обработки `\"substatus\": \"STARTED\"`. После передачи статуса `\"substatus\": \"READY_TO_SHIP\"` изменить состав невозможно.

Если одинаковых товаров несколько, для уменьшения количества передайте обновленное значение в атрибуте `count` параметра `item`.

Чтобы полностью удалить товар из заказа:

* передайте значение `0`; или
* не передавайте параметр `item`.

Нельзя удалить или уменьшить количество товара, если он:

* добавлен по акции;
* составляет 99% стоимости заказа;
* единственный товар в заказе.

Если необходимо удалить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа `CANCELLED` с причиной отмены `SHOP_FAILED`.

{% note info \"Увеличить заказ нельзя\" %}

С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.

{% endnote %}

**Возврат денег покупателю**

Если покупатель оплатил товар при оформлении, Маркет вернет ему деньги за удаленные из заказа товары в течение двух дней:

* при оплате банковской картой — с момента, когда магазин переведет заказ в статус `SHIPPED`;

* при оплате через Apple Pay или Google Pay — с момента, когда магазин удалит товар из заказа.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, update-order-item-request update-order-item-request]
  (let [res (:data (update-order-items-with-http-info campaignId orderId update-order-item-request))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec update-order-status-with-http-info any?
  "Изменение статуса одного заказа
  Изменяет статус заказа. Возможные изменения статусов:

* Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"PROCESSING\"` и этап обработки `\"substatus\": \"READY_TO_SHIP\"`.
* Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.
* Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"READY_TO_SHIP\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, update-order-status-request update-order-status-request]
  (check-required-params campaignId orderId update-order-status-request)
  (call-api "/campaigns/{campaignId}/orders/{orderId}/status" :put
            {:path-params   {"campaignId" campaignId "orderId" orderId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update-order-status-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec update-order-status update-order-status-response-spec
  "Изменение статуса одного заказа
  Изменяет статус заказа. Возможные изменения статусов:

* Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"PROCESSING\"` и этап обработки `\"substatus\": \"READY_TO_SHIP\"`.
* Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.
* Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"READY_TO_SHIP\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, update-order-status-request update-order-status-request]
  (let [res (:data (update-order-status-with-http-info campaignId orderId update-order-status-request))]
    (if (:decode-models *api-context*)
       (st/decode update-order-status-response-spec res st/string-transformer)
       res)))


(defn-spec update-order-statuses-with-http-info any?
  "Изменение статусов нескольких заказов
  Изменяет статусы нескольких заказов.

Возможные изменения статусов:

* Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса `\"status\": \"PROCESSING\"`и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"PROCESSING\"` и этап обработки `\"substatus\": \"READY_TO_SHIP\"`.
* Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.
* Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"READY_TO_SHIP\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.

Максимальное количество заказов, у которых можно изменить статус в одном запросе, — 30.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, update-order-statuses-request update-order-statuses-request]
  (check-required-params campaignId update-order-statuses-request)
  (call-api "/campaigns/{campaignId}/orders/status-update" :post
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update-order-statuses-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec update-order-statuses update-order-statuses-response-spec
  "Изменение статусов нескольких заказов
  Изменяет статусы нескольких заказов.

Возможные изменения статусов:

* Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса `\"status\": \"PROCESSING\"`и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"PROCESSING\"` и этап обработки `\"substatus\": \"READY_TO_SHIP\"`.
* Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.
* Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"READY_TO_SHIP\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.

Максимальное количество заказов, у которых можно изменить статус в одном запросе, — 30.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, update-order-statuses-request update-order-statuses-request]
  (let [res (:data (update-order-statuses-with-http-info campaignId update-order-statuses-request))]
    (if (:decode-models *api-context*)
       (st/decode update-order-statuses-response-spec res st/string-transformer)
       res)))


(defn-spec update-prices-with-http-info any?
  "Установка цен на товары в конкретном магазине
  Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).

{% note warning \"Метод только для отдельных магазинов\" %}

Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.

Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).

{% endnote %}

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  [campaignId int?, update-prices-request update-prices-request]
  (check-required-params campaignId update-prices-request)
  (call-api "/campaigns/{campaignId}/offer-prices/updates" :post
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update-prices-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec update-prices empty-api-response-spec
  "Установка цен на товары в конкретном магазине
  Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).

{% note warning \"Метод только для отдельных магазинов\" %}

Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.

Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).

{% endnote %}

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|"
  [campaignId int?, update-prices-request update-prices-request]
  (let [res (:data (update-prices-with-http-info campaignId update-prices-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


(defn-spec update-promo-offers-with-http-info any?
  "Добавление товаров в акцию или изменение их цен
  Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|"
  [businessId int?, update-promo-offers-request update-promo-offers-request]
  (check-required-params businessId update-promo-offers-request)
  (call-api "/businesses/{businessId}/promos/offers/update" :post
            {:path-params   {"businessId" businessId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update-promo-offers-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec update-promo-offers update-promo-offers-response-spec
  "Добавление товаров в акцию или изменение их цен
  Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|"
  [businessId int?, update-promo-offers-request update-promo-offers-request]
  (let [res (:data (update-promo-offers-with-http-info businessId update-promo-offers-request))]
    (if (:decode-models *api-context*)
       (st/decode update-promo-offers-response-spec res st/string-transformer)
       res)))


(defn-spec update-stocks-with-http-info any?
  "Передача информации об остатках
  Передает данные об остатках товаров на витрине.

Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 100 000 товаров в минуту|
|-|"
  [campaignId int?, update-stocks-request update-stocks-request]
  (check-required-params campaignId update-stocks-request)
  (call-api "/campaigns/{campaignId}/offers/stocks" :put
            {:path-params   {"campaignId" campaignId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update-stocks-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec update-stocks empty-api-response-spec
  "Передача информации об остатках
  Передает данные об остатках товаров на витрине.

Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 100 000 товаров в минуту|
|-|"
  [campaignId int?, update-stocks-request update-stocks-request]
  (let [res (:data (update-stocks-with-http-info campaignId update-stocks-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


