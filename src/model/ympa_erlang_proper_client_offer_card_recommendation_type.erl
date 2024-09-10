-module(ympa_erlang_proper_client_offer_card_recommendation_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_card_recommendation_type/0]).

-export_type([ympa_erlang_proper_client_offer_card_recommendation_type/0]).

-type ympa_erlang_proper_client_offer_card_recommendation_type() ::
  binary().

ympa_erlang_proper_client_offer_card_recommendation_type() ->
  elements([<<"HAS_VIDEO">>, <<"RECOGNIZED_VENDOR">>, <<"MAIN">>, <<"ADDITIONAL">>, <<"DISTINCTIVE">>, <<"FILTERABLE">>, <<"PICTURE_COUNT">>, <<"HAS_DESCRIPTION">>, <<"HAS_BARCODE">>, <<"FIRST_PICTURE_SIZE">>, <<"TITLE_LENGTH">>, <<"DESCRIPTION_LENGTH">>, <<"AVERAGE_PICTURE_SIZE">>, <<"FIRST_VIDEO_SIZE">>, <<"FIRST_VIDEO_LENGTH">>, <<"AVERAGE_VIDEO_SIZE">>, <<"VIDEO_COUNT">>]).

