/* tslint:disable */
/* eslint-disable */
// Generated using typescript-generator version 3.2.1263 on 2023-05-23 15:26:38.

declare module "example-module" {

    interface ExampleDto {
        id: string;
        volume?: number;
        anEnum: ExampleEnum;
        created: Date;
        fields: Record<string, string>;
    }

    type ExampleEnum = "FIRST" | "SECOND";

}
