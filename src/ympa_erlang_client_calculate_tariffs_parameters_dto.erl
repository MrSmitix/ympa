-module(ympa_erlang_client_calculate_tariffs_parameters_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_calculate_tariffs_parameters_dto/0]).

-type ympa_erlang_client_calculate_tariffs_parameters_dto() ::
    #{ 'campaignId' => integer(),
       'sellingProgram' => ympa_erlang_client_selling_program_type:ympa_erlang_client_selling_program_type(),
       'frequency' => ympa_erlang_client_payment_frequency_type:ympa_erlang_client_payment_frequency_type()
     }.

encode(#{ 'campaignId' := CampaignId,
          'sellingProgram' := SellingProgram,
          'frequency' := Frequency
        }) ->
    #{ 'campaignId' => CampaignId,
       'sellingProgram' => SellingProgram,
       'frequency' => Frequency
     }.
