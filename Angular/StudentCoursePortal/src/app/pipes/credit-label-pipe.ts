import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'creditLabel'
})
export class CreditLabelPipe implements PipeTransform {

  transform(value: number | null): string {

    if (value === null || value === 0) {
      return 'No Credits';
    }

    if (value === 1) {
      return '1 Credit';
    }

    return `${value} Credits`;
  }

}
