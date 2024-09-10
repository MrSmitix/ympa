-module(ympa_erlang_client_report_info_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_report_info_dto/0]).

-type ympa_erlang_client_report_info_dto() ::
    #{ 'status' := ympa_erlang_client_report_status_type:ympa_erlang_client_report_status_type(),
       'subStatus' => ympa_erlang_client_report_sub_status_type:ympa_erlang_client_report_sub_status_type(),
       'generationRequestedAt' := ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'generationFinishedAt' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'file' => binary(),
       'estimatedGenerationTime' => integer()
     }.

encode(#{ 'status' := Status,
          'subStatus' := SubStatus,
          'generationRequestedAt' := GenerationRequestedAt,
          'generationFinishedAt' := GenerationFinishedAt,
          'file' := File,
          'estimatedGenerationTime' := EstimatedGenerationTime
        }) ->
    #{ 'status' => Status,
       'subStatus' => SubStatus,
       'generationRequestedAt' => GenerationRequestedAt,
       'generationFinishedAt' => GenerationFinishedAt,
       'file' => File,
       'estimatedGenerationTime' => EstimatedGenerationTime
     }.
