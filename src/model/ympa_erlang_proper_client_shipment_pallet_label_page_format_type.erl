-module(ympa_erlang_proper_client_shipment_pallet_label_page_format_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_shipment_pallet_label_page_format_type/0]).

-export_type([ympa_erlang_proper_client_shipment_pallet_label_page_format_type/0]).

-type ympa_erlang_proper_client_shipment_pallet_label_page_format_type() ::
  binary().

ympa_erlang_proper_client_shipment_pallet_label_page_format_type() ->
  elements([<<"A4">>, <<"A8">>]).

