(ns партнерский-api-маркета.api.orders
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


(defn-spec accept-order-cancellation-with-http-info any?
  "Отмена заказа покупателем
  Подтверждает или отклоняет запрос покупателя на отмену заказа, который передан службе доставки.

Покупатель может отменить заказ в течение его обработки или доставки. Если заказ еще обрабатывается (имеет статус PROCESSING), вам не нужно подтверждать отмену заказа — он будет отменен автоматически.

Если заказ уже передан службе доставки (принимает статус `DELIVERY` или `PICKUP`) и пользователь отменил его, вы можете предупредить службу об отмене в течение 48 часов. Если служба доставки узнала об отмене до передачи заказа покупателю, подтвердите отмену с помощью запроса [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation.md). Если заказ уже доставлен, отклоните отмену с помощью этого же запроса. Тогда у покупателя останется заказ, и деньги за него возвращаться не будут.

Чтобы узнать, какие заказы были отменены в статусе `DELIVERY` или `PICKUP`, отправьте запрос [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md). В его URL добавьте входной параметр `onlyWaitingForCancellationApprove=true`. Вы также можете узнать об отмененных заказах в кабинете или через почту — на нее придет уведомление об отмене.

Если в течение 48 часов вы не подтвердите или отклоните отмену, заказ будет отменен автоматически.

|**⚙️ Лимит:** 500 запросов в час|
|-|"
  [campaignId int?, orderId int?, accept-order-cancellation-request accept-order-cancellation-request]
  (check-required-params campaignId orderId accept-order-cancellation-request)
  (call-api "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept" :put
            {:path-params   {"campaignId" campaignId "orderId" orderId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    accept-order-cancellation-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec accept-order-cancellation empty-api-response-spec
  "Отмена заказа покупателем
  Подтверждает или отклоняет запрос покупателя на отмену заказа, который передан службе доставки.

Покупатель может отменить заказ в течение его обработки или доставки. Если заказ еще обрабатывается (имеет статус PROCESSING), вам не нужно подтверждать отмену заказа — он будет отменен автоматически.

Если заказ уже передан службе доставки (принимает статус `DELIVERY` или `PICKUP`) и пользователь отменил его, вы можете предупредить службу об отмене в течение 48 часов. Если служба доставки узнала об отмене до передачи заказа покупателю, подтвердите отмену с помощью запроса [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation.md). Если заказ уже доставлен, отклоните отмену с помощью этого же запроса. Тогда у покупателя останется заказ, и деньги за него возвращаться не будут.

Чтобы узнать, какие заказы были отменены в статусе `DELIVERY` или `PICKUP`, отправьте запрос [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md). В его URL добавьте входной параметр `onlyWaitingForCancellationApprove=true`. Вы также можете узнать об отмененных заказах в кабинете или через почту — на нее придет уведомление об отмене.

Если в течение 48 часов вы не подтвердите или отклоните отмену, заказ будет отменен автоматически.

|**⚙️ Лимит:** 500 запросов в час|
|-|"
  [campaignId int?, orderId int?, accept-order-cancellation-request accept-order-cancellation-request]
  (let [res (:data (accept-order-cancellation-with-http-info campaignId orderId accept-order-cancellation-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
       res)))


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


(defn-spec provide-order-digital-codes-with-http-info any?
  "Передача ключей цифровых товаров
  Передает ключи цифровых товаров, которые покупатель заказал и оплатил. После выполнения запроса Маркет отправит ему письмо с ключами и инструкциями по активации, а также переведет заказ в финальный статус `DELIVERED`.

Ключ нужно передать в течение 30 минут после перехода заказа в статус `PROCESSING`.

Если в один заказ входят несколько ключей, передавайте их все в одном запросе.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, provide-order-digital-codes-request provide-order-digital-codes-request]
  (check-required-params campaignId orderId provide-order-digital-codes-request)
  (call-api "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods" :post
            {:path-params   {"campaignId" campaignId "orderId" orderId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    provide-order-digital-codes-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["OAuth"]}))

(defn-spec provide-order-digital-codes empty-api-response-spec
  "Передача ключей цифровых товаров
  Передает ключи цифровых товаров, которые покупатель заказал и оплатил. После выполнения запроса Маркет отправит ему письмо с ключами и инструкциями по активации, а также переведет заказ в финальный статус `DELIVERED`.

Ключ нужно передать в течение 30 минут после перехода заказа в статус `PROCESSING`.

Если в один заказ входят несколько ключей, передавайте их все в одном запросе.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|"
  [campaignId int?, orderId int?, provide-order-digital-codes-request provide-order-digital-codes-request]
  (let [res (:data (provide-order-digital-codes-with-http-info campaignId orderId provide-order-digital-codes-request))]
    (if (:decode-models *api-context*)
       (st/decode empty-api-response-spec res st/string-transformer)
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


